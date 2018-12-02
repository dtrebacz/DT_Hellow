public class Lab3_3_2 {

    public static void main(String[] args) {
String input ="";
        double number = 0;


        if(args.length >0) {
            input = args[0];

            switch (input) {
                case "jeden":
                    number = 1;
                    break;

                case "dwa":
                    number = 2;
                    break;

                case "trzy":
                    number = 3;
                    break;

                case "cztery":
                    number = 4;
                    break;

                case "pięć":
                    number = 5;
                    break;

                case "sześć":
                    number = 6;
                    break;

                case "siedem":
                    number = 7;
                    break;

                case "osiem":
                    number = 8;
                    break;

                case "dziewięć":
                    number = 9;
                    break;

                case "dziesięć":
                    number = 10;
                    break;

                default:
                    number = 0;

            }
            System.out.println("podana liczba to: " + number);
        }else System.out.println("Nie podano argumentu");




       }






    }




