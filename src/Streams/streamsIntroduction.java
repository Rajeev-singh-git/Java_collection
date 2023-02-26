package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class streamsIntroduction {

    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(valueOf(10));
        list.add(valueOf(20));
        list.add(valueOf(30));
        list.add(valueOf(40));
        list.add(valueOf(50));
        list.add(valueOf(60));

        System.out.println(list);                                 // [10, 20, 30, 40, 50, 60]

        //without stream
        ArrayList<Integer> newlist = new ArrayList<>();
        for(Integer i:list){
            if(i>=30)
                newlist.add(i);
        }

        System.out.println(newlist);                             // [30, 40, 50, 60]


        List<Integer> l1 = list.stream().filter(i -> i>=30).collect(Collectors.toList());
        System.out.println(l1);                                                              // [30, 40, 50, 60]
        
        
        List<Integer> l2 = list.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(l2);                                                               // [20, 40, 60, 80, 100, 120]
    }
}
