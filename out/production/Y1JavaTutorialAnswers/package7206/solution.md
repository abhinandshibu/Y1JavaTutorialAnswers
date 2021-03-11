###Solution

The book class defines two books as being equal if
they have the same isbn number.

```
Book book = new Book(1, "C++"); \
set.add(book); \
```
Set: {1: "C++"}
```
set.add(new Book(2, "Haskell"));
```
The hashcode is the isbn no. and since the hashcode
of `new Book(2, "Haskell")` is `2`  and since there 
are no other elements with a hashcode of `2` in the 
set, we add it to the set. \
Set: {1: "C++", 2: "Haskell"}
```
set.add(new Book(1, "Java"));
```
The hashcode of `new Book(1, "Java)` is `1` which
already exists in the set, so we do not add it to
the set. \
Set: {1: "C++", 2: "Haskell"}
```
book.setTitle("New C++ book");
```
Since book is simply a pointer to the object, this
will change the corresponding objects title.  \
Set: {1: "New C++ book", 2: "Haskell"}
```
for (Book b : set) {
   System.out.println(b);
}
```
Prints out the books in the set
```
New C++ book(ISBN: 1)
Haskell(ISBN: 2)
```






