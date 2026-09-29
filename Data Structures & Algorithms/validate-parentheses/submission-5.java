class Solution {

        public boolean isValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();

            // for(int i = s.length()-1; i >= 0; i--){
            //     stack.push(s.charAt(i));
            // }
            if(s.length() %2 !=0) {
                return false;
            }
            for (char c: s.toCharArray()){
                if (c == '{' || c == '[' || c== '(') {
                    stack.push(c);
                } else if (c == '}' || c == ']' || c== ')') {
                    if(stack.isEmpty()) return false;
                    if(isValid(stack.pop(), c)){
                        continue;
                    } else return false;
                }

            }            
            if(!stack.isEmpty()) return false;
            else return true;
        }

    // public boolean isValid(String s) {
    //     int fi =0;
    //     int bi = s.length()-1;

    //     while (fi < bi){
    //         if(isValid(s, fi, bi)){
    //             fi++;
    //             bi--;
    //         } else{
    //              return false;
                
    //         }
    //     }
    //     return true;
        
    // }


     public boolean isValid( char c1, char c2){      
        System.out.printf("Char1: %c | char2: %c \n", c1, c2)  ;
        switch (c1){
            case '{':
                if(c2 == '}') return true;
                else return false;                
            case '(':
                if(c2 == ')') return true;
                else return false;
            case '[':
                if(c2 == ']') return true;
                else return false;
            default:
                return false;
        }
        
    }

    public boolean isValid(String s, int fi, int bi){      
        System.out.printf("Char1: %c | char2: %c", s.charAt(fi), s.charAt(bi))  ;
        switch (s.charAt(fi)){
            case '{':
                if(s.charAt(bi) == '}') return true;
                else return false;                
            case '(':
                if(s.charAt(bi) == ')') return true;
                else return false;
            case '[':
                if(s.charAt(bi) == ']') return true;
                else return false;
            default:
                return false;
        }
        
    }
}
