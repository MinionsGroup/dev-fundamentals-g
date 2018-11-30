#POLYGON AREA
## Mathematic Model
Problem: Calculate the area of regular polygon
    
    Area = (Perimeter * Apotema)/2
    
    Apotema = sideLength / 2 * tan(alpha)
    
    Perimeter = numberOfSides * sideLength
    
    alpha = 360/(2 * numberOfSides)
    

## Algorithm

- Create Initial data(inputs)

        initialData(): return sideLength, numberOfSides

- Calculate area

        calculatePolygonArea(numberOfSides, sideLength): return area
       
- Print results

        print()
        
## Methods

- initialData(): return sideLength, numberOfSides

        Read side length from user: return sideLength
        Message: [POLYGON] Please Insert side length:
        Read number of sides from user: return numberOfPolygonSides
        Message: [POLYGON] Please Insert number of sides:
        
- calculatePolygonArea(numberOfSides, sideLength): return area

        perimeter = calculatePerimeter(sideLength, numberOfSides)
        apotema = calculateApotema(sideLength, numberOfSides)
        return (perimeter * apotema) / 2
        
- calculatePerimeter(sideLength, numberOfSides): return perimeter

        return numberOfSides * sideLength
        
- calculateApotema(sideLength, numberOfSides): return apotema

        alpha = 360 / (2 * numberOfSides)
        return sideLength / 2 * tang(alpha)
        
- print()

        Print: The area of Regular Polygon is: calculatePolygonArea(numberOfSides, sideLength)