package com.bridgelabz.day5addressbookappdevelopment.service;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.day5addressbookappdevelopment.dto.AddressBookDTO;
import com.bridgelabz.day5addressbookappdevelopment.model.AddressBookData;

public class AddressBookService implements IAddressBookService {

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> personDataList = new ArrayList<>();
        personDataList.add(new AddressBookData(1,new AddressBookDTO("Neeta", "Mourya", "Dayalband", "Bilaspur", "Chattisgarh", 495001, "8269068794", "neeta.mourya@bridgelabz.com")));
        return personDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO("Neeta", "Mourya", "Dayalband", "Bilaspur", "Chattisgarh", 495001, "8269068794", "neeta.mourya@bridgelabz.com"));
        return personData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1,addressBookDTO);
        return personData;
    }

    @Override
    public AddressBookData updateAddressBookData(int employeeId, AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1,addressBookDTO);
        return personData;
    }

    @Override
    public void deleteAddressBookData(int personId) {

    }

}