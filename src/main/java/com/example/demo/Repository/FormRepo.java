package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LocationForm;

@Repository
public interface FormRepo extends MongoRepository<LocationForm, String> {

}
