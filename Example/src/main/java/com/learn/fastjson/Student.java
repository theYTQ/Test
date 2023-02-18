package com.learn.fastjson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private String address;
}
