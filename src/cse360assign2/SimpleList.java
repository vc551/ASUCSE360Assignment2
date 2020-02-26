/*
 * Name		  :	Vikramjit Singh
 * ASU ID	  :	1215398340
 * Assignment :	1
 * Description: This class defines the SimpleList data type for Assignment 1.
 * 				Private variables include an array of integers called list
 * 				and an integer count which keeps track of the number of
 * 				variables stored into the array. The constructor sets the list
 * 				to be empty and count to be 0. The methods add and remove are
 * 				used to manipulate the array and count. The method count and
 * 				toString provide access to the count and all the variables
 * 				in the array respectively. The method search returns the index
 * 				of the element if present in the list and -1 if it isn't.
 */

package cse360assign2;

public class SimpleList
{
	private int[] list;					//Private array of integers
	private int count;					//Private integer count

	public SimpleList()					//Default Constructor : Sets the list to be empty and count to be 0
	{
		this.list = new int[10];
		this.count = 0;
	}

	public void add(int toAdd)			//Add Method : Adds the element to the head of the array
	{
		for(int counter = this.list.length - 1 ; counter > 0 ; counter--) 			//Shifts the elements one place to the right
			this.list[counter] = this.list[counter-1];
		this.list[0] = toAdd;														//Adds element to the start of the array
		this.count = Math.min(this.count + 1, 10);									//Changes count to be +1 but not more than 10
	}

	public void remove(int toRemove)	//Remove Method : Removes the given element from the list
	{
		int removeIndex = search(toRemove);											//Check the index from which to remove
		if(removeIndex != -1) 														//Check if index is valid
		{
			for(int counter = removeIndex ; counter < this.count - 1 ; counter++) 	//Shifts elements to the left from the index to the end of the list
				this.list[counter] = this.list[counter+1];
			list[this.count--] = 0;													//Decrement count, and set tail to 0
		}
	}

	public int count()					//count Method : returns count
	{
		return this.count;															//Return Count
	}

	public String toString()			//toString Method : returns a String of all the elements in the list
	{
		String returnString = "";													//Declare an empty string to return
		for(int counter = 0 ; counter < this.count ; counter++) 					//Go over count elements in the array and add them to the string
			returnString += this.list[counter] + ((counter == this.count - 1)? "" : " ");
		return returnString;														//Return string
	}

	public int search(int toSearch)		//search Method : returns the index of a particular element in the list if it exists; returns -1 otherwise
	{
		int foundIndex = -1;
		for(int counter = 0 ; counter < this.count ; counter++) 					//Go over the count elements in the array and if the element is detected, change foundIndex to index
			if(this.list[counter]==toSearch) 
				foundIndex = counter;
		return foundIndex;															//Return foundIndex's default -1 if the entire array doesn't contain the element
	}
}