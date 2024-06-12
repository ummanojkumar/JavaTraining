package cheatShett.loops;

public class JavaLoops {

    public static void main(String[] args) {
        // 1. for loop
        System.out.println("1. for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

            /*
            1. for loop:
            0
            1
            2
            3
            4
             */

        // 2. while loop
        System.out.println("\n2. while loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

            /*
            2. while loop:
            0
            1
            2
            3
            4
             */

        // 3. do-while loop
        System.out.println("\n3. do-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

            /*
            3. do-while loop:
            0
            1
            2
            3
            4
             */

        // 4. Enhanced for loop (for-each loop)
        System.out.println("\n4. Enhanced for loop (for-each loop):");
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.println(num);
        }

            /*
            4. Enhanced for loop (for-each loop):
            1
            2
            3
            4
            5
             */

        // 5. Nested loops
        System.out.println("\n5. Nested loops:");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.println("m = " + m + ", n = " + n);
            }
        }

            /*
            5. Nested loops:
            m = 0, n = 0
            m = 0, n = 1
            m = 0, n = 2
            m = 1, n = 0
            m = 1, n = 1
            m = 1, n = 2
            m = 2, n = 0
            m = 2, n = 1
            m = 2, n = 2
             */
    }
}
