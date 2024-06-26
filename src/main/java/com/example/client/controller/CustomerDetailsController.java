package com.example.client.controller;


import com.example.client.constant.ApiStatus;
import com.example.client.model.BusRouteDetailsModel;
import com.example.client.model.CustomerDetailsModel;
import com.example.client.response.ApiResponse;
import com.example.client.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerDetailsService;



    @RequestMapping(value = "/saveCustomerDetails", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse> saveCustomerDetails(@RequestBody CustomerDetailsModel customerDetails) {
        if (customerDetails == null) {
            return new ResponseEntity<ApiResponse>(HttpStatus.BAD_REQUEST);
        }

        customerDetailsService.saveCustomerDetailsService(customerDetails);

        return new ResponseEntity<ApiResponse>(new ApiResponse(ApiStatus.SUCCESS, "Customer added"), HttpStatus.OK);

    }

    @RequestMapping(value = "/getCustomerDetails", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse> getCustomerDetails(@RequestParam Integer customerId) {
        if (customerId == null) {
            return new ResponseEntity<ApiResponse>(HttpStatus.BAD_REQUEST);
        }
       Optional<CustomerDetailsModel> response = customerDetailsService.getCustomerDetailsService(customerId);

        return new ResponseEntity<ApiResponse>(new ApiResponse(ApiStatus.SUCCESS, "response1" ,response ), HttpStatus.OK);

    }

}
