public class MultipleCatch {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("Result: "+result);
        } catch (NullPointerException e){
            System.out.println("Error Null Pointer exception null object");
        } catch (Exception e) {
            System.out.println(" another error occurred");
        }


        
        try{
           

            int result = 10/0;
            System.out.println("Result: "+result);
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("Exception: "+e.getMessage());
            System.out.println("Error: "+e.getClass().getSimpleName()+" exception occurred.");

        }
        System.out.println("will continue even after exception occurrence");

    }
}