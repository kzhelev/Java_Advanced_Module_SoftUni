package IteratorsAndComparators.CustomStack;


import java.util.*;

public class CustomStack implements Iterable<Integer> {

    private class CustomStackIterator implements Iterator<Integer> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < stack.size();
        }

        @Override
        public Integer next() {
            stack.add(stack.peek());
            index++;
            return stack.pop();
        }
    }

    private Deque<Integer> stack;

    public CustomStack() {
        stack = new ArrayDeque<>();

    }

    public void add(Integer number) {
        stack.push(number);
    }

    public boolean pop() {
        if (stack.size() != 0) {
            stack.pop();
        }
        return stack.size() != 0;
    }

    public void push(Integer number) {
        stack.push(number);
    }

    public void printAll() {
        if (stack.size() > 0) {
            stack.forEach(System.out::println);
            stack.forEach(System.out::println);
        } else {
            System.out.println("No elements");
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomStackIterator();
    }
}
