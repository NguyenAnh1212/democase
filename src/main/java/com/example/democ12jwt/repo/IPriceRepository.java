package com.example.democ12jwt.repo;


import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;
import com.example.democ12jwt.model.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPriceRepository extends CrudRepository<Price, Long> {
    Optional<Price> findByAppServiceAndSupplier(AppService appService, Supplier supplier);
}
