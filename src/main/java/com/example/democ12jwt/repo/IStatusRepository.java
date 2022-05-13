package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.AppStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatusRepository extends CrudRepository<AppStatus, Long> {
}
