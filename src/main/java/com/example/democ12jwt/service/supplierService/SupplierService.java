package com.example.democ12jwt.service.supplierService;

import com.example.democ12jwt.model.Supplier;
import com.example.democ12jwt.repo.ISupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SupplierService implements ISupplierService{

    @Autowired
    private ISupplierRepository supplierRepository;

    @Override
    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> findById(Long id) {
        return supplierRepository.findById(id);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public void remove(Long id) {
        supplierRepository.deleteById(id);
    }
}
