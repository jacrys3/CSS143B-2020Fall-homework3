package Problem1;

import java.util.StringTokenizer;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        ArrayStack data = new ArrayStack(str.length() / 2);
        StringTokenizer st = new StringTokenizer(str);
        int pCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(st.nextToken() == "("){
                data.push(st.nextToken());
                pCount++;
            } else if(data.peek() == "(" && st.nextToken() == ")"){
                data.pop();
                pCount--;
            }
            if(st.nextToken() == "{"){
                data.push(st.nextToken());
                cCount++;
            } else if(data.peek() == "{" && st.nextToken() == "}"){
                data.pop();
                cCount--;
            }
            if(st.nextToken() == "["){
                data.push(st.nextToken());
                bCount++;
            } else if(data.peek() == "[" && st.nextToken() == "]"){
                data.pop();
                bCount--;
            }
        }
        return cCount == 0 && bCount == 0 && pCount == 0;
    }
}
