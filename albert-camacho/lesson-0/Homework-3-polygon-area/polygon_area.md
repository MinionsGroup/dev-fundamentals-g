**MATHEMATICS-LOGIC MODEL**

1. Polygon area formula:
```
AREA = 1/2 x perimeter x apothem

perimeter = sides * num_sides
```
2. Apothem formula:
```
a = side / (2 * tangent θ)

θ = 360° / (2 * num_sides)
```

**ALGORITHM**
```
PolygonArea(lado, num_lados)

1. Leer lado, num_lados
2. Calcular perimetro = lado x num_lados
3. Calcular apotema, apotema(lado, num_lados): apotema
4. Calcular area, area(perimetro, apotema): area
5. Imprimir area, printArea(area, num_lados)


apotema(lado, num_lados): apotema
1. Leer lado, num_lados
2. Calcular theta = 360 / (2 x num_lados)
3. Calcular apotema = lado / (2 x tangente(theta))


area(perimetro, apotema): area
1. Leer perimetro, apotema
2. Calcular area = (perimetro x apotema) / 2


printArea(area, num_lados)
1. print("Area del poligono de " + num_lados + " lados es: " + area)
```
