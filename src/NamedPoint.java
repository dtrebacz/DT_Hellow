import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }


    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5,5,"smallPoint");

        System.out.println("X wynosi " + np.x +  "Y wynosi "+ np.y + " Punkt nazywa się "+np.name);

    }


}
