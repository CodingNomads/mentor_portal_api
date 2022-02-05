package com.codingnomads.mentor_portal_api.controller

import com.codingnomads.mentor_portal_api.entity.business.Student
import com.codingnomads.mentor_portal_api.handler.StudentHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class StudentController (@Autowired private val studentHandler: StudentHandler) {
    /**
     * Get all students
     */
    @GetMapping("/students")
    fun getStudents(): List<Student> = studentHandler.getStudents()

    /**
     * Get student by Id
     */
    @GetMapping("/students/{studentId}")
    fun getStudentById(@PathVariable studentId: Int): Student = studentHandler.getStudentById(studentId)
}