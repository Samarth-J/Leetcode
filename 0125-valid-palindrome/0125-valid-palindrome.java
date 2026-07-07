class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        String s1= str.replaceAll("[^a-z0-9]","");
     
        int i=0,j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}