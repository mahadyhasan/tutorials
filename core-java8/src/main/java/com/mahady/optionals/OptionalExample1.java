package com.mahady.optionals;

import java.util.Optional;

/**
 * Created by Mahady Hasan on 01/08/16.
 */
public class OptionalExample1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        optional.isPresent(); // true
        optional.get(); // "hello"
        optional.orElse("no"); // "hello"

        optional.ifPresent(s -> System.out.println(s.charAt(0)));
    }
}
