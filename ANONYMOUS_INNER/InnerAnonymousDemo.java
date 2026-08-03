//inner class and anonymous class:

//outer class
class Outer{
    private String message="hello from outer class";

    //Inner class
    class Inner{
        void display(){
            System.out.println("Message "+message);
        }
    }
}

public class InnerAnonymousDemo{
    public static void main(String[] args){
        //Demonstrating inner class
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}