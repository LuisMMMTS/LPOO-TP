package com.aor.numbers;

public class DivisibleByFilter implements IListFilter{
    private int number;

    DivisibleByFilter(Integer number){
        this.number=number;
    }
    @Override
    public boolean accept(Integer number) {
        return (number%this.number)==0;
    }
}
