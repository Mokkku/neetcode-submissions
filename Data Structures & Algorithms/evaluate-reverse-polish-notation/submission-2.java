class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++){
            if ("+-*/".indexOf(tokens[i]) != -1){
                int total = Integer.parseInt(stack.pop());
                switch(tokens[i]){
                    case "+":
                        total += Integer.parseInt(stack.pop());
                        break;
                    case "-":
                        total = Integer.parseInt(stack.pop()) - total;
                        break;
                    case "*":
                        total *= Integer.parseInt(stack.pop());
                        break;
                    case "/":
                        total = Integer.parseInt(stack.pop()) / total;
                        break;
                    }
                stack.push(String.valueOf(total));
            } else{
                stack.push(tokens[i]);
            }
        }

        return Integer.parseInt(stack.pop());
    }

}
