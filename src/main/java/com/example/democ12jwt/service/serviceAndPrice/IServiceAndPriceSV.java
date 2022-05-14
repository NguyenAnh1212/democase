package com.example.democ12jwt.service.serviceAndPrice;

import com.example.democ12jwt.model.svAndP.ServiceAndPrice;
import com.example.democ12jwt.service.IGeneralService;


public interface IServiceAndPriceSV extends IGeneralService<ServiceAndPrice> {
    Iterable<ServiceAndPrice> getNameAndPrice(Long idSp);

}
