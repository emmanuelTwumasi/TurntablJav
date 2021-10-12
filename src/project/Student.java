package project;

import java.util.List;

public class Student implements Nameable,HasLevel{
    private String studentName;
    private List<Double> grades;
    private Level studentLevel;

    public Student(Level studentLevel) {
        this.studentLevel=studentLevel;
    }

    public Student(){}

    public Student(List<Double> grade) {
        this.grades = grade;
    }


    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String getStudentName() {
        return this.studentName;
    }

    @Override
    public Level getLevel(){
        return this.studentLevel;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + studentName + '\'' +
                ", Grade=" + grades +
                '}';
    }

    public Double getAverageGrade() {
        Double sum = 0.0;
        for (Double grade: grades) {
            sum += grade;
        }
        return  sum/grades.size();
    }

}
