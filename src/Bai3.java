public class Bai3 {

    private static int oddCount = 0;
    private static int evenCount = 0;

    private static void getOddAndEvenCount(int []arr){
        for (int i : arr){
            if(i % 2 == 0) ++evenCount;
            else ++oddCount;
        }
    }

    public static void main(String[] args) {

        int []arr = new int[] {1,2,3,4,5,6,7,8,9, 9,2};
        getOddAndEvenCount(arr);
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd element: " + oddCount);
    }
}
