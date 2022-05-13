package com.example.democ12jwt.controller;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.service.appServiceS.IAppServiceS;
import com.example.democ12jwt.service.priceService.IPriceService;
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

    @GetMapping
    public ResponseEntity<Iterable<Price>> findAll(){
        Iterable<Price> prices = priceService.findAll();
        return new ResponseEntity<>(prices, HttpStatus.OK);
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

    @PostMapping
    public ResponseEntity<Price> savePrice(@RequestBody Price price){
        return new ResponseEntity<>(priceService.save(price), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Price> updatePrice(@PathVariable Long id, @RequestBody Price price){
        Optional<Price> priceOptional = priceService.findById(id);
        price.setId(priceOptional.get().getId());
        if (!priceOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        priceService.save(price);
        return new ResponseEntity<>(priceOptional.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Price> deletePrice(@PathVariable Long id){
        Price price = priceService.findById(id).get();
        if (price!=null) priceService.remove(id);
        return new ResponseEntity<>(price, HttpStatus.OK);}


}
