class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet <Integer> a = new HashSet<>();
    for(int num:nums){
        if(a.contains(num)){
        return true;       
    }
     a.add(num);
    }
    return false;
    }
}