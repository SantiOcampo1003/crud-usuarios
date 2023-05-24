package com.example.crudRapido.controller;

import com.example.crudRapido.entity.Student;
import com.example.crudRapido.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
   private StudentService studentService;
    @GetMapping
    public List<Student> getALL(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }
    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
         studentService.saveOrUpdate(student);
         return student;
    }


        @PutMapping("/{studentId}")
        public Student actualizarRecurso (@PathVariable("studentId") Long santi ,@RequestBody Student student){
         student.setId(santi);
          studentService.saveOrUpdate(student);
            return student;
        }

    @DeleteMapping("/{studentId}")
    public void delete (@PathVariable("studentId") Long studentId){
        studentService.delete(studentId);
    }

}
