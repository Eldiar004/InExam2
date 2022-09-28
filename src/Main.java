import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(twoSum(List.of(10, 90, 13, 9,1), 23));
    }
    public static List<Integer> twoSum(List<Integer> num,int target){
        for (int i = 0; i < num.size()-1; i++) {
            for (int j = i; j < num.size(); j++) {
                if (num.get(i)+ num.get(j)==target){
                    return new ArrayList<>(List.of(i,j));
                }
            }
        }
        return num;
    }
}