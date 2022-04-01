package org.hero.miniblog.entity;

import lombok.*;

import java.time.LocalDate;

/**
 * @author henry
 * @description 用户
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
    private String realName;
    private Integer gender;
    private Integer age;
    private String email;
    private String phone;
    private String address;
    private LocalDate createTime;
    private LocalDate updateTime;
    private LocalDate deleteTime;

    public User(String id, String username, String password, String realName, Integer gender, Integer age, String email, String phone, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public User(String username, String password, String realName, Integer gender, Integer age, String email, String phone, String address) {
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
