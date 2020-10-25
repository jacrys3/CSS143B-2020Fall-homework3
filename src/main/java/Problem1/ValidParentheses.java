package Problem1;


public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        ArrayStack data = new ArrayStack(str.length());
        if(str == null || str.length() == 0) return true;
        if(str.length() % 2 == 1) return false;

        char chr = str.charAt(0);
        if (chr == '(' || chr == '{' || chr == '[') data.push(chr);
        else return false;

        for (int i = 1; i < str.length(); i++) {
            chr = str.charAt(i);
            switch(chr){
                case '(':
                    data.push(chr);
                case '{':
                    data.push(chr);
                case '[':
                    data.push(chr);
                case ')':
                    if((char) data.peek() != '(') return false;
                    data.pop();
                case '}':
                    if((char) data.peek() != '{') return false;
                    data.pop();
                case ']':
                    if((char) data.peek() != '[') return false;
                    data.pop();
            }
        }
        return true;
    }
}
