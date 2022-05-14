package com.example.democ12jwt.repo;


import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.model.Price;
import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.model.svAndP.ServiceAndPrice;
import com.example.democ12jwt.service.priceAndIdSV.PriceAndIdSV;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface IPriceRepository extends CrudRepository<Price, Long> {
    Optional<Price> findByAppServiceAndSupplier(AppService appService, Supplier supplier);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "update price set price = :price where id = :id;")
    Optional<PriceAndIdSV> updatePriceById(double price, Long id);
}
