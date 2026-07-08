class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='('){
                stack.push(ch);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if((ch=='}'&& stack.pop()!='{') || (ch==']'&&stack.pop()!='[') || (ch==')'&&stack.pop()!='(') )
            {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}