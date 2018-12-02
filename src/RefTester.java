import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        Point pt1, pt2;

        pt1 = new Point(100,100); //przypisanie referencji do zmiennej pt1
        pt2 = pt1; //przypisanie referencji pt1 do pt2 .. nie tworzymy nowego obiektu tylko przypisujemy referencje

        /*
        Uwaga !!!!
        punkt 2 nie tworzy odrębnego obszaru w pamięci tylko mapuje obszar punktu 1*/

        show(pt1,"Punkt 1: ");
        show(pt2,"Punkt 2: ");

        changePoint(pt1,200,200,"Zmiana referencji punktu 1");

        show(pt1,"Punkt 1: ");
        show(pt2,"Punkt 2: ");
    }



//--------------------------------------------------------------------------------
// Metody narzędziowe
//--------------------------------------------------------------------------------
    static void show(Point point){
        System.out.println("X ="+point.x);
        System.out.println("Y ="+point.y+"\n");
    }

    static void show(Point point, String description){
        System.out.println(description);
        System.out.println("X ="+point.x);
        System.out.println("Y ="+point.y+"\n");
    }

    static void changePoint (Point point,int x, int y,String description){
        System.out.println(description+"\n");
        point.x = x;
        point.y = y;
    }
}
