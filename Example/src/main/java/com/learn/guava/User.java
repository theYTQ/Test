package com.learn.guava;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    int id;
    String name;
    int age;

    public static List<User> createUserList() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "A", 10));
        list.add(new User(2, "B", 20));
        list.add(new User(3, "C", 30));
        return list;
    }
}
