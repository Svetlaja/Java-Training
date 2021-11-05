package by.epam.learn.exceptionsUniversity;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private Faculty faculties;
    private Group group;
    private Discipline discipline;
    private int mark;

    public Student(int id, String name, Faculty faculties, Group group, Discipline discipline, int mark) {
        this.id = id;
        this.name = name;
        this.faculties = faculties;
        this.group = group;
        this.discipline = discipline;
        this.mark = mark;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Faculty getFaculties() {
        return faculties;
    }

    public void setFaculty(Faculty faculty) {
        this.faculties = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group groups) {
        this.group = groups;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculties=" + faculties +
                ", groups=" + group +
                ", disciplines=" + discipline +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getMark() == student.getMark()
                && Objects.equals(getName(), student.getName()) && Objects.equals(getFaculties(),
                student.getFaculties()) && Objects.equals(getGroup(), student.getGroup())
                && Objects.equals(getDiscipline(), student.getDiscipline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getFaculties(), getGroup());
    }
}
