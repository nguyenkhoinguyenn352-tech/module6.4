package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtTitle;

    @FXML
    private TextArea txtContent;

    @FXML
    private TextArea txtResult;

    private NoteController controller = new NoteController();

    @FXML
    public void addNote() {

        String title = txtTitle.getText();
        String content = txtContent.getText();

        controller.addNote(title, content);

        txtResult.clear();

        for (Note note : controller.getNotebook().getNotes()) {

            txtResult.appendText(
                    note.getTitle() + "\n" +
                            note.getContent() + "\n\n");
        }

        txtTitle.clear();
        txtContent.clear();
    }
}
