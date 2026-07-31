public class Exceptionss{
    static void fun(){
        try{
            throw new NullPointerException("Demo for exception in try catch assignment 15");
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown by fun: "+e.getMessage());
            System.out.println("Error class: "+e.getClass().getSimpleName());
            System.out.println("caught inside fun");
            throw e; 
        }
    }

    public static void main(String[] args){
        try{
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Caught in main");
        }
    }
}