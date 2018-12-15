public class Test {
    public static void main(String[] args) {
        X x = new X();
        x.introduce();


        Y y= new Y();
        y.introduce();

        Letter letter1 = new X();
        Letter letter2 = new Y();

        letter1.introduce();
        letter2.introduce();

    }

}


interface Letter{
    void introduce();

}

class X implements Letter{

    @Override
    public void introduce() {
        System.out.println("Jestem x");
    }
}

class Y extends X implements Letter{

    @Override
    public void introduce() {
        System.out.println("Jestem y");
    }
}