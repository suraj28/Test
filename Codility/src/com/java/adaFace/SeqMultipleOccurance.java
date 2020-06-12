package com.java.adaFace;

import java.util.HashMap;
// A simple Java program to group 
// multiple occurrences of individual 
// array elements 

class SeqMultipleOccurance 
{ 

	// A simple method to group all occurrences 
	// of individual elements 
	//o(n2)
	static void groupElements(int arr[], int n) 
	{ 
		
		// Initialize all elements as not visited 
		boolean visited[] = new boolean[n]; 
		for (int i = 0; i < n; i++) 
		{ 
			visited[i] = false; 
		} 

		// Traverse all elements 
		for (int i = 0; i < n; i++) 
		{ 
			
			// Check if this is first occurrence 
			if (!visited[i]) 
			{ 
				
				// If yes, print it and all 
				// subsequent occurrences 
				System.out.print(arr[i] + " "); 
				for (int j = i + 1; j < n; j++) 
				{ 
					if (arr[i] == arr[j]) 
					{ 
						System.out.print(arr[i] + " "); 
						visited[j] = true; 
					} 
				} 
			} 
		} 
	} 

	//O(n)
	// A hashing based method to group all occurrences of individual elements 
		static void orderedGroup(String arr[]) 
		{ 
			// Creates an empty hashmap 
			HashMap<String, Integer> hM = new HashMap<>(); 

			// Traverse the array elements, and store count for every element 
			// in HashMap 
			for (int i=0; i<arr.length; i++) 
			{ 
			// Check if element is already in HashMap 
			Integer prevCount = hM.get(arr[i]); 
			if (prevCount == null) 
					prevCount = 0; 
				
			// Increment count of element element in HashMap 
			hM.put(arr[i], prevCount + 1); 
			} 

			// Traverse array again 
			for (int i=0; i<arr.length; i++) 
			{ 
				// Check if this is first occurrence 
				Integer count = hM.get(arr[i]);	 
				if (count != null) 
				{ 
					// If yes, then print the element 'count' times 
					for (int j=0; j<count; j++) 
					System.out.print(arr[i] + " "); 
					
					// And remove the element from HashMap. 
					hM.remove(arr[i]); 
				} 
			} 
		} 
		
	/* Driver code */
	public static void main(String[] args) 
	{ 
		int arr[] = {4, 9, 4, 6, 9, 2, 3, 4, 9, 6, 10, 4}; 
		int n = arr.length; 
		groupElements(arr, n); //Using array
		System.out.println();
		String strArr[] = {"Google", "Facebook", "Google"};
		orderedGroup(strArr); //Using HashMap
	} 
	
} 


