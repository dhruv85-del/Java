 class Student{
    static int count=0;
    static{
        count++;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.err.println("object creation "+count);
    }
 }