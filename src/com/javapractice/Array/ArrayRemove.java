package com.javapractice.Array;

import java.util.ArrayList;

public class ArrayRemove {
    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        objArray.clear();
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);
        objArray.remove("0th element");
        System.out.println("数组删除元素后："+objArray);
    }
}
