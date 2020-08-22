package com.qf.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

@Data
@ApiModel( "用户")
public class User {
    @ApiModelProperty("用户编号")
    private Integer id;
    @ApiModelProperty("手机号")
    private String tel;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("邀请码")
    private String invitation;

    public User(Integer id, String tel, String password, String email, String invitation) {
        this.id = id;
        this.tel = tel;
        this.password = password;
        this.email = email;
        this.invitation = invitation;
    }

    public User(String tel, String password) {
        this.tel = tel;
        this.password = password;
    }
}
