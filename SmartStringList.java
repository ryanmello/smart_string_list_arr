/**
  * @author Ryan Mello
  * @version 11/27/2022
  */
import java.util.*;

/**
  * The SmartStringList class creates a list object
  */
public class SmartStringList{
  private String[] arr;
  private int index;
  private boolean sorted = true;

  /**
  * Creates a SmartStringList object with a max capacity
  * @param capacity: max length of the array
  */
  public SmartStringList(int capacity){
    arr = new String[capacity];
    index = 0;
  }

  /**
  * The add method allows the user to add new items to the array
  * @param s: the String that the user wants to add to the list
  */
  public void add(String s){
    // if index is in array length
    if(index<arr.length){
      arr[index] = s;
      if(index>=1 && arr[index].compareToIgnoreCase(arr[index - 1]) < 0){
        sorted = false;
      }
      index++;
    } else {
      System.out.println("List is full.");
    }
  }

  /**
  * The get method return the String at a given index
  * @param i: index of the String that is returned
  * @return the String at index i
  */
  public String get(int i){
    if(i < arr.length){
      return arr[i];
    } else {
      return "Invalid index.";
    }
    //return arr[i];
  }

  /**
  * The indexOf method returns the index of the inputed String
  * @param s: String value
  * @return index of s
  */
  public int indexOf(String s){
    if(sorted == true){
      int min = 0;
      int max = (arr.length) - 1;
      int mid = 0;
      while(max >= min){
        mid = ((max + min) / 2);
        int current = s.compareToIgnoreCase(arr[mid]);
  
        if(current == 0){
          sorted = true;
          return mid;
        } else if(current < 0){
          max = mid - 1;
        } else {
          min = mid + 1;
        }
      }
      return -1;
    } else {
      int n = track(s);
      sort();
      return n;
    }
  }

  /**
  * the track method loops through the entire array and returns index 
  * of the String that is equal to the paramter
  * @param s: String value
  * @return i 
  * @return -1
  */
  public int track(String s){
    for(int i = 0; i < arr.length; i++){
      if(s.equalsIgnoreCase(arr[i]) == true){
        return i;
      } 
    }
    return -1;
  }

  /**
  * the sort method sorts the array in alphabetical order
  */
  public void sort(){
    if(sorted == true){
      System.out.println("Sorted!"); 
      return;
    } 

    for(int i = 0; i < arr.length - 1; i++){
      int min = i;
      for(int j = i + 1; j < arr.length; j++){
        if(arr[j].compareToIgnoreCase(arr[min]) < 0){
          min = j;
        }
      }
      String temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    sorted = true;
  }
  
  /**
  * The display method prints out the array
  */
  public void display(){
    System.out.print("[");
    for(int i = 0; i < arr.length; i++){
      if(i < arr.length - 1){
        System.out.print(arr[i] + ", ");
      } else {
        System.out.print(arr[i]);
      }
    }
    System.out.println("]");
  }
}