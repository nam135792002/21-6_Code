import java.util.HashSet;
import java.util.Set;

public class Bai1 {

    /**
     *
     * @param arr
     * @return the sum of distinct element in array
     */
    public static int sumOfDistinctElements(int[] arr){

        // khai báo hashset để lưu trử các phần tử duy nhất
        Set<Integer> setInteger = new HashSet<>();
        int sum = 0;

        // duyệt từng phần tử trong mảng và thêm ohần tử duy nhất
        // vào trong set
        for (int i : arr) {
            setInteger.add(i);
        }

        // cộng các phần tử trong set
        for(int j : setInteger){
            sum += j;
        }

        return sum; // trả kết quả
    }



    public static void main(String[] args) {
        int []arr = new int[] {5,1,8,4,9,1,5,5,1};
        System.out.println(sumOfDistinctElements(arr));
    }
}
