class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();

        // Put every number in the map
        for (int num : nums) {
            exploredMap.put(num, false);
        }

        // Traverse every number
        for (int num : nums) {

            // Skip if already explored
            if (exploredMap.get(num)) {
                continue;
            }

            exploredMap.put(num, true);

            int currentLength = 1;

            // Check forward
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)) {
                exploredMap.put(nextNum, true);
                currentLength++;
                nextNum++;
            }

            // Check backward
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                exploredMap.put(prevNum, true);
                currentLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}