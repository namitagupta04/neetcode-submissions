class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();        
         for(int no:nums){
         if(s.add(no)==false){
           return true;
         }        
          } 
          return false;            
        }        
    }
