package com.cpc.CodePeCharcha.service;


import com.cpc.CodePeCharcha.model.Instructor;
import com.cpc.CodePeCharcha.model.User;
import com.cpc.CodePeCharcha.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    HashMap<Integer, Instructor> hi = new HashMap<>();

    public String addInstructor(Instructor instructor) {
        return instructorRepository.addInstructor(instructor);
    }

    public Collection<Instructor> getAllInstructor() {

        return instructorRepository.getAllInstructor();
    }

    public Instructor getInstructorById(int id) {
        return instructorRepository.getInstructorById(id);
    }

    public String deleteInstructorById(int id) {
        Instructor instructor = instructorRepository.getInstructorById(id);
        if (instructor == null) {
            return "Id is not present";
        }
        return instructorRepository.deleteInstructorById(id);
    }

    public String updateInstructor(Instructor instructor) {
        int id = instructor.getId();
        Instructor i = instructorRepository.getInstructorById(id);
        if (i == null) {
            return "this user is not exists";
        }
            return instructorRepository.updateInstructorById(instructor);


    }
}
