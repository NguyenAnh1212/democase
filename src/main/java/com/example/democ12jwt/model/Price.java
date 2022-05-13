package com.example.democ12jwt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int price;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private AppService appService;
    public Price() {
    }

    public Price(int price, Supplier supplier, AppService appService) {
        this.price = price;
        this.supplier = supplier;
        this.appService = appService;
    }

    public Price(Long id, int price, Supplier supplier, AppService appService) {
        this.id = id;
        this.price = price;
        this.supplier = supplier;
        this.appService = appService;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public AppService getAppService() {
        return appService;
    }

    public void setAppService(AppService appService) {
        this.appService = appService;
    }
}
