package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        final LinkedList<Integer> ret = new LinkedList<>();
        sourceList.stream()
                .forEach( i -> { if(i%2 ==0) ret.addLast(i); else  ret.addFirst(i); });
        return ret;
    }
}
