package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        StudentList l=new StudentList("Grupa 4");
        Student s1=new Student("Alina Curea", "1");
        Student s2=new Student("Ion Dan", "2");
        Student s3=new Student("Sami Pop", "3");
        Student s4=new Student("Ana Bodnar", "4");

        l.addStudent(s1);
        l.addStudent(s2);
        l.addStudent(s3);
        l.addStudent(s4);

        l.removeStudent(s3);
        l.updateStudent("2", "Irinel Cioata");

        s1.addGrade("Info", 8);
        s1.addGrade("Mate", 10);
        s1.addGrade("Romana", 7);
        s2.addGrade("Mate", 5);
        s3.addGrade("Fizica", 10);
        s4.addGrade("Romana", 9);

        float averageGrade=l.getAverageGrade(s1);
        System.out.println("Media s1: " + averageGrade);

        l.displayAllStudents();


    }
}
