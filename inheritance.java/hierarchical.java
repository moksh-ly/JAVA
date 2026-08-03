class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class hierarchical{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
        cat c=new cat();
        c.meow();
        c.eat();
    }
}