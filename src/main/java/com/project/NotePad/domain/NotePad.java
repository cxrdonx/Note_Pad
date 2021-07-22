package com.project.NotePad.domain;

import java.text.DateFormat;

public class NotePad {
    private int noteId;
    private String title;
    private String note;
    private DateFormat datenote;

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DateFormat getDatenote() {
        return datenote;
    }

    public void setDatenote(DateFormat datenote) {
        this.datenote = datenote;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
