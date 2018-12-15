import java.awt.*;

public class Passer {

    Point point = new Point(1,1);
    int x = 1;

    public static void main(String[] args) {
Passer passer = new Passer();

//        System.out.println(passer.point);
//        passer.changePoint(passer.point);
//        System.out.println(passer.point);
//        System.out.println();
//
//        System.out.println(passer.x);
//        passer.changeX(passer.x);
//        System.out.println(passer.x);


        passer.toUpperCase(args);

        for (String str: args){
            System.out.println(str);
        }


    }

    //#########################################################################

    void changePoint(Point point){
        point.x = 7;
        point.y = 9;
    }

    void changeX(int x){
        x=8;
    }


    void toUpperCase(String[] tekst){
        for (int i = 0; i < tekst.length; i++) {
            tekst[i] = tekst[i].toUpperCase();
        }

    }











}
