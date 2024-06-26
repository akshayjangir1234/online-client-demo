package com.example.client.service;

import com.example.client.model.CustomerDetailsModel;

import java.util.Optional;

public interface CustomerDetailsService {

    public void saveCustomerDetailsService(CustomerDetailsModel custModel);

    public Optional<CustomerDetailsModel> getCustomerDetailsService(Integer custId);
}
