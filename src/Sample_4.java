public class Sample_4 {
    public static void main(String[] args) {

        int a = 1;

        // Warunek if
        if (a>0){
            System.out.println("a>0");
        } else if (a<0){
            System.out.println("a<=0");
        } else  System.out.println("a=0");

        //switch
        char grade = 'B';

        System.out.println("Twoje ocena to: "+grade);

        switch (grade){

            case 'A':
                System.out.println("zajebiście");
                break;

            case'B':
                System.out.println("dobrze");
                break;

            case'C':
                System.out.println("jakos bedzie");
                break;

                default:
                System.out.println("Kurwa gościu !!!!!");





        }








    }



}
