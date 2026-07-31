public class Nestedtry {
    public static void main(String[] args){
            try{

                try{
                    int result = 10/0;
                    System.out.println("Result: "+result);
                } catch (ArithmeticException e){
                    System.out.println("Exception: "+e.getMessage());
                    System.out.println("Error: "+e.getClass().getSimpleName()+"error occurred");
                }
            } catch (NullPointerException e) {
                System.out.println("Exception: "+e.getMessage());
                System.out.println("Error: "+e.getClass().getSimpleName()+" error   occurred");
            }
            finally {
                System.out.println("block executed");
            }
    }
}