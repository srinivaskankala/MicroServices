package com.example.enquiry.response;

public class EnquiryResponse {
    private int employeeId;
    private String employeeName;
    private int enquiryId;
    private String enquiryDescription;

    public EnquiryResponse(int employeeId, String employeeName, int enquiryId, String enquiryDescription) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.enquiryId = enquiryId;
        this.enquiryDescription = enquiryDescription;
    }

    public String getEnquiryDescription() {
        return enquiryDescription;
    }

    public void setEnquiryDescription(String enquiryDescription) {
        this.enquiryDescription = enquiryDescription;
    }

    public int getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(int enquiryId) {
        this.enquiryId = enquiryId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", enquiryId=" + enquiryId +
                ", enquiryDescription='" + enquiryDescription + '\'' +
                '}';
    }
}

