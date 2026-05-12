import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

     HashMap <Integer,Integer> frqmap = new HashMap<>();
     List <Integer> result = new ArrayList<>();

//calculate duplicate frquency
    for(int i=0;i<nums.length;i++){
        frqmap.put(nums[i],frqmap.getOrDefault(nums[i],0)+1);
    }
     
  //find nums which freq is more than 1 and those are out duplicates


for(Map.Entry<Integer,Integer> entry :frqmap.entrySet()){

    if(entry.getValue()>1){
        result.add(entry.getKey());
    }
}

return result;


     

    }
}