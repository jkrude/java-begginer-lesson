package lesson8;

// It is not important what types we store: Generic types X and Y.
// We can use the types X and Y in the whole class, because we declared it in the class signature.
public class Pair<X, Y> {

    private X x;
    private Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    // Generic types can also be declared for only one method → Z will only be usable in this method
    private static <Z> void foo(Z z) {
        System.out.println(z);
    }

}
