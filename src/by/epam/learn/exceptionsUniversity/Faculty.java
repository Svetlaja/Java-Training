package by.epam.learn.exceptionsUniversity;

import java.util.Objects;

public class Faculty extends Group {

    String faculty;

    public Faculty(String faculty, int numberGroup) {
        super(numberGroup);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty + '\'' +
                ", numberGroup=" + numberGroup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        if (!super.equals(o)) return false;
        Faculty faculty1 = (Faculty) o;
        return Objects.equals(getFaculty(), faculty1.getFaculty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFaculty());
    }
}