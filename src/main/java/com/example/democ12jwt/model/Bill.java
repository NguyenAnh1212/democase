package com.example.democ12jwt.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String billCode;

    private LocalDateTime time;
    @OneToOne
    @JoinColumn(name = "service_detail_id")
    private ServiceDetail serviceDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public ServiceDetail getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(ServiceDetail serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public Bill(String billCode, LocalDateTime time, ServiceDetail serviceDetail) {

        this.billCode = billCode;
        this.time = time;
        this.serviceDetail = serviceDetail;
    }

    public Bill(Long id, String billCode, LocalDateTime time, ServiceDetail serviceDetail) {

        this.id = id;
        this.billCode = billCode;
        this.time = time;
        this.serviceDetail = serviceDetail;
    }

    public Bill() {
    }
}
