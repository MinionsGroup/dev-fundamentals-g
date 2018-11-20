# Mathematical-logic Model                                                                            
Calculate leap-year
•	p:   It is divisible by 4
•	¬q: It is not divisible by 100
•	r:    It is divisible by 400
Leap-Year = p ∧ (¬q v r )
Quotient = dividend / divisor 
Residue = (quotient * divisor) - dividend

# Algorithm
p ∧ (¬q v r )
p = year % 4
¬q = year % 100
r = year % 400
R = (¬q v r )
leap-year = p ∧ (¬q v r )
E = year, p, ¬q, r, leap-year, dividend, divisor, quotient, residue, R
1.	Read year
2.	calculate findP (year, 4)
3.	calculate find¬Q(year, 100)
4.	calculate findR (year, 400)
5.	calculate leap_year
findP(year, 4)
1.	findResidue(year, 4, case, p)
2.	si case 1
   residue= 0
p = True
3.	si case 2
residue != 0
p = False
findR(year, 400, case, r)
1.	findResidue(year, 400)
2.	si case 1
   residue= 0
r = True
3.	si case 2
residue != 0
r = False
find¬Q(year, 100, case, ¬q)
1.	findResidue(year, 100)
2.	si case 1
   residue != 0
¬q = True
3.	si case 2
residue = 0
¬q = False
findResidue(dividend, divisor)
1.	quotient = dividend/ divisor
2.	residue = (quotient * divisor) – dividend
3.	Show residue

leap_year
1.	CalculateDisjunction(¬q v r)
2.	CalculateConjunction(p ∧ R)
3.	Show leap-year

CalculateDisjunction(¬q v r , case , R)
1.	Si case 1
False v False 
R = False
2.	Si case 2
R = True

CalculateConjunction(p ∧ R, leap-year)
1.	Si case 1
True ∧ True
leap-year = True
2.	Si case 2
leap-year = False

