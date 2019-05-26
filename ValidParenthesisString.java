class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> bracket = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                bracket.push(i);
            }
            else if(s.charAt(i) == '*'){
                star.push(i);
            }
            else{
                if(!bracket.isEmpty()){
                    bracket.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else
                    return false;
            }
        }
        while((!bracket.isEmpty()) && (!star.isEmpty())){
            //check indexes 
            if(star.pop() < bracket.pop()){
                return false;
            }
        }
        return bracket.isEmpty();
    }
}