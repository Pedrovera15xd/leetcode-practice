class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        d = {")" : "(", "]" : "[", "}" : "{"}
        stack = []
        if s is None:
            return False

        for char in s:
            if char == "(":
                stack.append(char)

            elif char == "[":
                stack.append(char)

            elif char == "{":
                stack.append(char)

            else:

                if not stack:
                    return False

                else:
                    if d[char] == stack[-1]:
                            stack.pop()

                    else:
                        return False
        
        if not stack:
            return True

        else:
            return False
            
        
        