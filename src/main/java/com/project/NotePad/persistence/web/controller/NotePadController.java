package com.project.NotePad.persistence.web.controller;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.domain.service.NotePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotePadController {
    @Autowired
    private NotePadService notePadService;

    @GetMapping("/all")
   public ResponseEntity<List<NotePad>> getAll(){
        return new ResponseEntity<>(notePadService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<NotePad> save(@RequestBody NotePad notepad){
        return new ResponseEntity<>(notePadService.save(notepad), HttpStatus.CREATED);
    }


}
