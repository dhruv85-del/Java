class Parent{
    void display(){
        System.out.println("This is  parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("this is child class");
    }
}
class GrandChild extends Parent{//hybrid inheritance bcz grandchild inherit parent class and child class also inherit parent class
    void info(){
        System.out.println("this is a grand child class ");
    }
}

public class Demo {
    public static void main(String[] args){
        Child c=new Child();
        c.display();
        c.show();
        GrandChild g=new GrandChild();
        g.display();
        g.info();

    }
}
