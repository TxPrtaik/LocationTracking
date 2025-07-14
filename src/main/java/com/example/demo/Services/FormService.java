package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LocationForm;
import com.example.demo.Repository.FormRepo;

@Service
public class FormService {
@Autowired
private FormRepo fr;

public void saveForm(LocationForm lf) {
	fr.save(lf);
}
public List<LocationForm> getFormList(){
return fr.findAll();
}
public LocationForm getFormById(String id) {
	Optional<LocationForm> olf=fr.findById(id);
return olf.get();
}
}
