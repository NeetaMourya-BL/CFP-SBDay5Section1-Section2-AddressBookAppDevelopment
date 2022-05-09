package com.bridgelabz.day5addressbookappdevelopment.controller;

import com.bridgelabz.day5addressbookappdevelopment.dto.AddressBookDTO;
import com.bridgelabz.day5addressbookappdevelopment.dto.ResponseDTO;
import com.bridgelabz.day5addressbookappdevelopment.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @RequestMapping(value= {"","/","get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,new AddressBookDTO("Neeta", "Mourya", "Dayalband", "Bilaspur", "Chattisgarh", 495001, "8269068794", "neeta.mourya@bridgelabz.com"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,new AddressBookDTO("Neeta", "Mourya", "Dayalband", "Bilaspur", "Chattisgarh", 495001, "8269068794", "neeta.mourya@bridgelabz.com"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id:", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(3,addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee payroll data for:", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(3, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Update Employee payroll Data for: ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookdata(@PathVariable("personId") int personId){
        ResponseDTO responseDTO = new ResponseDTO("Delete Call Success for id: ", "personId "+personId);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

}