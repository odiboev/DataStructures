/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallab7;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>(){
        @Override
        public int compare(Employee t1, Employee t2) {
           String EmpName1 = t1.getName().toUpperCase();
           String EmpName2 = t2.getName().toUpperCase();
           return EmpName1.compareTo(EmpName2);
        }
    };
     public static Comparator<Employee> EmpAgeComparator = new Comparator<Employee>(){
            @Override
            public int compare(Employee t1, Employee t2) {
                int empAge1 = t1.getAge();
                int empAge2 = t2.getAge();
            return empAge1-empAge2;
            
            }
        
    
    };
      public static Comparator<Employee> EmpSalaryComparator = new Comparator<Employee>(){
        @Override
        public int compare(Employee t1, Employee t2) {
            int empSal1 = t1.getSalary();
            int empSal2= t2.getSalary();
            return empSal1-empSal2;
            
        }
        
    
    
};
      
}
