package com.galiero.note.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.galiero.note.Note;
import com.galiero.note.NoteRepository;

@RestController
public class NoteCTRL {
	
	private final NoteRepository noteRepository;
	
	NoteCTRL(NoteRepository repository) {
		
		noteRepository = repository;
	}
	
	@GetMapping("/notes")
	Iterable<Note> getNotes(){
		return noteRepository.findAll();
	}
	
	@GetMapping("/notes/{noteId}")
	Note getNotes(@PathVariable Long noteId){
		return noteRepository.findById(noteId).orElseThrow();
	}
	
	@PostMapping("/notes")
	Note createNote(@RequestBody Note newNote) {
		return noteRepository.save(newNote);
	}
	
	@PutMapping("/notes/{noteId}")
	Note updateNote(@PathVariable Long noteId, @RequestBody Note noteDto){
		Note noteToUpdate = noteRepository.findById(noteId).orElseThrow();
		noteToUpdate.setTitle(noteDto.getTitle());
		noteToUpdate.setContent(noteDto.getContent());
		return noteRepository.save(noteToUpdate);
	}
	
	@DeleteMapping("/notes/{noteId}")
	void deleteNote(@PathVariable Long noteId){
		Note note= noteRepository.findById(noteId).orElseThrow();
		noteRepository.delete(note);
	}

}
