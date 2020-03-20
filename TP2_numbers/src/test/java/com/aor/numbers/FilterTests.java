package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilterTests {
    List<Integer> list=new ArrayList<Integer>();
    @Before
    public void helper(){
        for (Integer i=-20;i<20;i++){
            list.add(i);
        }
    }

    @Test
    public void ListFiltererTest(){
        ListFilterer test=new ListFilterer(list);
    }

    @Test
    public void PositiveFilterTest(){
        ListFilterer test=new ListFilterer(list);
        list=test.filter(new PositiveFilter());
        assertEquals(19,list.size());
    }

    @Test
    public void DivisibleFilterTest1(){
        ListFilterer test=new ListFilterer(list);
        List<Integer>final_list=test.filter(new DivisibleByFilter(1));
        assertEquals(40,list.size());
        assertTrue(final_list.equals(list));
    }

    @Test
    public void DivisibleFilterTestNegative1(){
        ListFilterer test=new ListFilterer(list);
        List<Integer>final_list=test.filter(new DivisibleByFilter(-1));
        assertEquals(40,list.size());
        assertTrue(final_list.equals(list));
    }

    @Test
    public void DivisibleFilterTest2(){
        ListFilterer test=new ListFilterer(list);
        List<Integer>final_list=test.filter(new DivisibleByFilter(2));
        assertEquals(20,final_list.size());
        assertNotEquals(java.util.Optional.of(-19),final_list.get(1));
    }

    @Test
    public void DivisibleFilterTestNegative2(){
        ListFilterer test=new ListFilterer(list);
        List<Integer>final_list=test.filter(new DivisibleByFilter(-2));
        assertEquals(20,final_list.size());
        //assertTrue(final_list.equals(list));
    }
}
