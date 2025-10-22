def test_stack() :
    stack = Stack()

    stack.push(1)
    stack.push(2)
    stack.push(3)   
    assert stack.pop() == 3
    assert stack.pop() == 2
    assert stack.pop() == 1     
    assert stack.is_empty() == True


class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        raise IndexError("pop from empty stack")

    def is_empty(self):
        return len(self.items) == 0
    
test_stack()

def test_problem_stack(s):
    pair = {
        '}': '{',
        ')': '(',
        ']': '[',
    }
    opener = "({["
    stack = []

    for char in s:
        if char in opener:
            stack.append(char)
        else:
            if not stack:
                return False
            top = stack.pop()
            if pair[char] != top:
                return False

    return not stack

assert test_problem_stack("()")
assert test_problem_stack("()[]{}")
assert test_problem_stack("({[][]})")
assert test_problem_stack("({[]})")
assert not test_problem_stack("(]")
assert not test_problem_stack("(()]")
assert not test_problem_stack("(((])")
assert not test_problem_stack("((())")