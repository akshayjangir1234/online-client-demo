package com.example.client.controller;
import com.example.client.constant.ApiStatus;
import com.example.client.model.BusRouteDetailsModel;
import com.example.client.response.ApiResponse;
import com.example.client.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/Api/busroute")
public class CallBusApiController {

    @Autowired
    private CustomerDetailsService customerService;

   /* @RequestMapping(value = "/getbusDetails", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse> getBusRoute(@RequestParam Integer busId) {
        if (busId == null) {
            return new ResponseEntity<ApiResponse>(HttpStatus.BAD_REQUEST);
        }
        Optional<BusRouteDetailsModel> response = customerService.;
        return new ResponseEntity<ApiResponse>(new ApiResponse(ApiStatus.SUCCESS, "fatched bus route" ,response), HttpStatus.OK);

    }*/
}
