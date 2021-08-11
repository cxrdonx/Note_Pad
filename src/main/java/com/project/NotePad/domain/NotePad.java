package com.project.NotePad.domain;

import java.text.DateFormat;

public class NotePad {
    private int noteId;
    private String title;
    private String note;
    private String datenote;
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDatenote() {
        return datenote;
    }

    public void setDatenote(String datenote) {
        this.datenote = datenote;
    }

}
