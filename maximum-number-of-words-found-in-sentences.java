class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
         for(int i=0; i<sentences.length; i++){
             String s = sentences[i];
             String word[] = s.split(" ");
             int count = word.length;

             if(count>max)
             max= count;
         }
           return max;
        }
       
    }
