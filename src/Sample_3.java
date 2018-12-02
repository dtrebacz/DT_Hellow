public class Sample_3 {
    // Pare cwiczen z rzutowania zmiennych

    public static void main(String[] args) {

       /* byte a = 7;
        short b;
        int c;

        c = a;  //int miesci byte wiec konwersja moze sie odbyc niejawnie na poziomie kompilatora

        b = (short)c;*/

     /*  int a = 5;
       double b = 13.5;
       int c = (int)b/a;
       int d = (int)b%a;
*/


     Employee emp = new Employee();
     Vicepresident vp = new Vicepresident();

     emp = vp;
     vp = (Vicepresident)emp;

        }

}


class Employee{}
class Vicepresident extends Employee{}
