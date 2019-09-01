package com.shawn.member.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String name;
    private String phone;
}
