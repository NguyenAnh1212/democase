package com.example.democ12jwt.service.priceAndIdSV;

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
        return Optional.empty();
    }

    @Override
    public PriceAndId save(PriceAndId priceAndId) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Optional<PriceAndIdSV> updatePriceById(double price, Long id) {
        return serviceAndIdRepo.updatePriceById(price, id);
    }
}
