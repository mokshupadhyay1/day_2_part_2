package com.example.day_2_part_2.controller;

import com.example.day_2_part_2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student= new StudentModel(1,"abc@gamil.com","abc") ;
         return student;
    }

}
