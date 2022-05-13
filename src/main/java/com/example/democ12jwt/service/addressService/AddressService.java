package com.example.democ12jwt.service.addressService;

import com.example.democ12jwt.model.Address;

import com.example.democ12jwt.repo.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressService implements IAddressService{

    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public Iterable<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void remove(Long id) {
        addressRepository.deleteById(id);
    }
}
