class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for (int i = 0; i < strs.size(); i++){
            str = str + strs.get(i).length() + "&" + strs.get(i);
        }
        return str;
    }

    public List<String> decode(String str) {
        int currentIndex = 0;
        List<String> strs = new ArrayList<>();
        while (currentIndex < str.length()){
            char currentChar = str.charAt(currentIndex);
            String lengthIndicator = "";
            while (currentChar != '&'){
                lengthIndicator = lengthIndicator + currentChar;
                currentIndex ++;
                currentChar = str.charAt(currentIndex);
            }
            int strLength = Integer.parseInt(lengthIndicator);
            String word = str.substring(currentIndex + 1, currentIndex + 1 + strLength);
            strs.add(word);
            currentIndex = currentIndex + 1 + strLength;
        }
        return strs;
    }
}
