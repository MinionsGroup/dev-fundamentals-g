#TRIANGLE AREA
## Mathematic Model
Problem: Calculate the area of triangle 

    Base * Height 

Distance between 2 points:

    d =  √(x2 – x1)² + (y2 – y1)²
    Base = Point3 to Point2 =>  √(x2 – (x1 + x2) )² + (y2 – y1)²
    Height = Point2 to Point4 => √(x2 – x1 )² + ((y1 - y2) – y1)²
    

## Algorithm

- Create Main Points from user (inputs)

        createMainPoints(): return point1, point2
        - point1
        - point2

- Calculate base

        calculateBase(point1, point2): return base
        - base
        
- Calculate height

        calculateHeight(point1, point2): return height
        - height
        
- Calculate triangle area

        caluclateTriangleArea(base, height)
        
- Print results

        print()
## Methods
- createMainPoints(): return point1, point2

        Read Point1 from user: x1, y1: return point1
        Message: Please Insert x1 and y1 to create Potin1:
        Read Point2 from user: x2, y2: return point2
        Message: Please Insert x2 and y2 to create Potin2:
        
- calculateBase(point1, point2): return base

        base = √ (x2 – (x1 + x2) )² + (y2 – y1)²
        
- calculateHeight(point1, point2): return height

        height = √(x1, y1)² + (x1 + x2 , y1)²
        
- calculateTriangleArea(base, height): return Area

        area = base * height
        
- print()

        Print: The Triangle area is: area