package com.example.democ12jwt.service.priceService;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;
import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.service.IGeneralService;

import java.util.Optional;

public interface IPriceService extends IGeneralService<Price> {
    Optional<Price> getPriceBySerAndSup(AppService appService, Supplier supplier);



}
