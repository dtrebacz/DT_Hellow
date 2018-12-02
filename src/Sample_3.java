public class Sample_3 {
    // Pare cwiczen z rzutowania zmiennych

    public static void main(String[] args) {

        byte a = 7;
        short b;
        int c;

        c = a;  //int miesci byte wiec konwersja moze sie odbyc niejawnie na poziomie kompilatora

        b = (short)c;


    }
}
