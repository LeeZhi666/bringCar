package com.qf.pojo;

import lombok.Data;


public class Order {
    private Integer id;
    private Integer cid;
    private Integer uid;
    private Integer getId;
    private Integer backId;
    private Double price;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGetId() {
        return getId;
    }

    public void setGetId(Integer getId) {
        this.getId = getId;
    }

    public Integer getBackId() {
        return backId;
    }

    public void setBackId(Integer backId) {
        this.backId = backId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(Integer cid, Integer uid, Integer getId, Integer backId, Double price, String status) {

        this.cid = cid;
        this.uid = uid;
        this.getId = getId;
        this.backId = backId;
        this.price = price;
        this.status = status;
    }
}
