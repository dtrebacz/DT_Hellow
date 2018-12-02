public class Lab3_2_2 {

    public static void main(String[] args) {

        item item1 = new item();
        item item2 = new item();
        item item3 = new item();

        set(item1,2,5,19);
        set(item2,10,8,12);
        set(item3,45,23,38);

        show(item1,"Item1 data:");
        show(item2,"Item2 data:");
        show(item3,"Item3 data:");

    }








 //-------------------------------------------------------------------

    static void set (item it,int h, int w, int d  ){
        it.height = h;
        it.weight = w;
        it.depth = d;

    }



    static void show (item it,String descr){

        System.out.println(descr);
        System.out.println("item height = "+ it.height);
        System.out.println("item weight = "+ it.weight);
        System.out.println("item depth = "+ it.depth);
        System.out.println("");






}




}


//****************************************************************************
class item{

    int height;
    int weight;
    int depth;



}


