public class Lab3_2_3 {
    public static void main(String[] args) {

        dog Azor = new dog("Azor");
        dog Burek = new dog("Burek");
        System.out.println(dog.count);

    }







    }

class dog{

    String name;
    static int count = 0;

    public dog(String NameIn) {
        name = NameIn;
        count++;
    }
}



