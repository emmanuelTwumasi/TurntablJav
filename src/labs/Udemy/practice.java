package labs.Udemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("CAt");
        li.add("Jaguar");

        System.out.println(li.get(1));
        li.set(1, "MAN");
        System.out.println(li.get(1));
        if (li.contains("cAt")) {
            System.out.println("present");
        } else {
            System.out.println("Absent");
        }

        Iterator<String> i = li.iterator();
        System.out.println("Iterator working");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ///Java uses doubly linked list, very fast manipulations,
        //acts as a link and queue
        //no shifting required
        //suitable for manipulating elements

        System.out.println("\nlinkedlist");
        LinkedList<String> lip = new LinkedList<>();
        lip.add("adwoa");
        lip.add("adwoa");
        lip.add("adwoa");
        lip.add("adwoa");
        lip.add(1,"Mansa");
        Iterator<String> n = lip.iterator();
        while (n.hasNext()){
            System.out.println(n.next());
        }
        nop();
        nopInsert();

    }
    static void nop(){

        int[] m = new int[6];
        int nam = 0;
        while(nam<m.length){
            m[nam] = (int)(Math.random()*49)+1;
            nam++;
        }
        Arrays.sort(m);
        for (int v:m ) {
            System.out.print(v+"\t");
        }

    }
    static void nopInsert(){
        System.out.println("\n\n");
        int[] m = new int[6];
        int nam = 0;
        int arrLength = m.length;
        while(nam<arrLength){
            int rand = (int)(Math.random()*49)+1;
            int result =  Arrays.binarySearch(m,rand);
            if (rand == result){
                return;
            }else{
                m[nam] = rand;
            }
            nam++;
        }
//        implement insertion sort

        for (int i = 1; i<arrLength;++i){
            int key = m[i];
            int j = i-1;


            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            
            while(j>=0 && m[j]>key ){
                m[j+1] = m[j];
                j = j-1;
            }
            m[j+1] = key;

        }
        for (int v:m ) {
            System.out.print(v+"\t");
        }
    }
}
