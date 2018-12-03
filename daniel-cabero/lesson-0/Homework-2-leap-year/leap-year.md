
bisiesto(year){
read year

a =(mod(year,4))
b =mod(year,100)
c=mod(year,400)

if (a && !b || c)
show "is divisible"
}

mod(year,dividor){
read year, dividor

a= year/dividor
if(a*dividor==year)
    return true
else
    return false
}