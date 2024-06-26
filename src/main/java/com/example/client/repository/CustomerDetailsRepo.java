package com.example.client.repository;

import com.example.client.model.CustomerDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetailsModel,Integer> {


}
