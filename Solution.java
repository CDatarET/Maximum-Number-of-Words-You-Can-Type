class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int b = 0;
        String[] strs = text.split(" ");
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs[i].length(); j++){
                boolean inv = false;
                for(int k = 0; k < brokenLetters.length(); k++){
                    if(strs[i].charAt(j) == brokenLetters.charAt(k)){
                        b++;
                        inv = true;
                        break;
                    }
                }
                if(inv){
                    break;
                }
            }
        }
        return(strs.length - b);
    }
}
