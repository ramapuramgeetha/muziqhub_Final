package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Address;

public interface AddressService {
    public List<Address> list();
    
    public Address get(String Addid);
     
    public void saveOrUpdate(Address address);
     
    public void delete(String Addid);
}
