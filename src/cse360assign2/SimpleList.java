/*
 * Name		  :	Vikramjit Singh
 * ASU ID	  :	1215398340
 * Assignment :	2
 * Description: This class defines the SimpleList data type for Assignment 2.
 * 				Private variables include an array of integers called list
 * 				and an integer count which keeps track of the number of
 * 				variables stored into the array. The constructor sets the list
 * 				to be empty and count to be 0. The methods add, append, and remove are
 * 				used to manipulate the array and count. Both the add and append 
 * 				methods can also change the size of the array. The method count and
 * 				toString provide access to the count and all the variables
 * 				in the array respectively. The method search returns the index
 * 				of the element if present in the list and -1 if it isn't.
 * 				The first method returns the first element of the list. The size method
 * 				returns the current size of the list array.
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
		if(this.list.length == this.count)											//Checks if array size is equal to the maximum size of the array
		{
			int newSize = this.list.length + ((this.list.length * 50)/ 100);		//Determine the new size of the array to be the original size and 50% of the size
			int newArray[] = new int[newSize];										//Create a new array of the new determined size
			for(int counter = 0 ; counter < this.count ; counter++)					//Copy the contents of the array into the new bigger array
				newArray[counter] = this.list[counter];
			this.list = newArray;													//Replace the old array with the new bigger array
		}
		for(int counter = this.list.length - 1 ; counter > 0 ; counter--) 			//Shifts the elements one place to the right
			this.list[counter] = this.list[counter-1];
		this.list[0] = toAdd;														//Adds element to the start of the array
		this.count++;																//Changes count to be +1
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
		if(this.count <= ((this.list.length * 75)/100))								//Check if the array is less than 75% full
		{
			int newArray[] = new int[this.count];									//Create a new array of size count
			for(int counter = 0 ; counter < newArray.length ; counter++)			//Copy the contents of the array into the new smaller array
				newArray[counter] = this.list[counter];
			this.list = newArray;													//Replace the old array with the new smaller array
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
			{
				foundIndex = counter;
				break;
			}
		return foundIndex;															//Return foundIndex's default -1 if the entire array doesn't contain the element
	}

	public void append(int toAppend)	//append Method : appends an element to the end of the occupied elements in the array
	{
		if(this.list.length == this.count)											//Checks if array size is equal to the maximum size of the array
		{
			int newSize = this.list.length + ((this.list.length * 50)/ 100);		//Determine the new size of the array to be the original size and 50% of the size
			int newArray[] = new int[newSize];										//Create a new array of the new determined size
			for(int counter = 0 ; counter < this.count ; counter++)					//Copy the contents of the array into the new bigger array
				newArray[counter] = this.list[counter];
			this.list = newArray;													//Replace the old array with the new bigger array
		}
		this.list[this.count++] = toAppend;											//Add the element to the end of the occupied list and append count
	}

	public int first()					//first Method : returns the first element of the list
	{
		return this.list[0];														//Returns the element at index 0 on the list
	}

	public int size()					//size Method : returns the size of the array
	{
		return this.list.length;													//Returns the length of the list
	}
}