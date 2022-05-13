package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.Gender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenderRepository extends CrudRepository<Gender, Long> {
}
