class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        int left = 0;
        int ones = 0;

        String result = "";

        for (int right = 0; right < n; right++) {

            // Add current character
            if (s.charAt(right) == '1') {
                ones++;
            }

            // We have more than k ones
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            // We have exactly k ones
            if (ones == k) {

                // Remove leading zeros to get the shortest substring
                while (left < right && s.charAt(left) == '0') {
                    left++;
                }

                String temp = s.substring(left, right + 1);

                // Update answer
                if (result.isEmpty()
                        || temp.length() < result.length()
                        || (temp.length() == result.length()
                            && temp.compareTo(result) < 0)) {
                    result = temp;
                }
            }
        }

        return result;
    }
}