package com.bridgelabz.day5addressbookappdevelopment.service;

import java.util.List;

import com.bridgelabz.day5addressbookappdevelopment.dto.AddressBookDTO;
import com.bridgelabz.day5addressbookappdevelopment.model.AddressBookData;
public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int personId);
}
