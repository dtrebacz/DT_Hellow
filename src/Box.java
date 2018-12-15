import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println("Wywolanie buildBox ze wspolzednymi (25,25) i (50,50)");
        box.buildBox(25,25,50,50);
        box.printBox();

// z punktami 10,10 i 20.20


        System.out.println("Wywolanie buildBox punktami (10,10) i (20,20)");
        box.buildBox(new Point(10,10),new Point(20,20));
        box.printBox();

// z punktem 10,10 , szerokością 5 i wysokością 10


        System.out.println("Wywolanie buildBox punktem 10,10 , szerokością 5 i wysokością 10)");
        box.buildBox(new Point(10,10),5,10);
        box.printBox();



    }




    //Przeciążanie metod
    Box buildBox(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point bottomRight){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;

        return this;
    }

    Box buildBox(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;

        x2 = x1+w;
        y2 = y1+h;

        return this;
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
