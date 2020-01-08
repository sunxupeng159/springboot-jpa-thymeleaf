package com.sunxupeng.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "tb_user")

    public class User {
     @Id
     @GeneratedValue
    private Long id;
    @Column(name = "age",length = 4,nullable = true)
    private Integer age;
    @Column(name = "name",length = 100,nullable = false)
    private String name;

}
