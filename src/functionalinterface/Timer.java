package functionalinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Timer {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> getMax = Math::max;
        BiFunction.apply(2,4);

    }
    public static void printTime(){

        long start = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 100000000; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");
    }

    public static void printTime2(){
        ArrayList<Integer> list2 = new ArrayList<>();
    }

}
