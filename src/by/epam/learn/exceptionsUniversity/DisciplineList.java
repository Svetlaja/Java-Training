package by.epam.learn.exceptionsUniversity;

import java.util.ArrayList;

public class DisciplineList {

    ArrayList<Discipline> disciplines;

    public DisciplineList(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}