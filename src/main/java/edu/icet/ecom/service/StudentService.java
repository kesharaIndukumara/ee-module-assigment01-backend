package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.Student;
import edu.icet.ecom.model.entity.StudentEntity;
import edu.icet.ecom.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student> getAll(){

        List<StudentEntity> studentEntities = repository.findAll();
        List<Student> students = new ArrayList<>();

        for(StudentEntity studentEntity : studentEntities){
            Student student = new Student();

            student.setId(studentEntity.getId());
            student.setName(studentEntity.getName());
            student.setAddress(studentEntity.getAddress());
            student.setAge(studentEntity.getAge());

            students.add(student);
        }
        return students;
    }

    public void add(Student student){
        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setAge(student.getAge());
        studentEntity.setPassword(studentEntity.getPassword());

        repository.save(studentEntity);
    }
}
