import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

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

        x2 = topLeft.x+h;
        y2 = topLeft.y+w;

        return this;
    }




}
