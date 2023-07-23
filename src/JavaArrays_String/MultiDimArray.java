package JavaArrays_String;

public class MultiDimArray {
    public static void main(String[] args) {
        /*int a[][] = new int [3][2];  // for known sixe; specific
        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;*/

        //    0     1
        // 0  00    01
        // 1  10    11
        // 2  20    21

        // Outer for loop rep rows(0 1 2)
        // Inner for loop rep columns (o 1)

        int a [][]={{100,200}, {300,400}, {500,600} ,{700, 800} };

        System.out.println("Number of rows: " + a.length);
        System.out.println("Numberof columns:" + a[0].length);

        // Outer for loop --row
         /*for(int i=0;i<a.length; i++) //         0          1          2
         {
             // Inner loop --- col
             for(int j=0;j<a[i].length; j++) //   0   1     0    1      0   1
             {
                 System.out.println(a[i][j]); // 100  200   300  400    500  600
             }*/

        // Enhanced for loop
        for (int r[]:a) // 100, 200//300 400//500 600 reading a [][](dimensional) and store into r single(r[])
        {
            for (int i:r) // reading r single array into i
            {
                System.out.println(i); // 100 200 300 400 500 600
            }
        }
         }
    }

