package com.example.democ12jwt.service.priceAndIdSV;

import com.example.democ12jwt.model.priceAndId.PriceAndId;
import com.example.democ12jwt.service.IGeneralService;

import java.util.Optional;

public interface IPriceAndIdSV extends IGeneralService<PriceAndId> {

    Optional<PriceAndId> findById(Long id);

    Optional<PriceAndId> updatePriceById(Long id, double price);
}
