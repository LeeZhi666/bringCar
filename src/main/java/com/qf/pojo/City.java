package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("城市")
public class City {
    @ApiModelProperty("编号")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("地点编号")
    private Integer pid;
}
