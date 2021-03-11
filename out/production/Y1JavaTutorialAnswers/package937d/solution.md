The problem is that if the width or height is 
updated, the area is not automatically updated.

Also since the area can be derived from the width
and height, it would be better practice to not store
it as an attribute. There can be exceptions to this, 
especially when recalculating the value can be 
computationally expensive, it may be good to only 
recalculate when necessary. Though it is not the case 
here.

So I have refactored the code to address the issues.