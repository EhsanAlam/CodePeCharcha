package com.cpc.CodePeCharcha.service;

import com.cpc.CodePeCharcha.model.Response;
import com.cpc.CodePeCharcha.model.Student;
import com.cpc.CodePeCharcha.model.StudentComment;
import com.cpc.CodePeCharcha.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    EmailServiceImpl emailService;

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);

    }

    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    public Response<Student> getStudentById(String id) {
        Response<Student> response=new Response<>();
        Student student=studentRepository.getStudentById(id);

        if (student!=null){
            response.setData(student);
            response.setMassage("found student data");
        }else{
            response.setMassage("student is not present for the given id ");
        }
          return response;
    }

    public String deleteStudent(String id) {
          Response response= getStudentById(id);
          if(response.getData()==null){
              return "This id is not exists";
          }
         return studentRepository.deleteStudent(id);
    }

    public String updateStudent(Student student) {
        String id = student.getStudentId();
        Student s= studentRepository.getStudentById(id);
        if(s==null){
            return "this student is not exists";
        }
        return studentRepository.updateStudent(student);
    }
    public String addStudentComment(StudentComment studentComment){
        String resMessage = studentRepository.addStudentComment(studentComment);
        String emailId = studentRepository.getEmail(studentComment.getStudentId());
        emailService.sendSimpleMessage(emailId,"Response from CodePeCharcha",resMessage);
        return "Response has been sent on your email Id, please check your email";
    }

}
