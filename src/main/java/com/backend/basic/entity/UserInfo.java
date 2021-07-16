package com.backend.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: user info
 *
 * @author Richy
 * create: 2021-07-05 17:08
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer userId;
    private String userName;
}