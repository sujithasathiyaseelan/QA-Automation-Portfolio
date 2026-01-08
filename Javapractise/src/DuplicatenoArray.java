
//To find the duplicate number

public class DuplicatenoArray {
public static void main(String[] args) {

int SearchArray[] = { 10, 20, 30 ,20};
	int ArrayLength = SearchArray.length;//4
	int NoToMatch = 20;
	int MatchCount = 0;//how many times 20 is duplicated is stored here

	for (int i = 0; i < ArrayLength; i++) { //i=0,0is greater than 4 then check array of 0 which is 10==20

		if (NoToMatch == SearchArray[i]) {
			MatchCount++;							

		} 			
					

		}
	
	if(MatchCount == 0)
	{
		System.out.println( "No duplicate Found");
	}
	else if (MatchCount ==1)
	{
		System.out.println( "No duplicates found");
	}
	else
	{
	System.out.println( "Duplicates of 20 ="+(MatchCount-1));			
	
	}
					}}
//
//✅ Iteration 1:
//i = 0
//
//SearchArray[0] = 10
//
//20 == 10 → ❌ No match
//
//MatchCount remains 0
//
//✅ Iteration 2:
//i = 1
//
//SearchArray[1] = 20
//
//20 == 20 → ✅ Match
//
//MatchCount becomes 1
//
//✅ Iteration 3:
//i = 2
//
//SearchArray[2] = 30
//
//20 == 30 → ❌ No match
//
//MatchCount remains 1
//
//✅ Iteration 4:
//i = 3
//
//SearchArray[3] = 20
//
//20 == 20 → ✅ Match
//
//MatchCount becomes 2
//
//🧾 After the Loop:
//MatchCount = 2
//
//Now we check:
//
//java
//Copy
//Edit
//if (MatchCount == 0)
//→ ❌ (It's 2)
//
//java
//Copy
//Edit
//else if (MatchCount == 1)
//→ ❌ (Still not 1)
//
//java
//Copy
//Edit
//else
//    System.out.println("Duplicates of 20 = " + (2 - 1))


