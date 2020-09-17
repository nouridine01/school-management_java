package com.noor.school.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.noor.school.entities.Note;
import com.noor.school.repositories.NoteRepository;

import com.noor.school.exceptions.NoteNotFoundException;

@CrossOrigin("*")
@RestController
public class NoteController {
	NoteRepository repository;

    public NoteController(NoteRepository noteRepository) {
        this.repository=noteRepository;
    }



    @GetMapping("/notes")
    List<Note> all() {
      return repository.findAll();
    }

    @PostMapping("/notes")
    Note newNote(@RequestBody Note newNote) {
      return repository.save(newNote);
    }

    // Single item

    @GetMapping("/notes/{id}")
    Note one(@PathVariable Long id) {

      return repository.findById(id)
        .orElseThrow(() -> new NoteNotFoundException(id));
    }

    @PutMapping("/notes/{id}")
    Note replaceNote(@RequestBody Note newNote, @PathVariable Long id) {

      return repository.findById(id)
        .map(note -> {
        	note.setEnseignant(newNote.getEnseignant());
        	note.setEtudiant(newNote.getEtudiant());
        	note.setModule(newNote.getModule());
        	note.setCoefficient(newNote.getCoefficient());
        	note.setCoefficient(newNote.getCoefficient());
          return repository.save(note);
        })
        .orElseGet(() -> {
          newNote.setId(id);
          return repository.save(newNote);
        });
    }

    @DeleteMapping("/notes/{id}")
    void deleteNote(@PathVariable Long id) {
      repository.deleteById(id);
    }
}
