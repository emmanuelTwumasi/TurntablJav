package labs.comparableComparator;

import java.util.Comparator;

public class Employee implements  Comparable<Employee>{
    private int id;
    private String name;
    public Employee(){}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //Comparable implement compareTo which sorts in natural order
    //return +ve, if greater than,-ve, if less than and 0 when they're the same
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }


    /*
    To compare in any order by any data-type
    */
    public static Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    //equals methods
    public boolean equals(Object o){
        if(o==null||getClass()!=o.getClass())
        {
            return false;
        }
        if (o==this){
            return true;
        }
        Employee e = (Employee) o;
        return (this.getId()==e.getId());
    }
    public int hashCode(){
        return getId();
    }
}
