class grandparent{
    void showgrandparent(){
        System.out.println("I am grandparent");
    }
}
class parent extends grandparent{
    void showparent(){
        System.out.println("I am parent");
    }
}
class child extends parent{
    void showchild(){
        System.out.println("show child");
    }
} //multilevel inheritance
public class inheritance{
    public static void main(String args[]){
        child c=new child();
        c.showchild();
        c.showparent();
        c.showgrandparent();
    }
}   