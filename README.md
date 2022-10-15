# Polygons contains a point
## Description of the task
Choose a point on the plane, and fill a collection with several regular shapes (circle, regular triangle, square, regular hexagon). ***How many shapes contain the given point?***

Each shape can be represented by its center and side length (or radius), if we assume that one side of the polygons are parallel with x axis, and its nodes lies on or above this side. Load and create the shapes from a text file. The first line of the file contains the number of the shapes, and each following line contain a shape. The first character will identify the type of the shape, which is followed by the center coordinate and the side length or radius. Manage the shapes uniformly, so derive them from the same super class.

## Classes and their methods
### Point Class
- Constructer: Constructs point with given x and y coordinates. 
- `toString()`: Converts point coordinates into string form. 
### Shape Class
The parent class for polygons. 
- Constructor: Constructs shape with a center point and side length. 
- `containsPoint(Point a)`: Check if a given point is contained in the shape. 
### Circle Class 
- Constructor: Constructs a circle with a center point and radius. 
- `containsPoint(Point a)`: Check if a given point is contained in the circle. 
- `toString()`: Converts circle details coordinates into string form. 
### Square Class 
- Constructor: Constructs a square with a center point and side length. 
- `containsPoint(Point a)`: Check if a given point is contained in the square. 
- `toString()`: Converts square details coordinates into string form. 
### Triangle Class 
- Constructor1: Constructs a triangle with a center point and side length. Sets the 3 vertices by finding the height of the triangle as well as apothem. 
- Constructor2 : Second constructor for Triangle. It gets 3 vertices and forms a triangle. 
- `AreaTriangle(Point a,b,c)`: A method for calculating the area of a triangle by giving three vertices. 
- `containsPoint(Point a)`: Check if a given point is contained in the triangle. 
- `toString()`: Converts triangle details coordinates into string form. 
### Hexagon class 
- Constructor: Constructs a hexagon with a center point and side length. Sets the 6 vertices by finding the height of the hexagon. 
- `containsPoint(Point a)`: Check if a given point is contained in the hexagon. 
- `toString()`: Converts hexagon details coordinates into string form. 
### DataHandling class 
- `read(file)`: Reads from the file and fills the array with shapes.
