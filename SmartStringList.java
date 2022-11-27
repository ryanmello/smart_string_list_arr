import java.util.*;

public class SmartStringList{
  public int capacity = 0;
  public String[] words = {"apple", "banana", "grapes"};
  
  public SmartStringList(int num){
    capacity = num;
  }

  public String[] add(String s){
    String[] moreWords = new String[words.length + 1];

    for(int i = 0; i < words.length; i++){
      moreWords[i] = words[i];
    }

    moreWords[moreWords.length-1] = s;

    return moreWords;
    
    
    // int n = words.length;
    // String newArr[] = {};

    // for(int i = 0; i < capacity; i++){
    //   newArr[i] = words[i];
    // }

    // newArr[n] = s;
    // System.out.println(Arrays.toString(newArr));
  }

  public void display(){
    for(int i = 0; i < words.length; i++){
      System.out.println((i+1)+") " + words[i]);
    }
  }
}