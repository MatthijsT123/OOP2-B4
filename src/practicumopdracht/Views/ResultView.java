package practicumopdracht.Views;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import practicumopdracht.Models.Subject;

/**
 * @author Matthijs van Tuijl
 * @date 10-5-2021
 */
public class ResultView {


    private VBox root;

    public ResultView(){
        initLayout();
    }

    private void initLayout() {

        root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().addAll();
    }

    public VBox getRoot() {
        return root;
    }
}
