package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LocationForm;
import com.example.demo.Services.FormService;

@RestController
public class HomeController {
@Autowired
private FormService fs;
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	@CrossOrigin
	@GetMapping("/get-data")
	public List<LocationForm> getData() {
		return fs.getFormList();
	}
	@CrossOrigin
	@PostMapping("/save-form")
	public String saveForm(@RequestBody LocationForm lf) {
		fs.saveForm(lf);
		return "done";
	}
	@CrossOrigin
	@GetMapping("/get-track/{id}")
	public LocationForm getLocationById(@PathVariable String id) {
		return fs.getFormById(id);
	}
}
