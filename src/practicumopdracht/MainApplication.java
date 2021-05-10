package practicumopdracht;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import practicumopdracht.Controllers.SubjectController;
import practicumopdracht.Views.SubjectView;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) {
        if(!Main.launchedFromMain) {
            System.err.println("Je moet deze applicatie opstarten vanuit de Main-class, niet de MainApplication-class!");
            System.exit(1337);

            return;
        }

        SubjectController subjectController = new SubjectController();
        SubjectView subjectView = subjectController.GetView();

        Scene scene = new Scene(
                subjectView.getRoot()
        );

        stage.setTitle(String.format("Practicumopdracht OOP2 - %s", Main.studentNaam));
        stage.setScene(scene);
        stage.show();
    }
}
