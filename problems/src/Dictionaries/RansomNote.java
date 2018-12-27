package Dictionaries;

import java.util.HashMap;
import java.util.Map;

/*
https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

 */
public class RansomNote {

    public static void main(String[] args) {

        System.out.println(checkMagazine("give me one grand today night","give one grand today"));
    }

    static Boolean checkMagazine(String magazine, String note) {
        Map<String,Integer> resultMap = new HashMap<>();
        Boolean flag = Boolean.TRUE;
        for(String str: magazine.split(" ")){
            if(resultMap.containsKey(str)){
                resultMap.put(str,resultMap.get(str)+1);
            }else{
                resultMap.put(str,1);
            }
        }

        for(String str: note.split(" ")){
            if(resultMap.containsKey(str) && resultMap.get(str) > 0){
                resultMap.put(str,resultMap.get(str)-1);
            }else{
                flag = Boolean.FALSE;
            }
        }
        return flag;
    }
}