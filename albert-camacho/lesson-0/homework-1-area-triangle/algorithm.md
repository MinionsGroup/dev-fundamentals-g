**MATHEMATICS-LOGIC MODEL**

1. Triangle area formula:
```
AREA = (base/2) * height
```

1.1 Case hypotenuse is not in X and Y:
```

  (x1, y1)
  |\                             a = hypotenuse
  | \ a                          b = base = |x2 - x1|
 c|  \                           c = height = |y2 - y1|
  |   \
  |____\ (x2, y2)
    b

```
1.2 Case hypotenuse is in X or Y
```
                                   IF  hypotenuse is in X
             / \                       b = hypotenuse
            / |h\ a                    b = base = |x2 - x1|
         c /  |  \                     h = height where 0 < h <= b/2   (see height theorem)
          / n | m \
(x1, y1) /____|____\ (x2, y2)       IF  hypotenuse is in Y
              b                        c = hypotenuse
                                       c = base = |y2 - y1|
                                       h = height where 0 < h <= c/2
```
2. Height Theorem:
```
h^2 = n * m;  0 < h <= hmax
h = sqrt(n * m)

b = n + m

IF n = m THEN:
     h = hmax
     n = m = b/2
     hmax = sqrt((b^2)/4)
     hmax = b/2

```
3. Cases:
```
IF b>0 and c>0 THEN:
    area = (b/2) * c
    h = 0

IF b>0 and c=0 THEN:
    area = (b/2) * h
    0 < h <= b/2

IF b=0 and c>0 THEN:
    area = (c/2) * h
    0 < h <= c/2

IF b=0 and c=0 THEN:
    area = 0
    h = 0
    "It is a point"

```

**ALGORITHM**
```
TriangleArea( x1, x2, y1, y2)
1. Leer x1, x2, y1, y2
2. base = abs(x2 - x1)
3. height = abs(y2-y1)
4. Calcular area, CalcArea(base, height); area, hmax
5. Mostrar area, PrintArea(area, hmax)

CalcArea(b, c); area, hmax
1. area = hmax = 0
2. Si b>0 and c > 0
    area = (b x c)/2
3. Si b > 0 and c = 0 
	area = hmax = b/2	
4. Si b = 0 and c > 0
	area = hmax = c/2

PrintArea(area, hmax)
1. Si area = 0
        print(“It is not a triangle, it is a point”)
2. Si hmax > 0 and area > 0
        print(“Area = ” + area + “h  where  0 < h <= ” + hmax ))
   Sino
        print(“Area = “ + area)
```


Examples:
```
Input: 
    TriangleArea(3,-5, -2, 2)
    Calc: 
        base = abs(-2 - 3)       = 5
        height = abs(2 - (-5))   = 7
    Output:
	    Area = 17.5

	
Input:
    TriangleArea(3,-5, 3, 2)
    Calc: 
        base = abs(3 - 3)        = 0
        height = abs(2 - (-5))   = 7
    Output:
        Area = 3.5h where 0 < h <= 3.5


Input:
    TriangleArea(-5,-2, 3, -2)
    Calc: 
        base = abs(-5 - 3)       = 8
        height = abs(-2 - (-2))   = 0
    Output:
        Area = 4h where 0 < h <= 4
```
