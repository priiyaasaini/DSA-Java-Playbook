import java.util.*;
public class twosum {
public static void main(String[] args) {
    int arr[]={2,17,15,7};
    int target=9;
    System.out.println(Arrays.toString(mySum(arr,target)));
}

public static int[] mySum(int arr[],int t){
    int complement;
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        complement=t-arr[i];

        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(arr[i],i);
    }
  return new int[]{};
    
}


}
