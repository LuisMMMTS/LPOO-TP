package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    List<Integer>list=new ArrayList<Integer>();

    ListFilterer(List<Integer> list) {
        this.list=list;
    }

    public List<Integer> filter(IListFilter filter) {
        List<Integer>filtered=new ArrayList<Integer>();
        for (int number:list){
            if (filter.accept(number)){
                filtered.add(number);
            }
        }
        return filtered;
    }
}
