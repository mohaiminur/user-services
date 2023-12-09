package com.mohaiminur.userservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor@AllArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private UserType userType;
    private Long parentId;
    private Address address;

}
