package JavaArrays_String;

public class Calculation {
    int x =10;
    int y=20;

    /*void sum() //Case1- not taking parameters and also not returned any value
    {
        System.out.println(x+y);
    }*/
      /*int sum()  // Case2- not taking parameters but returning value
      {
          return (x+y);
      }*/
    /*void sum(int a, int b) // Case3- taking parameters, but not returning any value
    {
        System.out.println(a+b);
    }*/

    int sum(int a, int b) // Case4- method is taking parameters and also returning a value
    {
        return(a+b);
    }


    public static void main(String[] args) {
        Calculation cal = new Calculation();
       // cal.sum(); // case1
        /*int res=cal.sum(); // case2 returning, not yet printing
        System.out.println(res);*/ // 30

        //cal.sum(100,200); // 300 //case3
        cal.sum(100, 200);
        System.out.println(cal.sum(100, 200));
    }
}
