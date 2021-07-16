package com.backend.basic.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * description: response format
 *
 * @author Richy
 * create: 2021-07-06 16:06
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBean<T> implements Serializable {

    private int code;
    private String msg;
    private T data;

}