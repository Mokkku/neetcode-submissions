class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCountS = new HashMap<>();
        HashMap<Character, Integer> charCountT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i ++){
            char character = s.charAt(i);
            int count = 0;
            charCountS.put(character,count);
        }
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            int count = charCountS.get(character);
            charCountS.put(character,count + 1);
        }

        for (int i = 0; i < t.length(); i ++){
            char character = t.charAt(i);
            int count = 0;
            charCountT.put(character,count);
        }
        for (int i = 0; i < t.length(); i++){
            char character = t.charAt(i);
            int count = charCountT.get(character);
            charCountT.put(character,count + 1);
        }

        return charCountS.equals(charCountT);
    }
}