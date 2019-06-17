# HorseRace
1. You'll get a file of bets with a result 

Input - Text file

Input Format 

(

Operation:Selection:LuckyNumber:Amount:Name

Bet:P2:2:23:ABC

Bet:P1:2:23:ABC

Bet:P4:2:23:Saarthak

Commisions:30:25:15:10:5

Result:2:3:12:23:24

)

2. Minimum 15 eligible bets to be placed
3. Only first 5 position will be declared in result
4. LuckyNumber to be chosen b/e 1-100.

Rules to calculate winning amount :
	
	1. Minimum bet amount 10 otherwise return invalid bet in remarks
	
	2. First position holder - 30% of total bet pool amount
	
	3. Second - 25%, Third - 15%, Fourth - 10%, Fifth - 5%
	
	4. Commision - 15%
	
	5. In cases of draw, divide the amount eqally b/w eligile winners
	
	6. Not more than 3 bets on a single number
	

Output - Text file

Output Format

(

Operation:Selection:LuckyNumber:Amount:Name:Winning_Amount:Result

Bet:P4:2:2:Mukul -- Ineligible

Bet:p2:2:10.0:abc -- Winner! Resultant Amount: $12.5

Bet:p1:2:10.0:abc -- Lost

bet  -- Invalid Input

)
