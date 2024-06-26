package com.example.client.service;

import com.example.client.model.CustomerDetailsModel;
import com.example.client.repository.CustomerDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerDetailsServiceImp implements CustomerDetailsService {

    @Autowired
    private CustomerDetailsRepo customerDetailsRepo;
    @Override
    public void saveCustomerDetailsService(CustomerDetailsModel custModel) {
        customerDetailsRepo.save(custModel);

    }

    @Override
    public Optional<CustomerDetailsModel> getCustomerDetailsService(Integer custId) {

      Optional<CustomerDetailsModel> response =  customerDetailsRepo.findById(custId);

      return response;
    }
}
