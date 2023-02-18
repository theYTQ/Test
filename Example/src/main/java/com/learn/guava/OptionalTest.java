package com.learn.guava;

import com.google.common.base.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        User user = new User();
        User userNull = null;
        Optional<User> possible = Optional.fromNullable(user);
        Optional<User> possible2 = Optional.fromNullable(userNull);
        boolean present = possible2.isPresent();
        //User u = possible2.get();
    }

}
