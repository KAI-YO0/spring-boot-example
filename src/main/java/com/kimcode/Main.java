package com.kimcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController

// define @SpringBootApplication's 1 on 3 define
//@ComponentScan(basePackages = "com.kimcode")
//@EnableAutoConfiguration
//@Configuration

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetRespone greet(){
        GreetRespone respone = new GreetRespone(
                "Hello",
                List.of("Java" , "Golang" , "Javascript"),
                new Person("Alex" , 28 , 30_000)
        );
        return respone;
    }

    record Person (String name , int age , double savings){

    }

    record GreetRespone(
            String greet,
            List<String> favProgrammingLanguages,
            Person person ){}
//    class GreetRespone {
//        private final String greet;
//
//        GreetRespone(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetRespone{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetRespone that = (GreetRespone) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(greet);
//        }
//    }
}
