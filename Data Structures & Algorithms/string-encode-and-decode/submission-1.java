class Solution {

    char DELIMITER = '#';

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append(DELIMITER);
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            // Find the length of the next string
            StringBuilder sb = new StringBuilder();

            while (arr[i] != DELIMITER) {
                sb.append(arr[i++]);
            }

            i++;

            int numOfChars = Integer.valueOf(sb.toString());
            int end = i + numOfChars;

            sb = new StringBuilder();

            while (i < end) {
                sb.append(arr[i++]);
            }

            i--;

            res.add(sb.toString());
        }

        return res;
    }
}