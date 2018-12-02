public class Array3d {

    public static void main(String[] args) {

        int[][][] array = { {{1},{1,2,3}},{{1,2},{3}},{{2,5,3}}};

        //System.out.println(array[1][2][0]);

      for(int a=0;a < array.length;a++)
      {
          System.out.println("###########################################");
      for (int b=0;b < array[a].length ; b++)
      {
          System.out.println();
      for (int c=0;c< array[a][b].length;c++) {

          System.out.print("array[" + a + "][" + b + "][" + c + "] =>" + array[a][b][c] +"\n");
      }
      } System.out.println();

      } System.out.println("###########################################");



    }
}
