class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Map, List<String>> mapMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j ++){
                char character = strs[i].charAt(j);
                int count = 0;
                charCount.put(character, count);
            }

            for (int j = 0; j < strs[i].length(); j ++){
                char character = strs[i].charAt(j);
                int count = charCount.get(character);
                charCount.put(character, count + 1);
            }

            if (mapMap.containsKey(charCount)){
                List<String> new_array = mapMap.get(charCount);
                new_array.add(strs[i]);
                mapMap.put(charCount, new_array);
            }else{
                List<String> strings = new ArrayList<>();
                strings.add(strs[i]);
                mapMap.put(charCount, strings);
            }
        }
        List<List<String>> string_groups = new ArrayList<>(mapMap.values());

        return string_groups;
    }
}
