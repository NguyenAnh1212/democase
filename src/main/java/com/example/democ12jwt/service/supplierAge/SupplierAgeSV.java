package com.example.democ12jwt.service.supplierAge;

import com.example.democ12jwt.model.supplier_age.SupplierAge;
import com.example.democ12jwt.repo.ISupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SupplierAgeSV implements ISupplierAgeSV{
    @Autowired
    ISupplierRepository supplierAgeRepo;
    @Override
    public Iterable<SupplierAge> findAll() {
        return null;
    }

    @Override
    public Optional<SupplierAge> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public SupplierAge save(SupplierAge supplierAge) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<SupplierAge> getByAge(Long age) {
        return supplierAgeRepo.getByAge(age);
    }

    @Override
    public Iterable<SupplierAge> getSupplierByAgeBetween(Long age1, Long age2) {
        return supplierAgeRepo.getSupplierByAgeBetween(age1, age2);
    }

    @Override
    public Iterable<SupplierAge> getSupplierByMultilCondition(Long age1, Long age2, Long idG, Long idAd) {
        return supplierAgeRepo.getSupplierByMultilCondition(age1, age2, idG, idAd);
    }
}
