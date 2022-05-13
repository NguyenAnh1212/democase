package com.example.democ12jwt.service.appServiceS;

import com.example.democ12jwt.model.AppService;
import com.example.democ12jwt.repo.IAppServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppServiceS implements IAppServiceS {

    @Autowired
    private IAppServiceRepository appServiceRepository;
    @Override
    public Iterable<AppService> findAll() {
        return appServiceRepository.findAll();
    }

    @Override
    public Optional<AppService> findById(Long id) {
        return appServiceRepository.findById(id);
    }

    @Override
    public AppService save(AppService appService) {
        return appServiceRepository.save(appService);
    }

    @Override
    public void remove(Long id) {
        appServiceRepository.deleteById(id);
    }
}
