package emp;

import java.util.Scanner;

class Emp{
    int empId;
    String empName;
    double salary[]=new double[3];
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee ID:");
        empId=sc.nextInt();
        System.out.println("Employee Name:");
        empName=sc.next();
        System.out.println("Employee Salary:");
        for(int i=0;i<3;i++){
            salary[i]=sc.nextDouble();
        }
    }
    void display(){
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Salary:");
        for(int i=0;i<salary.length;i++){
            System.out.println(salary[i]);
        }
    }
}
class Salary {
    void calculate(double salary[]) {
        double total=0;
        for(int i=0;i<salary.length;i++){
            total=total+salary[i];
        }
        double avg=total/salary.length;
        System.out.println("Total Salary:"+total);
        System.out.println("Average Salary:"+avg);
    }
}
class StringOps{
    void countVowels(String name){
        int count=0;
        String s=name.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Number of Vowels:"+count);
    }
    void reverse(String name){
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reversed Name:"+rev);
    }
}
public class Employee{
    public static void main(String[] args){
        Emp e=new Emp();
        Salary s=new Salary();
        StringOps so=new StringOps();
        e.get();
        e.display();
        s.calculate(e.salary);
        so.countVowels(e.empName);
        so.reverse(e.empName);
    }
}