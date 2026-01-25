package p1;

import java.util.LinkedList;
import java.util.List;

class test {
    public static void main(String[] args) {

        List<Integer> l1 ;
        l1= new LinkedList<Integer>();
        //l1.add("FirstBit");
        l1.add(10);
        l1.add(30);
        l1.add(20);
      System.out.println(l1);
      
        for(int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        for(Integer i:l1) {
        	System.out.println(i);
        }
        if(l1.contains(20)) {
        	System.out.println("Found");
        }
        else {
        	System.out.println("Not found");
        }
    }
}
