class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            // count frequency of each character
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            // build a unique key from frequency array
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#');
                key.append(count[i]);
            }

            String keyStr = key.toString();

            // put into map
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
