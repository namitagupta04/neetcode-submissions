class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet <Integer> a = new HashSet <Integer> ();
    for(int i = 0;i<nums.length;i++){
        a.add(nums[i]);
    }
    if(nums.length == a.size()){
        return false;
    } else{
        return true;
    }
    }
}