package project;

import java.util.List;

public class Student implements Nameable{
    private String name;
    private List<Double> Grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(){}

    public Student(List<Double> grade) {
        this.Grade = grade;
    }

    public List<Double> getGrade() {
        return Grade;
    }

    public void setGrade(List<Double> grade) {
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Grade=" + Grade +
                '}';
    }

    public Double getAverageGrade() {
        Double sum = 0.0;
        for (Double b: Grade) {
            sum += b;
        }
        return  sum/ Grade.size();

    }
}
