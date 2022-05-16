package com.example.democ12jwt.service.supplierAge;

import com.example.democ12jwt.model.supplier_age.SupplierAge;
import com.example.democ12jwt.service.IGeneralService;

import java.util.Optional;

public interface ISupplierAgeSV extends IGeneralService<SupplierAge> {
    Iterable<SupplierAge> getByAge(Long age);
    Iterable<SupplierAge> getSupplierByAgeBetween(Long age1, Long age2);

    Iterable<SupplierAge> getSupplierByMultilCondition(Long age1, Long age2, Long idG, Long idAd);

}
