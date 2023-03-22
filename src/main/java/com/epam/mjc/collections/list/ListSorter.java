package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator().thenComparingInt(Integer::parseInt));
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(sortedFunc(a),sortedFunc(b));
    }
    public static int sortedFunc(String number){
        //5x^2+3
        int x = Integer.parseInt(number);
        return 5*x*x+3;
    }
}
