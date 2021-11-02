package by.epam.learn.UniversityExceptions;

public class MarkValueException extends Exception {
    int mark;

    public int getMark() {
        return mark;
    }
    public MarkValueException(String markMessage, int markValue) {
        super(markMessage);
        mark = markValue;
    }
}