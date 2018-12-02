public class HalfDolars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        for(int i=0; i<total.length; i++) {
            total[i] = denver[i] + philadelphia[i];
        }
        average = (total[0] + total[1] + total[2])/3;

        for(int i=0; i<total.length; i++){
        System.out.println("Produkcja w 201"+i+"r wynosiła: ");
        System.out.format("%,d%n",total[i]);}






        System.out.println("ś".toUpperCase() + "rednia produkcja: " );
        System.out.format("%,d%n",average);








int[][][] arr3D = new int[4][][];
arr3D[0] = new int[10][];


    }
}
