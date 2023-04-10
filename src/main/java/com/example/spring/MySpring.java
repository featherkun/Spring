package com.example.spring;


import com.example.spring.configure.Configure;

public class MySpring {
    public static void main(String[] args) throws Exception {
        SpringApplicationContext springApplicationContext = new SpringApplicationContext(Configure.class);

    }
}
