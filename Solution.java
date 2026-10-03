// class Animal{
//       void display(){
//         System.out.println("This is Animal class");
//     }
// }
// class Dog extends Animal{
//     void show(){
//         System.out.println("this is Dog class");
//     }
// }
// class Cat extends Animal{
//     void info(){
//         System.out.println("this is a Cat class ");
//     }
// }
// class Puppy extends Dog{
//     void puppyInfo(){
//         System.out.println("this is a Puppy class ");
//     }
// }
// class Person{//contain name
//     void info(String name){
//         System.out.println("Name is: "+name);
//     }
// }
// class Employee extends Person{//contain name and salary
//     void info(String name,int salary){
//         System.out.println("Name is: "+name);
//         System.out.println("Salary is: "+salary);
//     }
// }
// class Manager extends Employee{
//     void info(String name,int salary,String department){
//         System.out.println("Name is: "+name);
//         System.out.println("Salary is: "+salary);
//         System.out.println("Department is: "+department);
//     }
// }
// class Student {
//     void info(String name, int rollNo){
//         System.out.println("Name is: "+name);
//         System.out.println("Roll No is: "+rollNo);
//     }
// }
// class Result extends Student{
//     void info(String name, int rollNo, int marks){
//         System.out.println("Name is: "+name);
//         System.out.println("Roll No is: "+rollNo);
//         System.out.println("Marks is: "+marks);
//     }
// }
class BankAccount{
    void info(String name, int accountNo, double balance){
        System.out.println("Name is:"+name);
        System.out.println("Account No is:"+accountNo);
        System.out.println("Balance is:"+balance);
    }
}
class savingAccount extends BankAccount{
    void info(String name, int accountNo, double balance, double interestRate){
        System.out.println("Name is:"+name);
        System.out.println("Account No is:"+accountNo);
        System.out.println("Balance is:"+balance);
        System.out.println("Interest Rate is:"+interestRate);
    }
}
class currentAccount extends BankAccount{
    void info(String name, int accountNo, double balance, double overdraftLimit){
        System.out.println("Name is:"+name);
        System.out.println("Account No is:"+accountNo);
        System.out.println("Balance is:"+balance);
        System.out.println("Overdraft Limit is:"+overdraftLimit);
    }
}



public class Solution {
    public static void main(String[] args){ 
        // Result r=new Result();
        // r.info("Harsh",101,90);
        // Manager m=new Manager();        
        // m.info("Harsh",50000,"IT");
        savingAccount s=new savingAccount();
        s.info("Harsh", 101, 5000.0, 0.05);
        currentAccount c=new currentAccount();
        c.info("Harsh", 102, 3000.0, 1000.0);

    }
}
