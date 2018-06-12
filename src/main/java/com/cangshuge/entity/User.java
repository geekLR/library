package com.cangshuge.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //不用书写getter和setter
@Getter
@Setter
public class User {
    String account;
    String pwd;
    String mailbox;
    int member;
    String address;
    int credit;
    String name;
    String sex;
    Long birthday;
}
