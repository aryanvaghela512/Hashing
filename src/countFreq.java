import java.io.IOError;
import java.util.HashMap;
import java.util.Map;

public class countFreq {
    public static void main(String[] args) {
        int[] arr = {4,8,5,8,9,6,9,7,7,7,5,5,4,2};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        int maxferq = 0;
        int maxkey = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()){
//            if (maxferq <= m.getValue()){
//                maxferq = m.getValue();
//                maxkey = m.getKey();
//            }
            if (m.getValue() > 1){
                System.out.println(m.getKey()+" : "+ m.getValue());
            }
        }
//        System.out.println(maxkey+" : "+ maxferq);

    }
}
