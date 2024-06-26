package com.example.client.configuration;

import com.example.client.model.BusRouteDetailsModel;
import com.example.client.model.CustomerDetailsModel;
import com.example.client.response.ApiResponse;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/*
@FeignClient(name = "booking-bus-ticket-service",url = "localhost:9082")
@LoadBalancerClient(name = "booking-bus-ticket-service",configuration=LoadBalancerConfiguration.class)
public interface CustomerService {

    @RequestMapping(value = "/BusRoute/getBusRouteDetails", method = RequestMethod.GET)
    public Optional<BusRouteDetailsModel> getBusRouteDetails(@RequestParam Integer busRouteId);
}
*/
