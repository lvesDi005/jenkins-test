package com.longchenx.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    // jenkins demo
    public String getJenkinsDemo() {
        return "jenkins demo";
    }
    public String getJenkinsDemo2() {
        return "jenkins demo2";
    }
    public String getJenkinsDemo3() {
        return "jenkins demo3";
    }

}
