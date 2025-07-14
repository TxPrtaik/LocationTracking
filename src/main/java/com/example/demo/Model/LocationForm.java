package com.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LocationForm {
@Id
private String id;
private String name;
private String mobile;
private String address;
private String longitude;
private String latitude;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
@Override
public String toString() {
	return "LocationForm [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + ", longitude="
			+ longitude + ", latitude=" + latitude + "]";
}

}
