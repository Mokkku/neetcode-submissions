class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2){
            return s.length();
        }

        int maxLength = 0;

        int front = 0;
        int back = 0;
        int subLength = front - back + 1;

        Set<Character> hash = new HashSet<>();

        while(front < s.length()){

            if (hash.contains(s.charAt(front))){
                while(s.charAt(back) != s.charAt(front) && back < front){
                    hash.remove(s.charAt(back));
                    back++;
                }
                back++;
            }

            subLength = front - back + 1;

            if (subLength > maxLength){
                maxLength = subLength;
            }

            hash.add(s.charAt(front));            
            front++;

        }
        return maxLength;

    }
}
