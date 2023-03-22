package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        return IntStream.range(0,sourceList.size())
                .filter( i -> (i+1) % 3 == 0)
                .mapToObj( i -> sourceList.get(i))
                .flatMap( s -> List.of(s,s).stream())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
