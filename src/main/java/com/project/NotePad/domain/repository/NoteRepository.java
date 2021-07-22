package com.project.NotePad.domain.repository;

import com.project.NotePad.domain.NotePad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NoteRepository {
   List<NotePad>getAll();
   NotePad save(NotePad notePad);
}
