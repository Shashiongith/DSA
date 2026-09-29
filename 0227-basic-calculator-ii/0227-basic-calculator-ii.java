class Solution {
    public int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;                       
                operand.push(num);
            }
            else {                          
                while (!operator.isEmpty() && prec(operator.peek()) >= prec(ch)) {
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    operand.push(solve(val1, val2, operator.pop()));
                }
                operator.push(ch);
            }
        }                                  

        while (!operator.isEmpty()) {       
            int val2 = operand.pop();
            int val1 = operand.pop();
            operand.push(solve(val1, val2, operator.pop()));
        }

        return operand.peek();
    }                                      

    private static int prec(char op) {
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }

    private static int solve(int val1, int val2, char op) {
        if (op == '+') return val1 + val2;
        if (op == '-') return val1 - val2;
        if (op == '*') return val1 * val2;
        if (op == '/') return val1 / val2;
        return 0;
    }
}