package Leetcode;

public class TestGet<T> {

    private T t;

    public TestGet(T t) {
        this.t = t;
    }

    public TestGet(TestGet<? extends T> testGet) {
        t = testGet.t;
    }

    public boolean equalTo(TestGet<?> other) {
        return this.t.equals(other.t);
    }

    public TestGet<T> copy() {
        return new TestGet<T>(t);
    }

}
