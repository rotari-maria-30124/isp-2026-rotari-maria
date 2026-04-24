package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentList {
    private String groupID;
    private ArrayList<Student> students;

    public StudentList(String groupID) {
        this.groupID = groupID;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addGrade(Student student, String subject, Integer grade) {
        students.get(students.indexOf(student)).addGrade(subject, grade);
    }

    //update a students information
    public void updateStudent(String ID, String name) {
        for (Student s : students) {
            if (s.getID().equals(ID)) {
                s.setName(name);
                return;
            }
        }
    }

    //calculate average grade of a student
    public float getAverageGrade(Student student) {
        float sum = 0;
        Student s = students.get(students.indexOf(student));
        HashMap<String, Integer> grades = s.getGrades();
        for (String key : grades.keySet()) {
            sum += grades.get(key);
        }
        return sum / students.size();
    }

    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }

    }
    public ArrayList<Student> getStudents() {
        return students;
    }
}
