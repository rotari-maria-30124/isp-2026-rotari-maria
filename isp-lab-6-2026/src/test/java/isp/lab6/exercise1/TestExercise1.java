package isp.lab6.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise1 {
    @Test
    public void test1(){
        StudentList l=new StudentList("Grupa 4");
        Student s1=new Student("Alina Curea", "1");
        l.addStudent(s1);
        assertEquals(1, l.getStudents().size());
    }
    @Test
    public void test2(){
        Student s1=new Student("Alina Curea", "1");
        s1.addGrade("Romana", 7);
        assertEquals(Integer.valueOf(7), s1.getGrades().get("Romana"));
    }
    @Test
    public void test3(){
        StudentList l=new StudentList("Grupa 4");
        Student s3=new Student("Sami Pop", "3");
        l.addStudent(s3);
        l.removeStudent(s3);
        assertEquals(0, l.getStudents().size());
    }
    @Test
    public void test4(){
        StudentList l=new StudentList("Grupa 4");
        Student s2=new Student("Ion Dan", "2");
        l.addStudent(s2);
        l.updateStudent("2", "Irinel Cioata");
        assertEquals("Irinel Cioata", s2.getName());
    }
}
