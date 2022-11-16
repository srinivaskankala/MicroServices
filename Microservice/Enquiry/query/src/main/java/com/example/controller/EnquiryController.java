package com.example.controller;

import com.example.enquiry.response.EmployeeResponse;
import com.example.enquiry.response.EnquiryResponse;
import com.example.entity.Enquiry;
import com.example.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
        //@RequestMapping(value = "/emp")
public class EnquiryController {
    @Autowired
    public EnquiryService enquiryService;
    @Autowired
    public RestTemplate restTemplate;
    @PostMapping(value = "/enquiry", consumes = "application/json")
    public Enquiry enquiries(@RequestBody Enquiry enquiry){

        return enquiryService.enquiry(enquiry);
    }

    @GetMapping(value = "/allenquiry")
    public List<EnquiryResponse> allEnquiries() {
        String url = "http://localhost:9192/employees";
       EmployeeResponse[] employee = restTemplate.getForObject(url, EmployeeResponse[].class);
       List<EnquiryResponse> enquiryResponseList=new ArrayList<>();
        for (EmployeeResponse e : employee) {
            int empId1 =e.getEmployeeId();

            Enquiry enquiry=enquiryService.getByEmployeeId(empId1);
            System.out.println(enquiry);

            System.out.println(e);
            enquiryResponseList.add(new EnquiryResponse(empId1,e.getEmployeeName(),enquiry.getEnquiryId(),enquiry.getEnquiryDescription()));
       //EnquiryResponse
        }
            return enquiryResponseList;


    }


    @GetMapping(value = "/test", consumes = "application/json")
    public void test(){
        System.out.println("Test Controller");
    }
}
