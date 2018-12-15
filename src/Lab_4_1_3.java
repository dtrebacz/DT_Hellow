public class Lab_4_1_3 {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("new cA();");
        new cA();

        System.out.println("new cB();");
        new cB();

        System.out.println("new cC();");
        new cC();


        System.out.println("-----------------------------------------------");
        System.out.println("new cA(true);");
        new cA(true);

        System.out.println("new cB(true);");
        new cB(true);

        System.out.println("new cC(true);");
        new cC(true);

        System.out.println("-----------------------------------------------");
        System.out.println("new cA(false);");
        new cA(false);

        System.out.println("new cB(false);");
        new cB(false);

        System.out.println("new cC(false);");
        new cC(false);







    }


}







class cA{
    public cA() {
        System.out.println("konstruktor klasy cA");
    }

    public cA(boolean command){

        if(!command) {
            System.out.println("konstruktor klasy cA");
        }
    }
}


class cB extends cA {
    public cB() {
        System.out.println("konstruktor klasy cB");
        }

    public cB(boolean command){
        super(true);
        if(!command) {
             System.out.println("konstruktor klasy cB");
        }



    }
}

class cC extends cB{
    public cC() {
        System.out.println("konstruktor klasy cC");
    }

    public cC(boolean command){
        super(true);
        if(!command) {
            System.out.println("konstruktor klasy cC");

        }
    }
}