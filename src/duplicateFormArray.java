import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateFormArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,8,9,6,3};
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            if (!set.contains(i)){
                set.add(i);
            }else{
                if (!list.contains(i)){
                    System.out.println(i);
                    list.add(i);
                }
            }
        }
    }
}
