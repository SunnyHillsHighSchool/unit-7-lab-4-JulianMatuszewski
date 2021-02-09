# Unit-7-Lab-4

Lab Goal :   This lab was designed to review basic class creation and to introduce and demonstrate how to use an ArrayList.  


Lab Description :   Write a number class that can be used to test numbers for odd, even, and perfect.  Use the sample runner code below to help you know which methods to write and how to design them and the class.

Files:  Number.java
        Main.java
        .replit
        run_button.sh


Sample Runner Code :
int[] nums = {7,28,496,1111,199,201,17};
for( int num : nums )
{
  Number one = new Number( num );
  if ( one.isOdd() )
	System.out.print( one + " is odd.\n" );
  else 
	System.out.print( one + " is not odd.\n" );
	
  if ( one.isPerfect() )
	System.out.print( one + " is perfect.\n" );
  else 
	System.out.print( one + " is not perfect.\n" );
}

Sample Output :
7 is odd.
7 is not perfect.
28 is not odd.
28 is perfect.
496 is not odd.
496 is perfect.
1111 is odd.
1111 is not perfect.
199 is odd.
199 is not perfect.
201 is odd.
201 is not perfect.
17 is odd.
17 is not perfect.
