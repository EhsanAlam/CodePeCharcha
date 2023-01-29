package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.service.InstructorService;
import com.cpc.CodePeCharcha.model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class InstructorController {
    @Autowired
    InstructorService is;

    @PostMapping("/add")
    public String addInstructor(@RequestBody Instructor instructor){

        return is.addInstructor(instructor);

    }

    @GetMapping("/table")
    public Collection<Instructor> getAllInstructor(){
        return is.getAllInstructor();
    }

    @GetMapping("/getInstructorById/{id}")
    public Instructor getInstructorById(@PathVariable int id){
        return is.getInstructorById(id);
    }

    @DeleteMapping("/deleteInstructorById/{id}")
    public String deleteInstructorById(@PathVariable int id ){
        return is.deleteInstructorById(id);

    }

    @PutMapping ("/updateInstructor")
    public String update(@RequestBody Instructor instructor) {
        return is.updateInstructor(instructor);

    }



}
