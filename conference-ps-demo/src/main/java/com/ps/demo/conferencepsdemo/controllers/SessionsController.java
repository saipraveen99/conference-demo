package com.ps.demo.conferencepsdemo.controllers;

import com.ps.demo.conferencepsdemo.models.Session;
import com.ps.demo.conferencepsdemo.repositories.SessionRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepo sessionRepo;

    @GetMapping
    public List<Session> getSessions() {
        return sessionRepo.findAll();
    }

    @GetMapping("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepo.getById(id);
    }

    @PostMapping
    public Session createSession(@RequestBody final Session session) {
        return sessionRepo.saveAndFlush(session);
    }

    // @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        //check if childs exist
        sessionRepo.deleteById(id);
    }

    // @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @PutMapping("{id}")
    public Session update(@PathVariable Long id, @RequestBody Session session) {
        Session existingSession = sessionRepo.getById(id);
        // TODO add validation if all attributes are not passed return 400 error
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepo.saveAndFlush(existingSession);
    }
}
