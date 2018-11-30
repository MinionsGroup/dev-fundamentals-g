Mathematical logic
P1(x1,y1) y P2(x2,y2)
Case 1
	x1!=x2 and y1!=y2
Area = |x2-x1|*|y2-y1|
Case 2
	B=A
	Area = D2
Case 3
	x1=x2 | | y1=y2

b2 = h2 + m2
h2 = m*n
b2 = m* n + m2   ⇒   b2 = m *(n + m) = m * a   ⇒   b2 = m *a
Considérate  now  triangule ADB:

Apply Pythagoras:   c2 = h2 + n2
By the height theorem, which we have just demonstrated, it is true:   h2 = m*n
And replacing the second expression in the first, you get:
c2 = m*n + n2   ⇒   c2 = n*(m + n) = n*a   ⇒   c2 = n*a
b2 = m*ac2;     c2= n*a
c=√(〖2x〗^2-1)
b=√〖2x〗^2-3x+1)
Área = c*b

Algorithm
areaRectangle(x1,y1,x2,y2)
	read the x1,x2,y1,y2
	verifyPoints(x1,x2,y1,y2)
	case 1
	X=|x2-x1|
	Y=|y2-y1|
	Area= X*Y
	Case 2
	Area  = Pythagoras (x1,x2,y1,y2) ^2
	caso 3
b=getBase(x1,x2,y1,y2)
a=getHeight(x1,x2,y1,y2)

Area= a*b
	print(Area)

VerifyPoints(x1,x2,y1,y2):case		Pythagoras (x1,x2,y1,y2):int
	read the values				1. Read the values
	if (x1!=x2 && y2!=y1)			2. B= |x1-x2|
case 1					    C=|y1-y2|
	if(|x2-x1|==|y2-y1|)			3. d2 = B2 + C2
case 2					4. Return √d
	if (x1==x2||y2==y1)
case 3
	return case

