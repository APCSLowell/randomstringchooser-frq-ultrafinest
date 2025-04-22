import java.util.*;
public class RandomStringChooser
{
  private String[] wordList;
  private ArrayList<String> addto;

  public RandomStringChooser(String[] nstr){
    wordList = nstr;
    addto = new ArrayList<String>();
  }

  public String getNext(){
    if(addto.size() == wordList.length){
      return "NONE";
    }

    while(true){
      int i = (int)(Math.random() * wordList.length);
      if(!addto.contains(wordList[i])){
        addto.add(wordList[i]);
        return wordList[i];
      }
    }
  }
}
