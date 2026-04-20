package isp.lab6.exercise1;

import java.util.HashMap;

public class Student {
    private String name;
    private String ID;
    private HashMap<String, Integer> grades;

    public Student(String name, String ID){
        this.name=name;
        this.ID=ID;
    }

    public void addGrade(String subject, Integer grade){
        this.grades.put(subject, grade);
    }

    public void removeGrade(String subject){
        this.grades.remove(subject);
    }
    public void clearGrades(){
        this.grades.clear();
    }

    public String getGradesString() {
        StringBuilder sb = new StringBuilder();
        for (String subject : this.grades.keySet()) {
            Integer grade = this.grades.get(subject);
            sb.append(subject);
            sb.append(": ");
            sb.append(grade);
            sb.append("\n");
        }
        return sb.toString();
    }

        public HashMap<String, Integer> getGrades(){
            return grades;
        }

        @Override
        public String toString(){
        return "Student: " + name + ", ID: " + ID + ", grades:\n" + getGradesString();
        }
}
