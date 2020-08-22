package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("车")
public class Car {
    @ApiModelProperty("编号")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("类型")
    private String type;
    @ApiModelProperty("座位数")
    private Integer sitNum;
    @ApiModelProperty("城市编号")
    private Integer cId;
    @ApiModelProperty("价格")
    private Double price;
    @ApiModelProperty("数量")
    private Integer number;
    @ApiModelProperty("图片位子")
    private String picture;
}
