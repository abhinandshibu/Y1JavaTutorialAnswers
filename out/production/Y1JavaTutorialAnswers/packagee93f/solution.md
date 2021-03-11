#####Does the accept method in D override the accept method in C? Explain your answer.

The accept method in D does not override the accept
method in c, instead they are both considered as 
different method signatures since they have different
apparent types.

####What will the following code print?
```
public class Test {

  public static void main(String[] args) {

    B b = new B();

    C c = new D();
    c.accept(b);

    D d = new D();
    d.accept(b);

  }

}
```
`c.accept(b)` will output "Accepted object of 
type A" since `C` only has one accept method
that takes an element of type `B` though since
`B extends A` it can be treated with apparent type
`A` so there are no errors.

`d.accept(b)` will output "Accepted object of type
B" since it has two accept methods, where one
is specifically catering to an input of B.

Note overloading is resolved by the compiler using
apparent types (this could dictate which method
gets called), though if a method is overriden it 
will choose the method to use from the actual types.