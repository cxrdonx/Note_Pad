package com.project.NotePad.persistence.mapper;

import com.project.NotePad.domain.NotePad;
import com.project.NotePad.persistence.entity.BlocDeNotas;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import java.util.List;

@Mapper(componentModel = "spring")

    public interface NoteMapper {
    @Mappings({
            @Mapping(source = "idnota", target = "noteId"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "nota", target = "note"),
            @Mapping(source = "fecha", target = "datenote"),

    })

    NotePad toNotePad(BlocDeNotas blocDeNotas);
    List<NotePad>toNotePads(List<BlocDeNotas>blocDeNotas);

    @InheritInverseConfiguration
    BlocDeNotas toBlocDeNotas(NotePad notePad);

    }
