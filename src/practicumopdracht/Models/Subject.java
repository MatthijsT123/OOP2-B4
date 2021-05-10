package practicumopdracht.Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Matthijs van Tuijl
 * @date 10-5-2021
 */
public class Subject implements Serializable {
    private final int id;
    private String subjectName;
    private String description;
    private transient ArrayList<Result> results;

    public Subject(int id, String subjectName, String description){
        this.id = id;
        this.subjectName = subjectName;
        this.description = description;
    }

    public Subject(int id, String subjectName, String description, ArrayList<Result> results){
        this(id, subjectName, description);
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return String.format("%-10s - %-10s", subjectName, description);
    }
}
