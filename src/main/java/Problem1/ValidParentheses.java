package Problem1;


public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {

        if(str == null || str.length() == 0) return true;
        if(str.length() % 2 == 1) return false;
        ArrayStack data = new ArrayStack(str.length());
        char chr = str.charAt(0);
        if (chr == '(' || chr == '{' || chr == '[') data.push(chr);
        else return false;

        for (int i = 1; i < str.length(); i++) {
            chr = str.charAt(i);
            switch(chr){
                case '(':
                    data.push(chr);
                    break;
                case '{':
                    data.push(chr);
                    break;
                case '[':
                    data.push(chr);
                    break;
                case ')':
                    if((char) data.peek() != '(') return false;
                    data.pop();
                    break;
                case '}':
                    if((char) data.peek() != '{') return false;
                    data.pop();
                    break;
                case ']':
                    if((char) data.peek() != '[') return false;
                    data.pop();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
