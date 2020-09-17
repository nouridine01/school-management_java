package com.noor.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.noor.school.entities.Note;

@CrossOrigin("*")
@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note, Long> {
}
