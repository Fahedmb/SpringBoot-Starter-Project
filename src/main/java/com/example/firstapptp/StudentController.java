package com.example.firstapptp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //4. Build Spring Boot REST API returns Java Bean
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Ramesh", "Fadatare");
    }

    //5. Build Spring Boot REST API returns List
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Fadatare"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Jadhav"));
        students.add(new Student("Ram", "Jadhav"));
        students.add(new Student("Umesh", "Fadatare"));
        return students;
    }


    //6. Spring Boot REST API with Path Variable
    @GetMapping("/student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }


        //7. Build Spring Boot REST API with Request Param
        @GetMapping("/student/query")
        public Student studentQueryParam(
                @RequestParam(name = "firstName") String firstName,
                @RequestParam(name = "lastName") String lastName) {
            return new Student(firstName, lastName);
        }

}

