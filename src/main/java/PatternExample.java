public class PatternExample {

    public static void main(String[] args) {
//        invertedTriangle();

//        mirrorRightAngleTriangle();

//        mirror2();
    }

    private static void mirror2() {
        for (int i=1; i<=10;i++) {
            for (int j=1; j<=10; j++) {
                if (j<i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    /* mirror2
    12345678910
     2345678910
      345678910
       45678910
        5678910
         678910
          78910
           8910
            910
             10
     */

    private static void mirrorRightAngleTriangle() {
        for (int i=1; i<=10;i++) {
            for (int j=1; j<=10; j++) {
                if (j<=10-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    /* mirrorRightAngleTriangle
         10
        910
       8910
      78910
     678910
    5678910
   45678910
  345678910
 2345678910
12345678910

     */

    private static void invertedTriangle() {
        for (int i=1; i<=10;i++) {
            for (int j=1; j<=11-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /* invertedTriangle
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7 8
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

     */
}
