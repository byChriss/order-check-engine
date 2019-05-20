package io.codelex.ordercheckengine.api;

public class PrivateCustomer {
    private Long id;
    private Long idCardNo;
    private String regPlace;
    private Status status;


    public PrivateCustomer(Long id, Long idCardNo, String regPlace, Status status) {
        this.id = id;
        this.idCardNo = idCardNo;
        this.regPlace = regPlace;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(Long idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRegPlace() {
        return regPlace;
    }

    public void setRegPlace(String regPlace) {
        this.regPlace = regPlace;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
