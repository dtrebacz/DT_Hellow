public class SubPrinter extends Printer {
    int z = 3;

    public static void main(String[] args) {

        Printer Printer = new Printer();
        Printer.printMe();
        System.out.println();

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
        System.out.println();

    }


    void printMe(){
        super.printMe(); //wywolanie metody rodzica
        System.out.println("z="+z);
        System.out.println("jestem egzemplarzem klasy" + this.getClass().getName());
    }

}
