package com.example.client.response;

public class CustomerDetailsResponse {

    private Integer id;

    private String customerLoginId;

    private String customerName;

    private String customerPass;

    private String customerMobNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerLoginId() {
        return customerLoginId;
    }

    public void setCustomerLoginId(String customerLoginId) {
        this.customerLoginId = customerLoginId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerMobNo() {
        return customerMobNo;
    }

    public void setCustomerMobNo(String customerMobNo) {
        this.customerMobNo = customerMobNo;
    }

    @Override
    public String toString() {
        return "CustomerDetailsResponse{" +
                "id=" + id +
                ", customerLoginId='" + customerLoginId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPass='" + customerPass + '\'' +
                ", customerMobNo='" + customerMobNo + '\'' +
                '}';
    }
}
