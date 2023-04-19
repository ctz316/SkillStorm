package SkillStorm.Class_Work.Week_06_LinkedLists.Generics;

public class MyGeneric<T> { // Generic class <T>

    private T a;

    public MyGeneric(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

}
