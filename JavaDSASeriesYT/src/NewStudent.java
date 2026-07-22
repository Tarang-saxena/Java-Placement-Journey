public class NewStudent {
    public static void main(String[] args) {
//        Student a = new Student();
//        a.id = 1;
//        a.age =  19;
//        a.name = "Heer";
//        a.nos =5;
//        System.out.println(a.name);
//        System.out.println(a.id);
//        System.out.println(a.age);
//        System.out.println(a.nos);
//        a.bunking();;
//        a.sleep();
//        a.study();

        //** Parameterized constructor

//        Student a = new Student( 1,  19,  5,  "Tarang", "Heer");
//        System.out.println(a.name);
//        System.out.println(a.id);
//        System.out.println(a.age);
//        System.out.println(a.nos);
//        a.bunking();;
//        a.sleep();
//        a.study();

        //Copy constructor
//        Student b = new Student(a);
//        System.out.println(b.name);
//        System.out.println(b.id);
//        System.out.println(b.age);
//        System.out.println(b.nos);
//        b.bunking();;
//        b.sleep();
//        b.study();

//        Encapsulation
        Student a = new Student( 1,  19,  5,  "Tarang", "Heer");
        System.out.println(a.name);
        System.out.println(a.id);
        System.out.println(a.age);
        System.out.println(a.nos);
        System.out.println(a.getgf());               //   bcz private
        a.bunking();;
        a.sleep();
        a.study();
        a.getgf();                                   // bcz private

    }
}
