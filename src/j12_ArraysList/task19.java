package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class task19 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println(getLength(list));
    }

    private static ArrayList<Integer> getLength(ArrayList<String> list) {
        ArrayList<Integer>numList=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            numList.add(list.get(i).length());
        }return numList;
    }
}
