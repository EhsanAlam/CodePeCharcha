package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.model.Response;
import com.cpc.CodePeCharcha.model.Student;
import com.cpc.CodePeCharcha.model.StudentComment;
import com.cpc.CodePeCharcha.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/getStudentById/{id}")
    public Response<Student> getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @PostMapping("/comment")
    public String addStudentComment(@RequestBody StudentComment studentComment) {
        return studentService.addStudentComment(studentComment);
    }
}
