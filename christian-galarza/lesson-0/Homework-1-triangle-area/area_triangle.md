# Mathematical-logic Model
Calculate area of ​​a rectangle
Formula calculate Area		
base * height

# Input data
Point1 = x1, y1 
Point2 = x2, y2
Formulas to calculate the other points
Point3 = x1 + x2 , y1	
Point4 = x1 , y1 - y2										

rectangle 
Formula calculate distance from two points
d =  √ (x2 – x1)² + (y2 – y1)²
Base = Point3 to Point2 =>  √ (x2 – (x1 + x2) )² + (y2 – y1)²
height = Point2 to Point4 => √(x2 – x1 )² + ((y1 - y2) – y1)²

# Algorithm
base * height
Point1 = x1, y1 
Point2 = x2, y2
E =   x1, x2 ,y1 ,y2 ,Point1, Point2, base, height
1.	Read x1, x2 ,y1 ,y2 
2.	Calculate Point1, = x1, y1
3.	Calculate Point2, = x2, y2
4.	Calculate findPoint3(x1, x2, y1)
5.	Calculate findPoint4(x1, y1, y2)
6.	Calculate findBase(x2 ,x1, y1, y2)
7.	Calculate findHeight(x2 ,x1, y1, y2)
8.	Calculate Area_Rectangle(base,height)



findPoint3(x1,  x2 , y1)
1.	Point3 = x1 + x2 , y1

findPoint4(x1, y1, y2)
1.	Point4 = x1 , y1 - y2
findBase()
1.	Base = √ (x2 – (x1 + x2) )² + (y2 – y1)²

findHeight()
1.	height = √(x1, y1)² + (x1 + x2 , y1)²

Area_Rectangle(base,height)
1.	area = base * height
 

