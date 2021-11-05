package by.epam.learn.exceptionsUniversity;

import by.epam.learn.UniversityExceptions.FacultyAbsenceException;
import by.epam.learn.UniversityExceptions.GroupAbsenceException;
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

    public int getAverageMarkByFacultyGroupOnDiscipline(String facultyToMark, int numOfGroupToMark, String disciplineToMark) throws
        FacultyAbsenceException, StudentAbsentException, MarkValueException, GroupAbsenceException {
        
        int sumMark = 0;
        int numberOfMarks = 0;
        int averageMarkFaculty;
        
        for (Student stud : students)
            if (!(students.isEmpty()) && (stud.getFaculties().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && stud.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (stud.getId() == 0 && stud.getGroup().getGroupNumber() == numOfGroupToMark) {
                throw new StudentAbsentException("\n Warning! StudentAbsentException: absent students: " +
                        " - " + stud.getName() + " in the group #"
                        + stud.getGroup().getGroupNumber() + " on Faculty " + "\""
                        + stud.getFaculties().getFacultyName() + "\"");
            } else if (!(stud.getId() == 0) && stud.getMark() < 0 || stud.getMark() > 10) {
                throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + FACULTY_1 + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (!(stud.getId() == 0) && stud.getFaculties().getFacultyName().equals(facultyToMark)
                    && (stud.getDiscipline().getDisciplineName().equals(disciplineToMark))
                    && (stud.getGroup().getGroupNumber() == numOfGroupToMark)) {
                sumMark += stud.getMark();
                numberOfMarks = numberOfMarks + 1;
            }
        averageMarkFaculty = sumMark / numberOfMarks;
        System.out.println("Average mark: faculty " + "\"" + FACULTY_1 + "\"" + "\n"
                + "\t\t\t Group #1 \n" + "\t\t\t Discipline " + "\"" + DISCIPLINE_2 + "\": " + averageMarkFaculty + "\n");
        return averageMarkFaculty;
    }

    public int getStudentAverageMarkOnDisciplines(int idNum, int numOfGroupToMark) throws
            FacultyAbsenceException, StudentAbsentException, MarkValueException, GroupAbsenceException {
        
        int sumDisciplinesMark = 0;
        int totalDisciplineMarks = 0;
        int averageMarkByDiscipline;
        
        for (Student student : students)
            if (!(students.isEmpty()) && (student.getFaculties().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && student.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (student.getId() == 0 && student.getGroup().getGroupNumber() == numOfGroupToMark) {
                throw new StudentAbsentException("\n Warning! StudentAbsentException: absent students: " +
                        " - " + student.getName() + " in the group #"
                        + student.getGroup().getGroupNumber() + " on Faculty " + "\""
                        + student.getFaculties().getFacultyName() + "\"");
            } else if (!(student.getId() == 0) && student.getMark() < 0 || student.getMark() > 10) {
                throw new MarkValueException("Mark value: " + student.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + "\"" + FACULTY_1 + "\"" + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (student.getId() == idNum) {
                sumDisciplinesMark += student.getMark();
                totalDisciplineMarks = totalDisciplineMarks + 1;
            }
        averageMarkByDiscipline = sumDisciplinesMark / totalDisciplineMarks;
        System.out.println("Average student's Id#" + getStudents().get(0).getId() + "- "
                + getStudents().get(0).getName() + " mark by Disciplines equals: " + averageMarkByDiscipline + "\n");
        return averageMarkByDiscipline;
    }

    public int getAverageMarkByUniversityOnDiscipline(int numOfGroupToMark, String disciplineToMark) throws
        FacultyAbsenceException, StudentAbsentException, MarkValueException, GroupAbsenceException {    
        
        int sumDisciplineMarkByUni = 0;
        int totalDisciplineMarksByUni = 0;
        int averageMarkOnDisciplineByUni;
        
        for (Student stud : students)
            if (!(students.isEmpty()) && (stud.getFaculties().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && stud.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (stud.getId() == 0 && stud.getGroup().getGroupNumber() == numOfGroupToMark) {
                throw new StudentAbsentException("\n Warning! StudentAbsentException: absent students: " +
                        " - " + stud.getName() + " in the group #"
                        + stud.getGroup().getGroupNumber() + " on Faculty " + "\""
                        + stud.getFaculties().getFacultyName() + "\"");
            } else if (!(stud.getId() == 0) && stud.getMark() < 0 || stud.getMark() > 10) {
                throw new MarkValueException("Mark value: " + stud.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + FACULTY_1 + "\n"
                        + "Discipline: " + DISCIPLINE_2);
            } else if (!(stud.getId() == 0) && stud.getDiscipline().getDisciplineName().equals(disciplineToMark)) {
                sumDisciplineMarkByUni += stud.getMark();
                totalDisciplineMarksByUni = totalDisciplineMarksByUni + 1;
            }
        averageMarkOnDisciplineByUni = sumDisciplineMarkByUni / totalDisciplineMarksByUni;
        System.out.println("Average mark on Discipline " + "\"" + disciplineToMark + "\""
                + " by University equals\": " + averageMarkOnDisciplineByUni + "\n");
        return averageMarkOnDisciplineByUni;
    }
}
