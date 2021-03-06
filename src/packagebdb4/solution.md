**Firstly**, the constructor in `Rectangle`
calls the set methods unnecessarily. When the
values can be set directly.
```
public Rectangle(int width, int height) {
    setWidth(width);
    setHeight(height);
}
```
can become...
```
public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
}
```
**Secondly**, the `floorArea` in House.java is 
dependant on `floorSize`, so we can simply compute
it from `floorSize` instead. We can get the area, 
making a `getArea()` method instead rather than 
computing it inside house.
```
floorArea = floorSize.getWidth() * floorSize.getHeight();
```
can become...
```
floorArea = floorArea.getArea()
```
Lastly, the constructor in `House` calls the set
methods unnecessarily. It can assign it directly 
instead. 

