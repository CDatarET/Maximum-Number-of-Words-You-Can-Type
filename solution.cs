public class Solution {
    public int CanBeTypedWords(string text, string brokenLetters) {
        int b = 0;
        string[] strs = text.Split(" ");
        for(int i = 0; i < strs.Length; i++){
            for(int j = 0; j < strs[i].Length; j++){
                bool inv = false;
                for(int k = 0; k < brokenLetters.Length; k++){
                    if(strs[i][j] == brokenLetters[k]){
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
        return(strs.Length - b);
    }
}
