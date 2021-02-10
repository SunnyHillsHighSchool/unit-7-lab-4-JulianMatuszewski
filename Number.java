//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Julian Matuszewski


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number {
//private instance variable (must be an Integer)
private int number;
//constructor
public Number (int i) {number = i;}

//getter method
public int get() {return number;}

//setter method
public void set(int i) {number = i;}

//isOdd method
public boolean isOdd() {
  //if num modulus 2 is equal to 0 return false
  if (number % 2 == 0)
    return false;
  //return true else
  return true;
}

//isPerfect method
public boolean isPerfect() {
  //create placeholder int called sum
  int sum = 0;
  //find factors of num by iterating through the list
  for (int i = 1; i < number; i++)
    //check if num modulus iteration integer is equal to 0 (no remainder)
    if (number % i == 0)
      //if success, add to sum
       sum += i;
  if (sum == number)
    //if sum is equal to num, return true
    return true;
  //return false else
  return false;
}

//toString
public String toString() {
  return "" + this.get();
}
}