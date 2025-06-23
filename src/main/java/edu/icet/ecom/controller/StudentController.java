package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.Student;
import edu.icet.ecom.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getAll(){
        return service.getAll();
    }

    @PostMapping("/add-student")
    public void add(@RequestBody Student student){
        service.add(student);
    }
}
