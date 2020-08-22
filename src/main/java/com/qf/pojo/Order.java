package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("订单")
public class Order {
    @ApiModelProperty("编号")
    private Integer id;
    @ApiModelProperty("城市编号")
    private Integer cid;
    @ApiModelProperty("用户编号")
    private Integer uid;
    @ApiModelProperty("取车地编号")
    private Integer getId;
    @ApiModelProperty("还车地编号")
    private Integer backId;
    @ApiModelProperty("价格")
    private Double price;
    @ApiModelProperty("状态")
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
