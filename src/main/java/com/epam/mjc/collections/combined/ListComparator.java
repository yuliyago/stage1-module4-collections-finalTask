package com.epam.mjc.collections.combined;

import java.util.Comparator;

public class ListComparator implements Comparator<String> {
@Override
    public int compare(String a, String b){
    if(a.length()>b.length()) return -1;
    else if (a.length()==b.length()) {
        return a.compareTo(b)*-1;
    }
    else return 1;
}
}
