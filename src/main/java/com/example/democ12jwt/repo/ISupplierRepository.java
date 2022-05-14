package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.model.svAndP.ServiceAndPrice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupplierRepository extends CrudRepository<Supplier, Long> {

    @Query(nativeQuery = true, value = "select p.id as id, s.name as name, p.price as price from suppliers join supplier_service ss on suppliers.id = ss.supplier_id\n" +
            "join price p on ss.service_id = p.service_id and ss.supplier_id = p.supplier_id\n" +
            "join services s on ss.service_id = s.id where suppliers.id=?;")
    Iterable<ServiceAndPrice> getNameAndPrice(Long idSp);
}


