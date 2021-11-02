package by.epam.learn.exceptionsUniversity;

import java.util.Objects;

public class Student {
    int id;
    String name;
    Faculty faculties;
    Group groups;
    Discipline disciplines;
    int mark;

    public Student(int id, String name, Faculty faculties, Group groups, Discipline disciplines, int mark) {
        this.id = id;
        this.name = name;
        this.faculties = faculties;
        this.groups = groups;
        this.disciplines = disciplines;
        this.mark = mark;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculties() {
        return faculties;
    }

    public Group getGroup() {
        return groups;
    }
    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName())
                && Objects.equals(getFaculties(), student.getFaculties()) && Objects.equals(getGroup(), student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getFaculties(), getGroup());
    }
}