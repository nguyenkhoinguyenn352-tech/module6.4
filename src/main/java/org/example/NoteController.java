package org.example;

public class NoteController {

    private Notebook notebook = new Notebook();

    public void addNote(String title, String content) {
        notebook.addNote(new Note(title, content));
    }

    public Notebook getNotebook() {
        return notebook;
    }
}
