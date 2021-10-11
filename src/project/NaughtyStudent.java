package project;

import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(String name) {
        super(name);
    }

    public NaughtyStudent(List<Double> grade) {
        super(grade);
    }

    @Override
    public Double getAverageGrade() {
        double newAverage = super.getAverageGrade();
        newAverage+=newAverage*0.1;
        return newAverage;
    }
}
