/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallab7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class EmployeeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee em = new Employee("Bob", 22, 42000);
        employeeList.add(em);
        employeeList.add(new Employee("Adam", 28, 45000));
        employeeList.add(new Employee("David", 20, 38000));
        employeeList.add(new Employee("Macha", 27, 50000));
        employeeList.add(new Employee("Brad", 25, 60000));
        employeeList.add(new Employee("Obama", 42, 78000));

        System.out.println("Employee Name Sorting:");
        Collections.sort(employeeList, Employee.EmpNameComparator);
        for (Employee str : employeeList) {
            System.out.println(str);

        }
        System.out.println("Employee Age Sorting:");
        Collections.sort(employeeList, Employee.EmpAgeComparator);
        for (Employee str : employeeList) {
            System.out.println(str);
        }
        System.out.println("Employee Salary Sorting:");
        Collections.sort(employeeList, Employee.EmpSalaryComparator);
        for (Employee str : employeeList) {
            System.out.println(str);
        }

        int ageSum = 0;
        for (int in = 0; in < employeeList.size(); in++) {
            ageSum += employeeList.get(in).getAge();
        }
        double ageAvg = ageSum / employeeList.size();
        System.out.println("Employees Average Age" + ageAvg);
        for (int avgage = 0; avgage < employeeList.size(); avgage++) {
            if (employeeList.get(avgage).getAge() > ageAvg) {
                System.out.println(employeeList.get(avgage));
            }
        }
        int salSum = 0;
        for (int in = 0; in < employeeList.size(); in++) {
            salSum += employeeList.get(in).getSalary();
        }
        double salAvg = salSum / employeeList.size();
        System.out.println("Employees Average Salary" + salAvg);
        for (int avgsal = 0; avgsal < employeeList.size(); avgsal++) {
            if (employeeList.get(avgsal).getSalary() > salAvg) {
                System.out.println(employeeList.get(avgsal));

            }

        }

    }

}
