package com.example.democ12jwt.repo;

import com.example.democ12jwt.model.AppService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppServiceRepository extends CrudRepository<AppService, Long> {
}
