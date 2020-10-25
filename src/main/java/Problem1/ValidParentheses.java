package Problem1;


public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        ArrayStack data = new ArrayStack(str.length() / 2);
        int pCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i < str.length(); i++){
            char let = str.charAt(i);
            if(let == '('){
                data.push(let);
                pCount++;
            } else if(let == ')' && data.peek() == "(" ){
                data.pop();
                pCount--;
            }
            if(let == '{'){
                data.push(let);
                cCount++;
            } else if(let == '}' && data.peek() == "{"){
                data.pop();
                cCount--;
            }
            if(let == '['){
                data.push(let);
                bCount++;
            } else if(let == ']' && data.peek() == "["){
                data.pop();
                bCount--;
            }
        }
        return cCount == 0 && bCount == 0 && pCount == 0;
    }
}
