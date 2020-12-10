package Pract78;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


class Employee {
    String surn;
    String name;
    double salary;
    String empPos;
    double fullSal;

    Employee(String surn1, String name1, double salary1, String empPos1) {
        surn = surn1;
        name = name1;
        salary = salary1;
        empPos = empPos1;
    }
}



interface EmployeePosition{

    String getJobTitle();
    double calcSalary(double baseSalary);

}

class Manager implements EmployeePosition{
    public String getJobTitle(){
        return "Manager";
    }
    public double calcSalary(double baseSalary){
        Random rnd = new Random();
        double earned = 115000+rnd.nextInt(25000);
        Company.allIncome += earned;
        return baseSalary + (0.05*earned);
    }

}
class TopManager implements EmployeePosition{
    public String getJobTitle(){
        return "TopManager";
    }
    public double calcSalary(double baseSalary){
        if (Company.allIncome >10000000) return baseSalary*2.5;
        else return baseSalary;
    }

}
class Operator implements EmployeePosition{
    public String getJobTitle(){
        return "Operator";
    }
    public double calcSalary(double baseSalary){
        return baseSalary;
    }

}

class Company{
    public static double allIncome;
    ArrayList<Employee> emps = new ArrayList<>();

    ArrayList<Employee> empsSorted = new ArrayList<>();



    void hire(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Input Surname Name Salary Post");
        Employee hire1 = new Employee(inp.nextLine(),inp.nextLine(),inp.nextDouble(),inp.nextLine());
        emps.add(hire1);

    }

    void hireAll(String post, int quant){
        if(post == "Manager"){
            for(int i = 0; i<quant;i++){
                Employee newEmpl = new Employee("Petrov","Alexey",80000,"Manager");
                emps.add(newEmpl);
            }
        }
        if(post == "TopManager"){
            for(int i = 0; i<quant;i++){
                Employee newEmpl = new Employee("Broud","Ben",150000,"TopManager");
                emps.add(newEmpl);
            }
        }
        if(post == "Operator"){
            for(int i = 0; i<quant;i++){
                Employee newEmpl = new Employee("Freeman","Gabe",40000,"Operator");
                emps.add(newEmpl);
            }
        }

    }

    void fire(){
        Scanner inp = new Scanner(System.in);
        String surn, name;
        System.out.println("Input Surname Name of person you want to fire");
        surn = inp.nextLine();
        name = inp.nextLine();
        for(int i = 0; i < emps.size(); i++){
            if (emps.get(i).surn == surn && emps.get(i).name == name) {
                emps.remove(i);
                break;
            }
        }

    }
    void fireHalfComp(){
        Random rnd = new Random();
        for(int i = 0; i< emps.size()/2; i++){
            emps.remove(rnd.nextInt(emps.size()-i));
            empsSorted.remove(rnd.nextInt(empsSorted.size()-i));

        }
    }
    double getAllIncome(){
        return allIncome;
    }

    void sort(){
        Manager mngr = new Manager();
        TopManager tmngr = new TopManager();
        Operator oprtr = new Operator();

        for(int i = 0; i< emps.size(); i++){
            if(emps.get(i).empPos == "Manager"){
                emps.get(i).fullSal = mngr.calcSalary(emps.get(i).salary);
            }
            if(emps.get(i).empPos == "TopManager"){
                emps.get(i).fullSal = tmngr.calcSalary(emps.get(i).salary);
            }
            if(emps.get(i).empPos == "Operator"){
                emps.get(i).fullSal = oprtr.calcSalary(emps.get(i).salary);
            }

        }
        empsSorted = emps;
        for(int i = 0; i < empsSorted.size(); i++ ){
            for (int j = 0; j < empsSorted.size() -1 ; j++){
                if (empsSorted.get(j).fullSal > empsSorted.get(i).fullSal ) {
                    Employee temp;
                    temp = empsSorted.get(i);
                    empsSorted.set(i,empsSorted.get(j));
                    empsSorted.set(j,temp);



                }
            }
        }


    }

    List<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> topSal = new ArrayList<>();
        for(int i = 0;i < count;i++){

            topSal.add(empsSorted.get(empsSorted.size()-i-1));
        }
        return topSal;
    }
    List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> lowSal = new ArrayList<>();
        for(int i = 0; i < count; i++){
            lowSal.add(empsSorted.get(i));
        }
        return lowSal;
    }

    void output(){
        List<Employee> topSal = new ArrayList<>();
        List<Employee> lowSal = new ArrayList<>();

        topSal = getTopSalaryStaff(15);
        lowSal = getLowestSalaryStaff(30);
        System.out.println("Top-15 Sallary:");

        for (int i = 0; i<15;i++){
            System.out.println(topSal.get(i).fullSal);
        }
        System.out.println("30 Lowest Sallary:");
        for (int i = 0; i<30;i++){
            System.out.println(lowSal.get(i).fullSal);
        }
    }


}
class Main{
    public static void main(String[] args) {

        Company cmp = new Company();
        cmp.hireAll("Operator",180);
        cmp.hireAll("Manager",80);
        cmp.hireAll("TopManager",10);
        cmp.sort();
        cmp.output();
        cmp.fireHalfComp();
        System.out.println("Sallarry list after firing:");
        cmp.output();

    }


}