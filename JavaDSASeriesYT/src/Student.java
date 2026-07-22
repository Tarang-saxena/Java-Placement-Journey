public class Student {
    public int  id;
    public  int age;
    public int nos;
    public String name;
    private String gf;

    public String getgf(){
        return this.gf;
    }

    // Default constructor
//    public Student(){
//        System.out.println("Student default constructor called");
//    }

    // Parameterized constructor

    public Student(int id , int age , int nos,String name,String gf){
        System.out.println("Parameterized Constroctor");
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;
        this.gf = gf;
    }
//    Copy con
    public Student(Student s){
        System.out.println(" Copy Constroctor");
        this.id = s.id;
        this.age =s.age;
        this.nos = s.nos;
        this.name = s.name;
    }
    public  void study(){
        System.out.println("Study");
    }
    public  void sleep(){
        System.out.println("Sleep");
    }
    public  void bunking(){
        System.out.println("Bunking");
    }
    private void gf(){
        System.out.println("Chatting");
    }
}
