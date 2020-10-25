package Problem1;


public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        LinkedListStack data = new LinkedListStack();
        int pCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i < str.length(); i++){
            char top = (char) data.peek();
            char let = str.charAt(i);
            switch (let){
                case '(':
                    data.push(let);
                    pCount++;
                case '{':
                    data.push(let);
                    cCount++;
                case '[':
                    data.push(let);
                    bCount++;
            }
            switch (top){
                case '(':
                    if(let == ')'){
                        data.pop();
                        pCount--;
                    }
                case '{':
                    if(let == '}'){
                        data.pop();
                        cCount--;
                    }
                case '[':
                    if(let == ']'){
                        data.pop();
                        bCount--;
                    }
            }
        }
        return cCount == 0 && bCount == 0 && pCount == 0;
    }
}
