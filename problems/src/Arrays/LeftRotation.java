package Arrays;

import java.util.*;

/*

https://www.hackerrank.com/challenges/array-left-rotation/problem

*/

public class LeftRotation {

    public static void main(String[] args) {

        leftRotation(new int[]{1,2,3,4,5}, 4).forEach(t-> System.out.print(t+"\t"));
    }

    private static List<Integer> leftRotation(int[] a, int rotation) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<a.length && i<rotation; i++){
            queue.add(a[i]);
        }
        for(int i=rotation; i<a.length; i++){
            result.add(a[i]);
        }

       while(queue.size()!=0){
            result.add(queue.remove());
        }
        return result;
    }
}
