package com.example.day_2_part_2.controller;

import com.example.day_2_part_2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList getStudent(){
        StudentModel student1= new StudentModel(1,"abc@gamil.com","abc") ;
        StudentModel student2= new StudentModel(2,"prakhar@gamil.com","prakhar") ;
        StudentModel student3= new StudentModel(3,"nitin@gamil.com","nitin") ;
        StudentModel student4= new StudentModel(4,"aditya@gamil.com","aditya") ;
        StudentModel student5= new StudentModel(5,"moksh@gamil.com","moksh") ;

        ArrayList<StudentModel> list= new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;
    }

}
