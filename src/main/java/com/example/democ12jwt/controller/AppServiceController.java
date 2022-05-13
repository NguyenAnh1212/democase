package com.example.democ12jwt.controller;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.service.appServiceS.IAppServiceS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/app_service")
@CrossOrigin("*")
public class AppServiceController {
    @Autowired
    private IAppServiceS appServiceS;

    @GetMapping
    public ResponseEntity<Iterable<AppService>> findAll(){
        Iterable<AppService> appServices = appServiceS.findAll();
        return new ResponseEntity<>(appServices, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AppService> findById(@PathVariable Long id){
        AppService appService = appServiceS.findById(id).get();
        return new ResponseEntity<>(appService, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AppService> saveAppService(@RequestBody AppService appService){
        return new ResponseEntity<>(appServiceS.save(appService),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppService> updateAppService(@PathVariable Long id, @RequestBody AppService appService){
        Optional<AppService> appServiceOptional = appServiceS.findById(id);
        appService.setId(appServiceOptional.get().getId());
        if (!appServiceOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        appServiceS.save(appService);
        return new ResponseEntity<>(appServiceOptional.get(),HttpStatus.OK);
//        appService.setId(id);
//        appServiceService.save(appService);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AppService> deleteAppService(@PathVariable Long id){
        AppService appService = appServiceS.findById(id).get();
        if (appService!= null) appServiceS.remove(id);
        return new ResponseEntity<>(appService, HttpStatus.OK);
    }




}
