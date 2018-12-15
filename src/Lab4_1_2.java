import java.awt.*;

public class Lab4_1_2 {

    public static void main(String[] args) {

        FourPoint fourPoint = new FourPoint();

        fourPoint.x = 1;
        fourPoint.y = 2;
        fourPoint.z = 10;
        fourPoint.y = 12;

        ShowPoint(fourPoint);

        FourPoint fourPoint1 = new FourPoint(5,5,10,10);
        ShowPoint(fourPoint1);

    }


    static void ShowPoint(FourPoint point){

        System.out.println("x: " +point.x+ ", y: " +point.y+", z: " +point.z+ ", v: " +point.v);


    }


}


 class FourPoint extends Point{
    int z;
    int v;

    FourPoint(){

    }

     FourPoint(int x, int y, int z, int v){
        super(x,y);
        this.z = z;
        this.v = v;

     }






}