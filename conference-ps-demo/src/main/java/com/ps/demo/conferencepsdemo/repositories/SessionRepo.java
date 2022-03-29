package com.ps.demo.conferencepsdemo.repositories;

import com.ps.demo.conferencepsdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session, Long> {

}
