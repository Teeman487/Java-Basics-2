package JavaArrays_String;

public class SingleDimArray {
    public static void main(String[] args) {
        //int a[] = new int [5];//fixed in size // declared array with size 5, starting index is 0, last index is 4

        //storing/inserting values into array
        /*a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/

        int a[]={100,200,300,400,500}; // not fixed; is dynamic //Declare an array without specifying size
        //Find size of an array
        System.out.println("Length of an array is: "+ a.length); // prints length/size of an array
        System.out.println(a[2]); // 300 // read specific value
        //Read values from an array using classic for loop
         /*for(int i=0;i<=a.length-1;i++)
         {
             System.out.println(a[i]); //100 200 300 400 500 // read all values
         }*/

         //Read values from an array using Advanced/enhanced for loop
        for (int i:a) // reading element fromm a to i
        {
            System.out.println(i); // 100 200 300 400 500
        }

    }
}
