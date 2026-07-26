package org.example;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}