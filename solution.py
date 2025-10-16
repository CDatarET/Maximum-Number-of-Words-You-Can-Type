class Solution:
    def canBeTypedWords(self, text, brokenLetters):
        b = 0
        strs = text.split(" ")
        for i in range(len(strs)):
            broke = False
            for j in range(len(strs[i])):
                if strs[i][j] in brokenLetters:
                    b += 1
                    broke = True
                    break

            if(broke):
                continue
                
        return len(strs) - b
