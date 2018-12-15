public class Sample_6 {



    public static void main(String[] args) {
        new A();
        new A(1);
        new A("ddd");
    }


}

//*******************************************************************
class A{
    // Klasa a ma 3 konstruktory z różnymi argumentami
    A(){
        System.out.println("A: konstruktor bezargumentowy...");
    }
    A(int i){
        System.out.println("A: konstruktor ze zmienną int... arg: "+i);
    }
    A(String S){
        System.out.println("A: konstruktor ze zmienną String... arg: "+S);
    }

}


class B{


}