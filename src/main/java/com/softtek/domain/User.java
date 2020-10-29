package com.softtek.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data //Getter Setter
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
@ToString //toString方法
public class User implements Serializable {

    private Integer id;

    private String username;

    private String sex;
}
