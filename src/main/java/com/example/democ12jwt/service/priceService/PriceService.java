package com.example.democ12jwt.service.priceService;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.repo.IPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PriceService implements IPriceService {


    @Autowired
    private IPriceRepository priceRepository;

    @Override
    public Optional<Price> getPriceBySerAndSup(AppService appService, Supplier supplier) {
        return priceRepository.findByAppServiceAndSupplier(appService, supplier);
    }

    @Override
    public Iterable<Price> findAll() {
        return priceRepository.findAll();
    }

    @Override
    public Optional<Price> findById(Long id) {
        return priceRepository.findById(id);
    }

    @Override
    public Price save(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public void remove(Long id) {
        priceRepository.deleteById(id);
    }
}
