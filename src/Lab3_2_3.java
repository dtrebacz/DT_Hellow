public class Lab3_2_3 {
    public static void main(String[] args) {

        dog Azor = new dog("Azor");
        dog Burek = new dog("Burek");
        dog Luna = new dog("Luna");
        dog Sunia = new dog("Sunia");


        showDogInfo(Azor);
        showDogInfo(Burek);
        showDogInfo(Luna);




    }

static void showDogInfo(dog MyDog){

    System.out.println("********* DOG INFO ************");
    System.out.println("Dog Name: "+ MyDog.name);
    System.out.println("Dog Nr:" + MyDog.number);
    System.out.println("Dogs in DB: " + dog.count);
    System.out.println("*******************************\n\n");

    }





    }

class dog{

    String name;
    static int count = 0;
    int number;

    public dog(String NameIn) {
        name = NameIn;
        count++;
        number = count;
    }
}



