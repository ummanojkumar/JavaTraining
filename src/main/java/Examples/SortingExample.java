package Examples;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] a = {369, 625, 241, 122, 804, 171, 315, 282, 379, 285, 446, 913, 18,
                237, 776, 96, 180, 301, 220, 852, 757, 266, 175, 598, 16, 73,
                114, 230, 410, 548, 69, 145, 500, 365, 946, 645, 90, 103, 980,
                127, 394, 137, 218, 575, 391, 923, 239, 771, 532, 928, 515, 884,
                167, 721, 398, 197, 742, 253, 828, 237, 418, 341, 116, 419, 185,
                468, 18, 103, 414, 858, 951, 772, 991, 358, 545, 299, 735, 903,
                81, 635, 496, 837, 494, 944, 677, 391, 176, 113, 943, 453, 780,
                36, 587, 834, 526, 613, 539, 314, 456, 519, 574, 307, 444, 908,
                781, 577, 898, 828, 510, 740, 78, 670, 298, 597, 533, 849, 16,
                627, 868, 185, 663, 310, 319, 433, 732, 597, 15};
        SortingExample sortingExample = new SortingExample();
        long start = System.currentTimeMillis();
//        sortingExample.enhancedBubbleSort(a);
        sortingExample.insertionSort(a);
        long stop = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        System.out.println("program executed in : " + (stop - start) + "ms");

    }

    public void insertionSort(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; ++i) {
            int j=i;
           while(j>0 && arr[j-1]>arr[j]) {
               int temp = arr[j];
               arr[j]=arr[j-1];
               arr[j-1] = temp;
               j--;
           }
        }
    }



    public void enhancedBubbleSort(int[] arr) {
        int length = arr.length;
        int i = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            i++;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }

    }


    //bubbleSort
    public void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int x = 1; x < length; x++) {
            for (int j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
