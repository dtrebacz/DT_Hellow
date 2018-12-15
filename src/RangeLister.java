public class RangeLister {

    public static void main(String[] args) {
        int[] range;

        // metodę nie statyczną możemy wywołać tylko na stworzonym obiekcie a nie tak jak statyczną bezpośrednio
        RangeLister rangeLister = new RangeLister();

       range = rangeLister.makeRange(4,23);

       rangeLister.show(range);
        System.out.println("");
       rangeLister.show2(range);





    }

//**************************************************************************

    //Metoda
int[] makeRange (int lower, int upper) {
    int[] range = new int[upper-lower+1]; //definicja tablicy wyjsciowej

    for (int i = 0; i < range.length; i++) {
     range[i] = lower++;
    }


    return range ;
}

void show(int[] table){
    int idx=0;
    for (int i: table) {

        System.out.println("table["+(idx++)+"]="+i );

    }

}

    void show2(int[] table){
        int idx=0;
        System.out.println("table[");
        for (int i: table) {

            System.out.print(i+" " );

        }
        System.out.println("]");

    }


}
