class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for parenthesis in s:
            if (parenthesis in "({["):
                stack.append(parenthesis)
            else:
                if (len(stack) == 0):
                    return False
                if (parenthesis == ')' and stack.pop() != '('):
                    return False
                elif (parenthesis == '}' and stack.pop() != '{'):
                    return False
                elif (parenthesis == ']' and stack.pop() != '['):
                    return False
        if (len(stack) != 0):
            return False
        return True