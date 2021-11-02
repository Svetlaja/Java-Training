package by.epam.learn.exceptionsUniversity;

import by.epam.learn.UniversityExceptions.DisciplineOrFacultyAbsenceException;
import by.epam.learn.UniversityExceptions.MarkValueException;
import by.epam.learn.UniversityExceptions.StudentAbsenceException;

import java.util.ArrayList;

import static by.epam.learn.exceptionsUniversity.University.DISCIPLINE_1;
import static by.epam.learn.exceptionsUniversity.University.FACULTY_1;

public class StudentList {

    ArrayList<Student> students;
    FacultyList facultyList;
    DisciplineList disciplineList;
    GroupList groupList;

    public StudentList(ArrayList<Student> students, FacultyList facultyList, GroupList groupList, DisciplineList disciplineList) {
        this.students = students;
        this.facultyList = facultyList;
        this.groupList = groupList;
        this.disciplineList = disciplineList;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void getAverageMarkByFacultyGroupOnDiscipline(int mark) throws MarkValueException {

        int sumMark = 0;
        int numberOfMarks = 0;
        int averageMarkFaculty;
        for (Student stud : students)
            if (stud.getFaculties().getFaculty().equals(FACULTY_1)
                    && (stud.disciplines.getDiscipline().equals(DISCIPLINE_1))
                    && (stud.groups.getNumberGroup() == 1)) {
                if (stud.getMark() < 0 || stud.getMark() > 10) {
                    throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                            + "Group #1: " + "\n"+ "Faculty: " + FACULTY_1 + "\n"
                            + "Discipline: " + DISCIPLINE_1, stud.getMark());
                }
                sumMark += stud.getMark();
                numberOfMarks = numberOfMarks + 1;
            }
        averageMarkFaculty = sumMark / numberOfMarks;
        System.out.println("Average mark: faculty " + FACULTY_1 + "\n"
                + "\t\t\t Group #1 \n" + "\t\t\t discipline" + DISCIPLINE_1 + ": " + averageMarkFaculty + "\n");
    }

    public void getStudentAverageMarkOnDisciplines() throws DisciplineOrFacultyAbsenceException {
        System.out.println("Average mark by Disciplines: ");
        int sumDisciplinesMark = 0;
        int totalDisciplineMarks = 0;
        int averageMarkByDiscipline;
        for (Student stud : students)
            if (stud.getId() == 1) {
                if (stud.disciplines.getDiscipline() == null || stud.faculties.getFaculty() == null) {
                    throw new DisciplineOrFacultyAbsenceException("Discipline or Faculty is absent");
                }
                sumDisciplinesMark += stud.getMark();
                totalDisciplineMarks = totalDisciplineMarks + 1;
            }
        averageMarkByDiscipline = sumDisciplinesMark / totalDisciplineMarks;
        for (Discipline discip : disciplineList.disciplines)
            System.out.println("\t\t\t\t\t" + discip.getDiscipline());
        System.out.println("for the  Student Id" + getStudents().get(0).getId() + ": " + averageMarkByDiscipline + "\n");
    }

    public void getAverageMarkByUniversityOnDiscipline() throws StudentAbsenceException {
        System.out.print("Average mark on Discipline by University: ");
        int sumDisciplineMarkByUni = 0;
        int totalDisciplineMarksByUni = 0;
        int averageMarkOnDisciplineByUni;
        for (Student stud : students)
            if (stud.disciplines.getDiscipline().equals(DISCIPLINE_1)) {
                if (stud == null) {
                    throw new StudentAbsenceException("Student is absent");
                }
                sumDisciplineMarkByUni += stud.getMark();
                totalDisciplineMarksByUni = totalDisciplineMarksByUni + 1;
            }
        averageMarkOnDisciplineByUni = sumDisciplineMarkByUni / totalDisciplineMarksByUni;
        System.out.println(averageMarkOnDisciplineByUni);
    }
}