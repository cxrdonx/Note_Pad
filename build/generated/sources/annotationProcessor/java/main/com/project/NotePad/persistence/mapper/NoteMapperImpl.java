package com.project.NotePad.persistence.mapper;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.persistence.entity.BlocDeNotas;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-11T15:23:31-0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class NoteMapperImpl implements NoteMapper {

    @Override
    public NotePad toNotePad(BlocDeNotas blocDeNotas) {
        if ( blocDeNotas == null ) {
            return null;
        }

        NotePad notePad = new NotePad();

        notePad.setNote( blocDeNotas.getNota() );
        if ( blocDeNotas.getIdnota() != null ) {
            notePad.setNoteId( blocDeNotas.getIdnota() );
        }
        notePad.setTitle( blocDeNotas.getTitulo() );
        notePad.setDatenote( blocDeNotas.getFecha() );

        return notePad;
    }

    @Override
    public List<NotePad> toNotePads(List<BlocDeNotas> blocDeNotas) {
        if ( blocDeNotas == null ) {
            return null;
        }

        List<NotePad> list = new ArrayList<NotePad>( blocDeNotas.size() );
        for ( BlocDeNotas blocDeNotas1 : blocDeNotas ) {
            list.add( toNotePad( blocDeNotas1 ) );
        }

        return list;
    }

    @Override
    public BlocDeNotas toBlocDeNotas(NotePad notePad) {
        if ( notePad == null ) {
            return null;
        }

        BlocDeNotas blocDeNotas = new BlocDeNotas();

        blocDeNotas.setFecha( notePad.getDatenote() );
        blocDeNotas.setIdnota( notePad.getNoteId() );
        blocDeNotas.setTitulo( notePad.getTitle() );
        blocDeNotas.setNota( notePad.getNote() );

        return blocDeNotas;
    }
}
