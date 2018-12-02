public class Sample_5 {
    public static void main(String[] args) {


       int[] arr = {2,1,5,7,54,3,7,2,8,9};

        for (int i: arr)
        {
            if (i==54) continue;
            System.out.print(i+" ");
        }



        int[] arr1 = new int[1000];

        for (int i=0; i <1000; i++){
            arr1[i] = 4;
            if(i>4) break;
        }

        for (int i: arr1 ) {

            System.out.print(i+" ");



        }




//        boolean isOK = true;
//
//    do  {
//        System.out.println("Jest dobrze !!!");
//
//    }while(isOK);
//
//        System.out.println("Nie jest dobrze !!!");






//        int a = 13;
//
//        if(args.length > 0){
//            a = Integer.parseInt(args[0]);
//        }
//
//        System.out.println(a>5 ? "wieksze" : "Mniejsze");


//        for(int i=1;i<=10;i++) {
//            System.out.println("zapętlone" + i);
//        }


    }
}
