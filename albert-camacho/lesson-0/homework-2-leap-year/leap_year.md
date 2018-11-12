**MATHEMATICS-LOGIC MODEL**

Leap Year:
- Is divisible by 4
- Is divisible by 100
- Is divisible by 400

```
p y [¬q ó r]
```


**ALGORITHM**
```
LeapYear(year)

1. Leer year
2. Calcular p = mod(year, 4)
3. Calcular q = mod(year, 100)
4. Calcular r = mod(year, 400)
5. Si p == 0 and (q <> 0 or r == 0)
    imprimir "Es año bisiesto"
6. Sino
    imprimir "No es año bisiesto"


mod(a, b): result
1. Calcular n = a / b
2. Calcular m = n * b
3. Si a == m
    return 0
4. Sino
    return (a - m)
    
```
