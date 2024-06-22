import com.sun.jdi.request.DuplicateRequestException;

import java.util.*;

public class Bai6 {

    public static void checkDuplicate(int []arr) throws DuplicateRequestException{
        Map<Integer, Integer> intMap = new LinkedHashMap<>();
        intMap.put(arr[0], 0);
        for (int i = 1; i < arr.length; i++){
            if(intMap.containsKey(arr[i])){
                Integer value = intMap.get(arr[i]);
                intMap.replace(arr[i], ++value);
            }else{
                intMap.put(arr[i], 0);
            }
        }

        List<Integer> listInteger = new LinkedList<>();
        for (Integer j : intMap.keySet()){
            if (intMap.get(j) != 0){
                listInteger.add(j);
            }
        }

        if(listInteger.isEmpty()){
            System.out.println("No duplicate numbers!");
        }else{
            throw new DuplicateRequestException("Error: Duplicate number found: " + listInteger);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int numbers = sc.nextInt();

        int []intArray = new int[numbers];

        System.out.println("Input the integers: ");
        for (int i = 0; i < numbers; i++){
            try {
                intArray[i] = sc.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Input invalid. Enter again!");
                i--;
                sc.next();
            }
        }
        try {
            checkDuplicate(intArray);
        }catch (DuplicateRequestException ex){
            System.out.println(ex.getMessage());
        }
    }
}
