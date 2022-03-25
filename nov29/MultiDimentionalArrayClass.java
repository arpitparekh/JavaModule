package nov29;

public class MultiDimentionalArrayClass {

    public static void main(String[] args) {

    //  arr  arr[0][0] = 23

        int arr[][] = new int[2][3];

        // 2  * 3

        int arr2[][][]= { {{1,2,3},{4,5,6},{7,8,9}} , {{1,2,3},{4,5,6},{7,8,9}} };

        for(int i=0;i<2;i++){

            for(int j=0;j<3;j++){

//                System.out.print(arr2[i][j]);        //   00   01   02   // 10   11  12

                for(int k=0;k<3;k++){

                    System.out.print(arr2[i][j][k]);

                }
                System.out.println();

            }

        }



    }
}
