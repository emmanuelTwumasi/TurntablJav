package project;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {

        //grades
        List<Double> StudentGrades1 = new ArrayList<>();
        StudentGrades1.add(90.0);
        StudentGrades1.add(100.0);
        StudentGrades1.add(90.0);

        //grades
        List<Double> studentGrade2 = new ArrayList<>();
        studentGrade2.add(100.0);
        studentGrade2.add(100.0);
        studentGrade2.add(100.0);

        //grades
        List<Double> studentGrade3 = new ArrayList<>();
        studentGrade3.add(403.0);
        studentGrade3.add(300.0);
        studentGrade3.add(200.0);

        //grades
        List<Double> studentGrade4 = new ArrayList<>();
        studentGrade4.add(80.0);
        studentGrade4.add(50.0);
        studentGrade4.add(60.0);


        Student student1 =new Student(StudentGrades1);
        Student student2 = new Student(studentGrade2);
        Student student3 = new Student(studentGrade3);
//        Student student7 = new Student("Adwoa");
        System.out.println("Student 1: "+student1.getAverageGrade());
        System.out.println("Student 2: "+student2.getAverageGrade());
        System.out.println("Student 2: "+student3.getAverageGrade());

        //Naughty Student
        NaughtyStudent student4 = new NaughtyStudent(studentGrade4);
        NaughtyStudent student5 = new NaughtyStudent(studentGrade4);

        System.out.println("\n Naughty Student : "+ student4.getAverageGrade());
//        System.out.println("\n Naughty Student : "+ student5.getAverageGrade());



        //Same student before being naughty
        System.out.println("\n Normal student : "+ student3.getAverageGrade());

        //print student
        System.out.println("\nStudent 1: "+student1);
        System.out.println("Student 2: "+student2);
        System.out.println("Student 3: "+student3);
        System.out.println("\nNaughty Student : " +student4);
        System.out.println("\nNaughty Student : " +student5);


        Lecture lecture = new Lecture("English");
        System.out.println("\n"+lecture);
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(student3);
        lecture.enter(student4);
        lecture.enter(student5);
        System.out.println("\n"+lecture);
        System.out.print(lecture.getHighestAverageGrade());
//
//        Register newReg = new Register();Register

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        System.out.println();
        for (Student s:studentArrayList
             ) {
            System.out.println(s);

        }

//        Register studentRegister = new Register(studentArrayList, student);
    }

}
