package labs.comparableComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class runEmployee {
    public static void main(String[] args) {
        Employee[] empArr=  new Employee[5];
        empArr[0] = new Employee(34,"Adwoa");
        empArr[1] = new Employee(24,"Abena");
        empArr[2] = new Employee(90,"Akosua");
        empArr[3] = new Employee(12,"Adina");
        empArr[4] = new Employee(1,"Ayoo");

        Arrays.sort(empArr,Employee.EmployeeNameComparator);
        for (Employee emp:empArr ) {
            System.out.println(emp);
        }
        System.out.println("\n"+Arrays.toString(empArr));

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Abena");
        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Abena");

        System.out.println("Shallow compare = "+(e1==e2));
        System.out.println("Deep compare = "+(e1.equals(e2)));
    }
}
