package practicumopdracht.Models;

import java.time.LocalDate;

/**
 * @author Matthijs van Tuijl
 * @date 10-5-2021
 */
public class Result {
    private final int id;
    private int subjectId;
    private Subject subject;
    private double result;
    private LocalDate resultDate;
    private boolean isRetaken;
    private String description;

    public Result(int id, int subjectId) {
        this.id = id;
        this.subjectId = subjectId;
    }

    public Result(int id, int subjectId, double result, LocalDate resultDate, boolean isRetaken, String description){
        this(id, subjectId);
        this.result = result;
        this.resultDate = resultDate;
        this.isRetaken = isRetaken;
        this.description = description;
    }

    public Result(int id, Subject subject, double result, LocalDate resultDate, boolean isRetaken, String description){
        this(id, subject.getId(), result, resultDate, isRetaken, description);
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public double getResult() {
        return result;
    }

    public LocalDate getResultDate() {
        return resultDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public boolean isRetaken() {
        return isRetaken;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return String.format("%-8d - %-10s - %-10s - %-10s", result, resultDate, isRetaken, description);
    }
}
