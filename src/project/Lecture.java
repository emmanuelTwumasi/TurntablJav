package project;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    String name;
    List<Double> studentGrade =new ArrayList<>();

    public Lecture(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", students=" + studentGrade +
                '}';
    }

    public void enter(Student student){
        this.studentGrade.add(student.getAverageGrade());
    }

    public  Double getHighestAverageGrade(){
        System.out.println("Highest Average");

        Double highestGrade = 0.0;
        int count =0;
        while(count<studentGrade.size()) {
                if(studentGrade.get(count) >highestGrade){
                    highestGrade = studentGrade.get(count);
                }
                count++;
        };
        return highestGrade;
    }

}
