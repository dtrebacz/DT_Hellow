import java.awt.*;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

//Ustawianie wartosci dla punktu
public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4,13);
        show(location, "Położenie początkowe: ");


        changePoint(location,7,6,"Zmiana lokalizacji na (7,6)");
        show(location, "Położenie końcowe: ");



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
