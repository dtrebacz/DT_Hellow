public class IncDec {
    public static void main(String[] args) {

        int x = 42;
        int y;

        y = x++;
        System.out.println("x="+  x +", y =" + y);

        x=42;
        y = ++x;
        System.out.println("x="+ x +", y =" + y);

        int a = 0,b;

        b= a++ + a++;

        System.out.println("(b= a++ + a++)  a=" + a + ", b=" + b);








    }
}
