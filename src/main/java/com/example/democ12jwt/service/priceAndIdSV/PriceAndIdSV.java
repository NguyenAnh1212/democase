package com.example.democ12jwt.service.priceAndIdSV;

import com.example.democ12jwt.model.Price;
import com.example.democ12jwt.model.priceAndId.PriceAndId;

import com.example.democ12jwt.repo.IPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PriceAndIdSV implements IPriceAndIdSV {
    @Autowired
    private IPriceRepository serviceAndIdRepo;

    @Override
    public Iterable<PriceAndId> findAll() {
        return null;
    }

    @Override
    public Optional<PriceAndId> findById(Long id) {
        return serviceAndIdRepo.findPriceByById(id);
    }

    @Override
    public PriceAndId save(PriceAndId priceAndId) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Optional<PriceAndId> updatePriceById(Long id, double price) {
        return serviceAndIdRepo.updatePriceById(id, price);
    }
}
