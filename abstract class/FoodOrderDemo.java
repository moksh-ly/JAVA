abstract class orders{
    abstract void calculateBill();  
    double foodcost;
    public orders(double foodcost){
        this.foodcost=foodcost;
    }
}

class dinein extends orders{
    public dinein(double foodcost){
        super(foodcost);
    }
    void calculateBill(){
        double totalbill=foodcost+foodcost*0.05;
        System.out.println("Total bill for dine-in order: "+totalbill);
    }
}
class ordertakeaway extends orders{
    public ordertakeaway(double foodcost){
        super(foodcost);
    }
    void calculateBill(){
        double totalbill=foodcost+foodcost*0.02;
        System.out.println("Total bill for takeaway order: "+totalbill);
    }
}
public class FoodOrderDemo {
    public static void main(String[] args) {
        dinein dineinorder=new dinein(100);
        ordertakeaway takeawayorder=new ordertakeaway(100);
        dineinorder.calculateBill();
        takeawayorder.calculateBill();
    }
}