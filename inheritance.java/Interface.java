interface Animal{
    void eat();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}
public class Interface{
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
    }
}
