package com.example.democ12jwt.service.billService;

import com.example.democ12jwt.model.Bill;
import com.example.democ12jwt.repo.IBillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BillService implements IBillService{

    @Autowired
    private IBillRepository billRepository;


    @Override
    public Iterable<Bill> findAll() {
        return null;
    }

    @Override
    public Optional<Bill> findById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public Bill save(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public void remove(Long id) {
        billRepository.deleteById(id);
    }
}
