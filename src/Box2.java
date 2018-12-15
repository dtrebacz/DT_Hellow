import java.awt.*;

public class Box2 {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box2(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    Box2(Point topLeft, Point bottomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }
    Box2 (Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;

        x2 = x1+w;
        y2 = y1+h;
    }





    public static void main(String[] args) {
        Box2 box = new Box2(25,25,50,50);

        System.out.println("Box A: Wywolanie buildBox ze wspolzednymi (25,25) i (50,50)");
            box.printBox();

// z punktami 10,10 i 20.20
        box = new Box2(new Point(10,10),new Point(20,20));

        System.out.println("Box B: Wywolanie buildBox punktami (10,10) i (20,20)");
        box.printBox();

// z punktem 10,10 , szerokością 5 i wysokością 10

         box = new Box2(new Point(10,10),5,10);
        System.out.println("Box C: Wywolanie buildBox punktem 10,10 , szerokością 5 i wysokością 10)");
        box.printBox();



    }





    void printBox(){
        System.out.print("Box: <");
        System.out.print(x1+ ","+y1);
        System.out.print(";");
        System.out.print(x2+ ","+y2);
        System.out.print(">");
        System.out.println("");
    }


}

