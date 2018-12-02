import java.awt.*;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int arr2[] = new int[100];
        int[] arr3 = {1,2,3,99};


        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println("");


        Point[] points = {new Point(1,1), new Point(3,2),new Point(5,4)};
        String[] titles = {"Pan", "Pani","Państwo", "Panna","Doktor"};

        System.out.println(points[1].y);
        System.out.println(titles[4]);
        System.out.println("");
        System.out.println(titles.length);









    }
}
