package Class_Work.Week_06_LinkedLists.Generics;

public class MyGeneric2<T, V> { // 2 Generics

    // Variables
    private T a;
    private V b;

    // Constructors
    public MyGeneric2(T a, V b) {
        this.a = a;
        this.b = b;
    }


    // Getters and Setter
    public T getA() {
        return this.a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public V getB() {
        return this.b;
    }
    public void setB(V b) {
        this.b = b;
    }
}
