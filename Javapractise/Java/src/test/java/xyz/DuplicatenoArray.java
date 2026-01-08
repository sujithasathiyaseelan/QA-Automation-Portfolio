
//To find the duplicate number
package xyz;

public class DuplicatenoArray {
public static void main(String[] args) {

int SearchArray[] = { 10, 20, 30 ,20};
	int ArrayLength = SearchArray.length;
	int NoToMatch = 20;
	int MatchCount = 0;

	for (int i = 0; i < ArrayLength; i++) {

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


