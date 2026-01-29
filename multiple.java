class Animal{
    void eat(){
        System.out.println("eating something");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}
class Cat extends Dog{
    void noise(){
        System.out.println("meow meow");
    }
}
public class Main{
    public static void main(String[]adi){
        Cat d=new Cat();
        d.bark();
        d.eat();
        d.noise();
    }
}
