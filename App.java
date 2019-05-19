import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




public class App {

	public static void main(String[] args) {
		/*
		 * Consider:
		 * Do you want a list, set, or map?
		 * 1. What you need the collection to do
		 * 2. are you using the fastest collection for your purposes
		 * (think about insertion/deletion, retrieval and tranversal
		 * Array list is only good if you want to add or remove things at the END of the list,
		 * if you want to remove anything BESIDES the end of the list, you a LinkedList.
		 */
		
		//////////////LISTS////////////////////
		
		//Store lists of objects
		// For consecutive integers.
		//Duplicates are allowed to list ( can have the same item listed down twice)
		//Objects remain in order that you add them in in the list, but you can explicitly sort list.
		//Elements are indexed via an integer (like writing 1,2,3,4) particular number for each item in list.
		//cf. shopping list
		//Checking for particular item in list is slow. 
		//Looking an item up by index is fast.
		//Iterating through lists is relatively fast.
		//Note: you can sort lists if you want to.
		//Use lists to store list of objects and don't need to remove duplicates, and want them to remain in order as you add them.
		
		
		//If you are only add or remove items at end of list, use ArrayList.
		List<String> list1 = new ArrayList<String>();
		
		//removing or adding items elsewhere in the list?
		List<String> list2 = new LinkedList<String>();
		
		/////////////SETS///////////////////////////
		
		//Only store unique values. 
		//Great for removing duplicates **Most common reason to use sets**
		//Not indexed, unlike lists.
		//Sets are optimized for finding particular objects in list.
		//Very fast to check if a particular object exists
		//If you want to use your own objects, you must implement hashCode() and equals().
		
		//Order is unimportant and OK if it changes?
		//HashSet is not ordered.
		Set<String> set1 = new HashSet<String>();
		
		//Sorted in natural order? Use TreeSet - must implement Comparable for custom types
		
		///.args.equals(1,2,3 ... a,b,c .... etc)
		Set<String> set2 = new LinkedHashSet<String>();
		
		//Elements remain in order they were added
		Set<String> set3 = new LinkedHashSet<String>();
		
		///////////////////////MAPS/////////////////////////////////////////
		
		//Stores Key value pairs, use key to retrieve another object.
		//Like lookup tables.
		//Retrieving a value by key is fast.
		//Iterating over map values is very slow.
		//Maps are not  optimized for iteration.
		//If you want to use your own objects as key, you must implement hashCode() and equals().
		
		//Keys not in any particular order liable to change.
		Map<String, String> map1 = new HashMap<String, String>();
		
		//Keys sorted in natural order
		Map<String, String> map2 = new TreeMap<String, String>();
		
		//Keys remain in order added
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
		//There are also the SortedSet and SortedMap interfaces.
	}

}
