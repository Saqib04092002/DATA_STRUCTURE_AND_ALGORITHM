// ENCAPSULATION - Rapping up of data and function in a single unit.

public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolour("Blue");
        System.out.println(p1.colour);
        p1.settip(5);
        System.out.println(p1.tip);
        
        Student s1 = new Student();
        s1.name = "saqib";
        s1.Rollnum = 7;
        s1.calculateparcentage(97, 98, 99);
        System.out.println(s1.name);
        System.out.println(s1.Rollnum);
        System.out.println(s1.parcentage);
        
    }
    
}
class pen{

    String colour;
    int tip;


    void setcolour(String newcolour){
        colour = newcolour;
    }
    void settip(int newtip){
        tip = newtip;
    }
}

class Student{
    String name;
    int Rollnum;
    float parcentage;

    void calculateparcentage(int phy,int che,int math){
        parcentage = (phy+che+math)/3;
    }
}

// Access MOdifiers

/*public class OOPS {

    public static void main(String[] args) {
        Bank myacc = new Bank();
        myacc.username = "Mohd Saqib Khan";
        myacc.setpassword("Saqib");
        System.out.println(myacc.username);
     }
}

class Bank{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }
}*/

// Getter and Setter
/*
public class OOPS {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolour("yellow");
        System.out.println(p1.getcolour());
        p1.settip(5);
       System.out.println( p1.gettip()) ;
     }
}
class pen{

    private String colour;
    private int tip;
    
    void setcolour(String newcolour){
        colour = newcolour;
    }
    String getcolour(){
        return colour;
    }
    void settip(int newtip){
        tip = newtip;

    }
    int gettip(){
        return tip;
    }
}*/

// CONSTRUCTORS
/*
public class OOPS {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saqib";
        System.out.println(s1.name);
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        
        // Copy Const. use
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    
        
    }
}
class Student{
    String name ;
    int Rollnum;
    String password;
    int marks[];
   
    // Shallow Copy Constructor
    //Student(Student s1){
    //    marks = new int[3];
    //    this.marks = s1.marks;
    //    this.name = s1.name;
    //    this.Rollnum = s1.Rollnum;
    //}

    // Deep copy Constructor
    Student(Student s1){
        marks = new int[3];
       this.name = s1.name;
       this.Rollnum = s1.Rollnum;
       
       for(int i=0;i<3;i++){
        this.marks[i] = s1.marks[i];
       }
    }
    
    // Non Parameterized Constructor
    Student(){
        marks = new int[3];
    System.out.println("Constructor is Called");
 }

    // Parametrized Constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int Rollnum){
        marks = new int[3];
        this.Rollnum = Rollnum;
    }
}
*/

// Inheritance
/*public class OOPS{
    public static void main(String[] args) {
        Fish shark = new Fish();
            shark.eat();
            shark.fins = 2;
            System.out.println(shark.fins);

            Dog doggy = new Dog();
            doggy.eat();
            doggy.colour = "Brown";
            System.out.println(doggy.colour);
            doggy.legs = 4;
            System.out.println(doggy.legs);
        
    }
}
// -- SINGLE LEVEL INHERITANCE

// Base class
class Animals{
    String colour;

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}
// Derived class
class Fish extends Animals{
int fins;
void swim(){
    System.out.println("Swims in water");
}
}

// derived class 
class Mammals extends Animals{
    int legs;
}
// -- MULTI-LEVEL INHERITANCE

// derived class
class Dog extends Mammals{
    String bread;

}*/


// HIERARCHIAL INHERITANCE

/*public class OOPS{
    public static void main(String[] args) {
        Birds Sparrow = new Birds();
        Sparrow.colour="Yellow";
        Sparrow.eat();
        System.out.println(Sparrow.colour);
        Fish shark = new Fish();
        shark.colour = "pink";
        System.out.println(shark.colour);
        shark.eat();
    }
}


    class Animals{
        String colour;
    
        void eat(){
            System.out.println("Eat");
        }
    
        void breathe(){
            System.out.println("Breathe");
        }
    }

    class Mammals extends Animals{
        void walk(){
            System.out.println("Walk");
        }
    }

    class Fish extends Animals{
        void Swim(){
            System.out.println("Swim");
        }
    }

    class Birds extends Animals{
        void fly(){
            System.out.println("Fly");
        }
    }*/


    // HYBRID INHERITANCE

    /*public class OOPS{
        public static void main(String[] args) {
            Birds Sparrow = new Birds();
            Sparrow.colour="Yellow";
            Sparrow.eat();
            System.out.println(Sparrow.colour);
            Fish shark = new Fish();
            shark.colour = "pink";
            System.out.println(shark.colour);
            shark.eat();
        }
    }
    
    
        class Animals{
            String colour;
        
            void eat(){
                System.out.println("Eat");
            }
        
            void breathe(){
                System.out.println("Breathe");
            }
        }
    
        class Mammals extends Animals{
            void walk(){
                System.out.println("Walk");
            }
        }
        class Dog extends Mammals{
            int legs;
        }
    
        class Fish extends Animals{
            void Swim(){
                System.out.println("Swim");
            }
        }
        class Shark extends Fish{
            void swim(){
                System.out.println("Swim");
            }
        }
    
        class Birds extends Animals{
            void fly(){
                System.out.println("Fly");
            }
        }

        class peacoak extends Birds{
            void fly(){
                System.out.println("FLY");
            }
        }*/


// POLYMORPHISM

// 1)COMPILE TIME POLYMORPHISM
//  FUNCTION / METHOD OVERLOADING
/*public class OOPS{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5,7));
        System.out.println(calc.sum(1.5f,4.9f));
        System.out.println(calc.sum(1,7,9));
    }
}

class Calculator{
    int sum(int a ,int b ){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}*/

// 2) RUN TIME POLYMORPHISM
//  FUNCTION/METHOD OVERRIDING

/*public class OOPS {

    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
        Animals a = new Animals();
        a.eat();
    }
}
class Animals{
    void eat(){
        System.out.println("Eat anythings");
    }
}
class Dear extends Animals{
    void eat(){
        System.out.println("Eat grass");
    }
}*/

// ABSTRACTION

/*public class OOPS{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walks();
        h.colour();
        h.changecolour();

        chicken c = new chicken();
        c.eat();
        c.walks();
        c.colour(); 

        mustang myhorse = new mustang();
    }
}
abstract class Animals{
    Animals(){
        System.out.println("Animal constructor called");
    }
    String colour; 
    void colour(){
        System.out.println("Brown");
    }
   void eat(){
    System.out.println("animals eat");
   }
   abstract void walks();
}
class Horse extends Animals{
    Horse(){
        System.out.println("Hours Constuctor called");
    }
    void changecolour(){
        System.out.println("Dark Brown");
    }
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}
class mustang extends Horse{
    mustang(){
        System.out.println("Mustang constuctor called");
    }
}
class chicken extends Animals{
    void changecolour(){
        System.out.println("Yellow");
    }
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}*/


// INTERFACES

/*public class OOPS{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();
    }
}

interface Chessplayers{
    void moves();
}
class Queen implements Chessplayers{
    public void moves(){
         System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements Chessplayers{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements Chessplayers{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}*/

// IMPLEMENT MULTIPLE INHERITANCE USEING INTERFACE

/*public class OOPS{
    public static void main(String[] args) {
        Bear b  = new Bear();
        b.eatveg();
        b.eatnonveg();
        }
    }
interface Herbivores{
    void eatnonveg();
}
interface Carnevores{
    void eatveg();
}

class Bear implements Herbivores,Carnevores{
    public void eatveg(){
        System.out.println("Yes Bear eat veg ");
    }
    public void eatnonveg(){
        System.out.println("as well as  Bear eat non-veg");
    }
}*/

// STATIC KEYWORDS
/*public class OOPS{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Schoolname = "KV";

        Student s2 = new Student();
        System.out.println(s2.Schoolname);
        
    }
}
class Student{
    String name;
    int Rollnum;

    static String Schoolname;

    void setname(String name){
        this.name = name;
    }
}*/


// SUPER KEYWORD
/*public class OOPS{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.colour);
        
    }
}
class Animals{
    String colour;
    Animals(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animals{
    Horse(){
        super();
        super.colour = "Black";
        System.out.println("Horse constructor is called");
    }
}*/

    

