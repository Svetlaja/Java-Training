package by.epam.learn.exceptionsUniversity;

import by.epam.learn.UniversityExceptions.MarkValueException;
import by.epam.learn.UniversityExceptions.StudentAbsentException;

import java.util.ArrayList;

import static by.epam.learn.exceptionsUniversity.UniversityManager.DISCIPLINE_2;
import static by.epam.learn.exceptionsUniversity.UniversityManager.FACULTY_1;

public class UniversityInfoReceiver {
    ArrayList<Student> students;
    ArrayList<Discipline> disciplines;

    public UniversityInfoReceiver(ArrayList<Student> students, ArrayList<Discipline> disciplines) {
        this.students = students;
        this.disciplines = disciplines;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void getAverageMarkByFacultyGroupOnDiscipline(String facultyToMark, int numOfGroupToMark, String disciplineToMark)
            throws StudentAbsentException, MarkValueException {
        int sumMark = 0;
        int numberOfMarks = 0;
        int averageMarkFaculty;
        for (Student stud : students)
            if (!(stud.getId() == 0) && stud.getMark() < 0 || stud.getMark() > 10) {
                throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + FACULTY_1 + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (!(stud.getId() == 0) && stud.faculties.getFaculty().equals(facultyToMark)
                    && (stud.discipline.getDiscipline().equals(disciplineToMark))
                    && (stud.group.getNumberGroup() == numOfGroupToMark)) {
                sumMark += stud.getMark();
                numberOfMarks = numberOfMarks + 1;
            }
        averageMarkFaculty = sumMark / numberOfMarks;
        System.out.println("Average mark: faculty " + FACULTY_1 + "\n"
                + "\t\t\t Group #1 \n" + "\t\t\t Discipline: " + DISCIPLINE_2 + ": " + averageMarkFaculty + "\n");
    }


    public void getStudentAverageMarkOnDisciplines(int idNum, int numOfGroupToMark) throws
            StudentAbsentException, MarkValueException {
        int sumDisciplinesMark = 0;
        int totalDisciplineMarks = 0;
        int averageMarkByDiscipline;
        for (Student stud : students)
            if (stud.getGroup().getNumberGroup() == numOfGroupToMark && stud.getId() == 0) {
                throw new StudentAbsentException("\n Warning! StudentAbsentException: Students in the group #"
                        + stud.getGroup().getNumberGroup() + " are absent: ");
            } else if (!(stud.getId() == 0) && stud.getMark() < 0 || stud.getMark() > 10) {
                throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + FACULTY_1 + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (stud.getId() == idNum) {
                sumDisciplinesMark += stud.getMark();
                totalDisciplineMarks = totalDisciplineMarks + 1;
            }
        averageMarkByDiscipline = sumDisciplinesMark / totalDisciplineMarks;
        System.out.println("\t\t\t\t\t" + getStudents().get(0).getDiscipline());
        System.out.println("\"Average student's" + getStudents().get(0).getId()
                + "mark by Disciplines: " + averageMarkByDiscipline + "\n");
    }

    public void getAverageMarkByUniversityOnDiscipline(int numOfGroupToMark, String disciplineToMark)
            throws StudentAbsentException, MarkValueException {
        System.out.print("Average mark on Discipline by University: ");
        int sumDisciplineMarkByUni = 0;
        int totalDisciplineMarksByUni = 0;
        int averageMarkOnDisciplineByUni;
        for (Student stud : students)
            if (stud.getGroup().getNumberGroup() == numOfGroupToMark && stud.getId() == 0) {
                throw new StudentAbsentException("\n Warning! StudentAbsentException: Students in the group #"
                        + stud.getGroup().getNumberGroup() + " are absent: ");
            } else if (!(stud.getId() == 0) && stud.getMark() < 0 || stud.getMark() > 10) {
                throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + FACULTY_1 + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (!(stud.getId() == 0) && stud.discipline.getDiscipline().equals(disciplineToMark)) {
                sumDisciplineMarkByUni += stud.getMark();
                totalDisciplineMarksByUni = totalDisciplineMarksByUni + 1;
            }
        averageMarkOnDisciplineByUni = sumDisciplineMarkByUni / totalDisciplineMarksByUni;
        System.out.println(averageMarkOnDisciplineByUni);
    }
}