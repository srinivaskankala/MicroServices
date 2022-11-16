package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Enquiry")

@AllArgsConstructor
@NoArgsConstructor
public class Enquiry {

    @Id
    private int enquiryId;
    private String enquiryDescription;
    private int employeeId;


    public Enquiry(int enquiryId, String enquiryDescription) {
        this.enquiryId = enquiryId;
        this.enquiryDescription= enquiryDescription;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(int enquiryId) {
        this.enquiryId = enquiryId;
    }


    public String getEnquiryDescription() {
        return enquiryDescription;
    }

    public void setEnquiryDescription(String enquiryDescription) {
        this.enquiryDescription = enquiryDescription;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "enquiryId=" + enquiryId +
                ", enquiryDescription='" + enquiryDescription;
                }
    }

