# Software Development Fundamentals
dev-fundamentals-g
Group: G
Module: 1
Edgar Quispe Task 1 lesson 0

rectangulo 

Analisi Mathematico - Logico
area de un trigangulo at=(bh)/2
area de un rectangulo ar=at*2

(x3;y3) pueden ser = (x2;y1) o (x1;y2)

por matrices at=[(x1y2)+(x2y3)+(x3y1)]-[(x1y3)+(x3y2)+(x2y1)]/2


Algoritmo
  
 calculatorArea(x1, y1; x2, y2):
1- leer(x1,y1;x2,y2)
2- find_Case (x1, y1, x2, y2)
	case1 (x3;y3)==(x2;y1)
	case2 (x3;y3)==(x1;y2)
	case3 (x3;y3)==(x12;y12)
	
3. show_area(arearec)
	find_Case (x1, y1, x2, y2): caseX
	3.1 if (x3;y3)==(x2;y1)
	 caseX=1
	3.2 if (x3;y3)==(x1;y2)
	 caseX=2
	3.3 if (x3;y3)==(x12;y12)
	 caseX=3
 showArea(area)
      print(“The área of the rectangle is:” + arearec)+
4. calc_area(x1, y1; x2, y2; caseX),arearec
	4.1 at=[(x1y2)+(x2y3)+(x3y1)]-[(x1y3)+(x3y2)+(x2y1)]/2
	4.2 arearec=at*2



