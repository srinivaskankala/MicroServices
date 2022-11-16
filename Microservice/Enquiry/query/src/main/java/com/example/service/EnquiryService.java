package com.example.service;

import com.example.entity.Enquiry;
import com.example.repository.EnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnquiryService {
    @Autowired
    public EnquiryRepository enquiryRepository;

    public Enquiry enquiry(Enquiry enquiry){
        return enquiryRepository.save(enquiry);

    }


    public List<Enquiry> allEnquiry(){
        return enquiryRepository.findAll();

    }
    public Enquiry getByEmployeeId(Integer employeeId){
        return enquiryRepository.findById(employeeId).orElse(null);

    }
}
