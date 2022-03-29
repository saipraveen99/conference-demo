package com.ps.demo.conferencepsdemo.repositories;

import com.ps.demo.conferencepsdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepo extends JpaRepository<Speaker, Long> {

}
