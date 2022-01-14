package com.codingnomads.mentor_portal_api.controllers

import com.codingnomads.mentor_portal_api.entities.business.Mentor
import com.codingnomads.mentor_portal_api.handlers.MentorHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")

class MentorController(@Autowired private val mentorHandler: MentorHandler) {
    /**
     * Get all Mentors
     */
    @GetMapping("/mentors")
    fun getMentors(): List<Mentor> = mentorHandler.getMentors()

    /**
     * Get Mentor by id
     *
     * @param  mentorId of user that is a mentor name
     */
    @GetMapping("/mentor/{mentorId}")
    fun getMentorById(@PathVariable mentorId: Int): Mentor = mentorHandler.getMentorById(mentorId)
}