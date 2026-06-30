class Solution {
    public static boolean ispalindrome(String s1){
        int i=0,j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public String longestPalindrome(String s) {
        String word=s.substring(0, 1);
        int max=0;
        String temp="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
               temp=s.substring(i,j);
               if(ispalindrome(temp) && temp.length() > max){
                max=temp.length();
                word=temp;
               }
            }
        }
        return word;
    }
}