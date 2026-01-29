class Animal{
    void eat(){
        System.out.println("animal is eating");
        
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
        
    }
}
class Cat extends Animal{
    void noise(){
        System.out.println("meow meow");
    }
}
public class Main{
    public static void main(String[]arg){
        Cat c=new Cat();
        c.noise();
        c.eat();
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
