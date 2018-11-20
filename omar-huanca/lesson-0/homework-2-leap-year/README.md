##LEAP YEAR

## Mathematic Model
Problem: Calculate leap year

    p is divisible by 4
    q is not divisible by 100
    r is divisible by 400
    
    
    Leap-Year = p ∧ (¬q v r )
    

## Algorithm

- Read year from user (Inputs)

        inputYear(): return year

- Is leap year?

        isLeapYear(year): return True/False
        
- Print results

        print()
## Methods
- inputYear(): return year

        Read year from user: year
        Message: Please Insert valid year to eval:
        
- isLeapYear(year): return True/False

        - if moduleFunction(year, 400) == 0
            return true 
        - if else moduleFunction(year, 4) == 0 and moduleFunction(year, 100) != 0
            return true
        - else
            return false
         	
- moduleFunction(year, number)

        return year - (number * (year / number))

- print()

        if isLeapYear(year) == true
            The +year+ is leap year.
        else
            The +year+ is not leap year.