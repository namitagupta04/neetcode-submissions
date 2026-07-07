class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Bucket Array
        List<Integer>[] bucket = new List[nums.length + 1];

        // Frequency Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();


        // Step 1: Count frequency of every number
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }


        // Step 2: Put numbers into buckets according to frequency
        for (int key : frequencyMap.keySet()) {

            int frequency = frequencyMap.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }


        // Step 3: Traverse buckets from highest frequency
        int[] result = new int[k];
        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {

            if (bucket[pos] != null) {

                for (int num : bucket[pos]) {
                    result[counter++] = num;
                }
            }
        }

        return result;
    }
}