package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.model.supplier_age.SupplierAge;
import com.example.democ12jwt.model.svAndP.ServiceAndPrice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISupplierRepository extends CrudRepository<Supplier, Long> {

    @Query(nativeQuery = true, value = "select p.id as id, s.name as name, p.price as price from suppliers join supplier_service ss on suppliers.id = ss.supplier_id\n" +
            "join price p on ss.service_id = p.service_id and ss.supplier_id = p.supplier_id\n" +
            "join services s on ss.service_id = s.id where suppliers.id=?;")
    Iterable<ServiceAndPrice> getNameAndPrice(Long idSp);

    @Query(nativeQuery = true, value = "select name, image, age from suppliers where age >?;")
    Iterable<SupplierAge> getByAge(Long age);


    @Query(nativeQuery = true, value = "select name, image, age from suppliers where age between ? and ?;")
    Iterable<SupplierAge> getSupplierByAgeBetween(Long age1, Long age2);


    @Query(nativeQuery = true, value = "select suppliers.id, age, email, height, hobby, image, name, note, personal, phone, weight, status_id, address, gender  from suppliers join address a on a.id = suppliers.address_id\n" +
        "join genders g on g.id = suppliers.gender_id\n" +
        "where age between ? and ? and gender_id = ? and address_id = ?;")
    Iterable<SupplierAge> getSupplierByMultilCondition(Long age1, Long age2, Long idG, Long idAd);


}


