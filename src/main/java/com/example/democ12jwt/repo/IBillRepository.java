package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBillRepository extends CrudRepository<Bill, Long> {
}
