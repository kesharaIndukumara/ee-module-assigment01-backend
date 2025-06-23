package edu.icet.ecom.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private String password;
}
