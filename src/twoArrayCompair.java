import java.util.HashSet;
import java.util.Set;

public class twoArrayCompair {
    public static void main(String[] args) {
        int[] arr1 = {1,5,5,9,5,10};
        int[] arr2 = {1,5,9,9,5,10};
        Set<Integer> set1 = new HashSet<>();
        if (arr1.length!= arr2.length)  {
            System.out.println(false);
            return;
        }
        for (int i : arr1){
            set1.add(i);
        }
        for (int i : arr2){
            if (!set1.contains(i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
