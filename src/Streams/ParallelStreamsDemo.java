package Streams;

import jdk.dynalink.NoSuchDynamicMethodException;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {

    public static void main(String[] args){

        long time1, time2;
        List<Employee> eList = new ArrayList<Employee>();

        for(int i=0;i<100;i++){
            eList.add(new Employee("john",200000));
            eList.add(new Employee("Mohn",300000));
            eList.add(new Employee("Tohn",400000));
            eList.add(new Employee("Rohn",500000));
            eList.add(new Employee("Kohn",600000));
            eList.add(new Employee("Sohn",700000));
            eList.add(new Employee("Pohn",800000));
        }


        //Sequential processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = " +eList.stream().filter(e -> e.getSalary() > 1000).count());

        time2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken = " +(time2-time1)+ "\n");


        //Parallel processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = " +eList.parallelStream().filter(e -> e.getSalary() > 1000).count());

        time2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken = " +(time2-time1)+ "\n");

    }

}
