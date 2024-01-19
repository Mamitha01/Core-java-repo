package src.Oops_30th_dec;

public class Lab125 {
    public static void main(String[] args) {
        //only diagonals in a matrix

        int[][] int_array_2d = new int[3][3];
        int_array_2d[0][0]= 1;
        int_array_2d[0][1]= 2;
        int_array_2d[0][2]= 3;
        int_array_2d[1][0]= 4;
        int_array_2d[1][1]= 5;
        int_array_2d[1][2]= 6;
        int_array_2d[2][0]= 7;
        int_array_2d[2][1]= 8;
        int_array_2d[2][2]= 9;

        //        |1, 2, 3,|
//        |4, 5, 6 |
//        |7, 8, 9 |
//        // i= j


        for (int i = 0; i < int_array_2d.length ; i++) {
            for (int j = 0; j < int_array_2d[i].length; j++) {
                if (i==j){
                    System.out.println(" "+ int_array_2d[i][j]);
                }else{
                    int_array_2d[i][j]=0;
                    System.out.println(" "+ int_array_2d[i][j]);
                }

            }
            System.out.println("\t");
        }


    }
}
