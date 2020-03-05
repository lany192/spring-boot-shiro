package com.github.lany192.shiro.database;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserBean {
    private String username;
    private String password;
    private String role;
    private String permission;
}
