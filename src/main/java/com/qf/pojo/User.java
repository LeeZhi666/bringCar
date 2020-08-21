package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class User {

    private Integer id;
    private String tel;
    private String password;
    private String email;
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
