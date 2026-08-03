//Normal Class
class Animal{
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

public class InnerAnonymousDemoo{
    public static void main(String[] args){
        //Demonstrating inner class
       Animal a = new Animal(){
    public void sound(){
        System.out.println("Dog Barks");
    }
};
a.sound();
    }
}

