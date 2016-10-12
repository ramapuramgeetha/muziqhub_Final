package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.Address;

public interface AddressDAO {
    public List<Address> list();
    
    public Address get(String Addid);
     
    public void saveOrUpdate(Address address);
     
    public void delete(String Addid);
}
