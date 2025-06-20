class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens) {
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                Integer val2 = st.pop();
                Integer val1 = st.pop();

                if(str.equals("+")) {
                    st.push(val1+val2);
                }
                if(str.equals("-")) {
                    st.push(val1-val2);
                } if(str.equals("*")) {
                    st.push(val1*val2);
                } if(str.equals("/")) {
                    st.push(val1/val2);
                }
         }
            else {
                 st.push(Integer.valueOf(str));
             }
        }
        return st.pop();
        }
    }
