package com.javapractice.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsSwap {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("abc");
        list.add("abcde");
        list.add("abcdefg");
        list.add("abcdef");
        list.add("abc");
        System.out.println("交换前:" +list);
        Collections.swap(list,2,3);
        System.out.println("交换后:" +list);
    }
}
