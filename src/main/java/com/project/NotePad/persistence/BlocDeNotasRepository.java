package com.project.NotePad.persistence;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.domain.repository.NoteRepository;
import com.project.NotePad.persistence.crud.BlocCrudRepository;
import com.project.NotePad.persistence.entity.BlocDeNotas;
import com.project.NotePad.persistence.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BlocDeNotasRepository implements NoteRepository {

    @Autowired
    private BlocCrudRepository blocCrudRepository;

    @Autowired
    private NoteMapper mapper;


    @Override
    public List<NotePad> getAll() {
            return mapper.toNotePads((List<BlocDeNotas>) blocCrudRepository.findAll());
    }

    @Override
    public NotePad save(NotePad notepad) {
         BlocDeNotas blocDeNotas = mapper.toBlocDeNotas(notepad);
         return mapper.toNotePad(blocCrudRepository.save(blocDeNotas));
              //toNotePad
    }
}
