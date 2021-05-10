package practicumopdracht.Controllers;

import practicumopdracht.Models.Subject;
import practicumopdracht.Views.SubjectView;

/**
 * @author Matthijs van Tuijl
 * @date 10-5-2021
 */
public class SubjectController {
    private SubjectView subjectView;
    private Subject subject;

    public SubjectController(){
        subjectView = new SubjectView();
    }

    public SubjectView GetView(){
        return subjectView;
    }
}
