package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class L2000 {
    public static void main(String ... args) {
        B a = new B();

        List<? extends A> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();

  //      list2.add( new A() ); //error 1


        System.out.println(123);
    }


}
