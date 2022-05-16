package com.example.democ12jwt.controller;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.model.priceAndId.PriceAndId;
import com.example.democ12jwt.model.supplier_age.SupplierAge;
import com.example.democ12jwt.model.svAndP.ServiceAndPrice;
import com.example.democ12jwt.repo.ISupplierRepository;
import com.example.democ12jwt.service.appServiceS.IAppServiceS;
import com.example.democ12jwt.service.priceAndIdSV.IPriceAndIdSV;
import com.example.democ12jwt.service.priceService.IPriceService;
import com.example.democ12jwt.service.serviceAndPrice.IServiceAndPriceSV;
import com.example.democ12jwt.service.supplierAge.ISupplierAgeSV;
import com.example.democ12jwt.service.supplierService.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/price")
@CrossOrigin("*")
public class PriceController {
    @Autowired
    private IPriceService priceService;

    @Autowired
    private ISupplierService supplierService;
    @Autowired
    private IAppServiceS appServiceS;

    @Autowired
    private IPriceAndIdSV priceAndIdSV;


    @GetMapping
    public ResponseEntity<Iterable<Price>> findAll(){
        Iterable<Price> prices = priceService.findAll();
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Price> findPriceById(@PathVariable Long id){
        Price prices = priceService.findById(id).get();
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Price> deletePrice(@PathVariable Long id){
        Price price = priceService.findById(id).get();
        if (price!=null) priceService.remove(id);
        return new ResponseEntity<>(price, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Price> updatePrice(@PathVariable Long id, @RequestBody Price price){
        Optional<Price> priceOptional = priceService.findById(id);
        Long supplier_id = priceOptional.get().getSupplier().getId();
        Long service_id = priceOptional.get().getAppService().getId();
        Optional<Supplier> supplierOptional = supplierService.findById(supplier_id);
        Supplier updateSupplier = supplierOptional.get();
        Optional<AppService> serviceOptional = appServiceS.findById(service_id);
        AppService updateService = serviceOptional.get();
        Price updatePrice = new Price(id, price.getPrice(), updateSupplier, updateService);
        priceService.save(updatePrice);
        return new ResponseEntity<>(priceOptional.get(), HttpStatus.OK);
    }














//    @PostMapping
//    public ResponseEntity<Price> savePrice(@PathVariable Long sup_id,
//                                           @RequestBody Price price,
//                                           @RequestBody AppService appService){
//        Optional<Supplier> supplierOptional = supplierService.findById(sup_id);
//        Supplier supplier = supplierOptional.get();
//        supplierService.save(supplier);
//        appServiceS.save(appService);
//        priceService.save(price);
//        return new ResponseEntity<>(priceService.save(price), HttpStatus.CREATED);
//    }

    @PostMapping
    public ResponseEntity<Price> savePrice(@RequestBody Price price){
        return new ResponseEntity<>(priceService.save(price), HttpStatus.CREATED);
    }
















    @PostMapping("/updatePrice/{id}/{price}")
    public ResponseEntity<PriceAndId> updatePrice1(@PathVariable Long id, double price){
        Optional<PriceAndId> updatePrice = priceAndIdSV.updatePriceById(id, price);
        return new ResponseEntity<>(updatePrice.get(), HttpStatus.OK);
    }

    @GetMapping("/sup/{id1}/ser/{id2}")
    public ResponseEntity<Price> findBySupAndSer(@PathVariable("id1") Long sup_id,
                                                 @PathVariable("id2") Long ser_id){
        Optional<AppService> appService = appServiceS.findById(ser_id);
        Optional<Supplier> supplier = supplierService.findById(sup_id);
        Optional<Price> price = priceService.getPriceBySerAndSup(appService.get(), supplier.get());
        return new ResponseEntity<>(price.get(), HttpStatus.OK);
    }


    @GetMapping("/sup/{id1}/ser/{id2}/{price}")
    public ResponseEntity<Price> findById(@PathVariable("id1") Long sup_id,
                                          @PathVariable("id2") Long ser_id,
                                          @PathVariable("price") int price_new){
        Optional<AppService> appService = appServiceS.findById(ser_id);
        Optional<Supplier> supplier = supplierService.findById(sup_id);
        Optional<Price> price = priceService.getPriceBySerAndSup(appService.get(), supplier.get());
        price.get().setPrice(price_new);
        priceService.save(price.get());
        return new ResponseEntity<>(price.get(), HttpStatus.OK);
    }












}
