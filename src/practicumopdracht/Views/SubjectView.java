package practicumopdracht.Views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import practicumopdracht.ConstString;
import practicumopdracht.Models.Subject;

/**
 * @author Matthijs van Tuijl
 * @date 10-5-2021
 */
public class SubjectView {

    private Label subjectLabel;
    private ComboBox<Subject> subjectComboBox;

    private Label subjectNameLabel;
    private TextField subjectNameTextField;

    private Label descriptionLabel;
    private TextArea descriptionTextArea;

    private ListView<Subject> subjectListView;

    private Button addButton, removeButton, saveButton, loadButton;

    private GridPane pane;
    private HBox bottomButtonLayout;
    private VBox vBox;

    public SubjectView(){
        pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        subjectLabel = new Label(ConstString.subjects);
        subjectComboBox = new ComboBox<>();
        subjectComboBox.setMaxWidth(Double.MAX_VALUE);

        subjectNameLabel = new Label(ConstString.subjectName);
        subjectNameTextField = new TextField();

        descriptionLabel = new Label(ConstString.subjectDescription);
        descriptionTextArea = new TextArea();

        addButton = new Button(ConstString.add);
        addButton.setMaxWidth(Double.MAX_VALUE);

        subjectListView = new ListView<>();

        bottomButtonLayout = new HBox();
        bottomButtonLayout.setSpacing(5);

        removeButton = new Button(ConstString.remove);
        removeButton.setMaxWidth(Double.MAX_VALUE);
        saveButton = new Button(ConstString.save);
        saveButton.setMaxWidth(Double.MAX_VALUE);
        loadButton = new Button(ConstString.load);
        loadButton.setMaxWidth(Double.MAX_VALUE);

        HBox.setHgrow(removeButton, Priority.ALWAYS);
        HBox.setHgrow(saveButton, Priority.ALWAYS);
        HBox.setHgrow(loadButton, Priority.ALWAYS);

        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);

        Initalize();
    }

    private void Initalize() {
        pane.add(subjectLabel, 0, 0);
        pane.add(subjectComboBox, 1, 0);

        pane.add(subjectNameLabel, 0, 1);
        pane.add(subjectNameTextField, 1, 1);

        pane.add(descriptionLabel, 0, 2);
        pane.add(descriptionTextArea, 1, 2);

        bottomButtonLayout.getChildren().addAll(removeButton, saveButton, loadButton);
        vBox.getChildren().addAll(pane, addButton, subjectListView, bottomButtonLayout);
    }

    public VBox getRoot(){
        return vBox;
    }

    public ComboBox<Subject> getSubjectComboBox() {
        return subjectComboBox;
    }

    public void setSubjectComboBox(ComboBox<Subject> subjectComboBox) {
        this.subjectComboBox = subjectComboBox;
    }

    public Label getSubjectNameLabel() {
        return subjectNameLabel;
    }

    public void setSubjectNameLabel(Label subjectNameLabel) {
        this.subjectNameLabel = subjectNameLabel;
    }

    public TextField getSubjectNameTextField() {
        return subjectNameTextField;
    }

    public void setSubjectNameTextField(TextField subjectNameTextField) {
        this.subjectNameTextField = subjectNameTextField;
    }

    public Label getDescriptionLabel() {
        return descriptionLabel;
    }

    public void setDescriptionLabel(Label descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public TextArea getDescriptionTextArea() {
        return descriptionTextArea;
    }

    public void setDescriptionTextArea(TextArea descriptionTextArea) {
        this.descriptionTextArea = descriptionTextArea;
    }

    public ListView<Subject> getSubjectListView() {
        return subjectListView;
    }

    public void setSubjectListView(ListView<Subject> subjectListView) {
        this.subjectListView = subjectListView;
    }

    public Button getAddButton() {
        return addButton;
    }

    public Button getRemoveButton() {
        return removeButton;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public Button getLoadButton() {
        return loadButton;
    }
}
