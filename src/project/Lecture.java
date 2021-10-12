package project;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    String name;
    List<Student> students;

    public Lecture(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void enter(Student student){
        this.students.add(student);
    }

    public  Double getHighestAverageGrade(){
        System.out.println("Highest Average");

        Double highestGrade = 0.0;
        int count =0;
        while(count<students.size()) {
                if(students.get(count).getAverageGrade() >highestGrade){
                    highestGrade = students.get(count).getAverageGrade();
                }
                count++;
        };
        return highestGrade;
    }

}
