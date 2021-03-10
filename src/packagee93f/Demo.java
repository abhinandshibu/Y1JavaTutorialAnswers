package packagee93f;

public class Demo {

    public static void main(String[] args) {
        D myD = new D();
        myD.accept(new A());
        myD.accept(new B());

        // ----

        B b = new B();

        C c = new D();
        c.accept(b);

        D d = new D();
        d.accept(b);
    }

}

class A {}

class B extends A {}

class C {

    public void accept(A a) {
        System.out.println("Accepted object of type A.");
    }

}

class D extends C {

    public void accept(B b) {
        System.out.println("Accepted object of type B.");
    }

}
