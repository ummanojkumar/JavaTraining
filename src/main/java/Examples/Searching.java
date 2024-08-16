package Examples;

public class Searching {

    public static void main(String[] args) {
//    Searching.linearSearch(new int[]{1,3,5,8,9}, 8);

        System.out.println(Searching.binarySearch(new int[]{1,2,5,6,7,8,9}, 7));
    }

    static void linearSearch(int[] array, int num) {
        for(int x=0; x<array.length; x++) {
            if(num==array[x]) {
                System.out.println("Index fount at "+ x);
            }
        }
       System.out.println("Index not found");
    }

   static int binarySearch(int array[], int num) {
        //arrays should be in ascending order
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (num==array[mid]) {
                return mid;
            } else if (num<array[mid]){
                high = mid -1;
            } else if (num>array[mid]) {
                low = mid+1;
            }
        }
        return -1;
    }
}
