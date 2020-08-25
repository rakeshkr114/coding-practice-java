import java.util.Stack;

public class BraceChecker {

  public boolean isValid(String braces) {
    
    //if size isn't even, return false
    if(braces.length()%2 != 0)
      return false;
    
    Stack<Character> stk = new Stack<>();
    for(char c: braces.toCharArray()){
      
      if(stk.size()==0 && (c == ')' || c == '}' || c == ']'))
         return false;
      
      if(stk.size()>0 && (isClosing(stk.peek(),c)))
         stk.pop();
      else
         stk.push(c);
    }
    return stk.isEmpty();
  }
  
  public boolean isClosing(char stk, char c){
    return (stk=='(' && c==')') || (stk=='{' && c=='}') || (stk=='[' && c==']');
  }

}