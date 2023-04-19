package SkillStorm.DailyProjects.Week_08_Stacks;

import java.util.ArrayList;

public class Stacks<T> {

    // Creating variables
    private final ArrayList<T> myStack;
    private final int myCapacity;

    public static void main(String[] args) {

        // Create new object of Stacks
        Stacks<Integer> myStack = new Stacks<>(10);

        // Defining the sizes of stacks
        myStack.push(10);
        myStack.push(25);

        // Running commands
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
    }

    // Methods
    public Stacks() {
        this.myStack = new ArrayList<>();
        this.myCapacity = Integer.MAX_VALUE;
    }

    public Stacks(int capacity) {
        this.myStack = new ArrayList<>();
        this.myCapacity = capacity;
    }

    public int size() {
        return myStack.size();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }


    // Be able to throw exception
    public void push(T element) {
        if (myStack.size() == myCapacity) {
            throw new StackOverflowError("Stacks is full");
        }
        myStack.add(element);
    }

    public T pop() {
        if (myStack.isEmpty()) {
            throw new RuntimeException("There is nothing there.");
        }
        return myStack.remove(myStack.size() - 1);
    }

    public T peek() {
        if (myStack.isEmpty()) {
            throw new RuntimeException("There is nothing there.");
        }
        return myStack.get(myStack.size() - 1);
    }

    // Overrides
    @Override
    public String toString() {
        return myStack.toString();
    }
}