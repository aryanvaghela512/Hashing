import java.util.HashSet;
import java.util.Set;

public class SubSetOrNot {
    public static void main(String[] args) {
        int[] arr1 = {1,2,50,4,3,5,6,5,6,3};
        int[] arr2 = {2,4,50};
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i< arr2.length;i++){
            if (!set.contains(arr2[i])){
                System.out.println("Not SubSet...");
                return;
            }
        }
        System.out.println("SubSet...");
        System.out.println(set);
    }
}
