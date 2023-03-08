package Class_Work.week_02;

public class Day_3_Arrays {
    public static void main (String[] args) {

    // Setting up literal array
    System.out.println("--- Section 1 ---");
        int[] myNumbers = { 1, 2, 3, 4, 5 }; // Arrays start with position 0
            int a = myNumbers[0] ;
                System.out.println(a);
            int b = myNumbers[2] ;
                System.out.println(b);
            int c = myNumbers[4] ;
                System.out.println(c);

    // Change info stored in array with position number
    System.out.println("--- Section 2 ---");
        myNumbers[0] = 10;
            System.out.println(myNumbers[0]);
        myNumbers[1] = 11;
            System.out.println(myNumbers[1]);
        myNumbers[4] = 12;
            System.out.println(myNumbers[4]);

    // to find length of array
    System.out.println("--- Section 3 ---");
        int size = myNumbers.length;
            System.out.println(size - 1);
    }
}
