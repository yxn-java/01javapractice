package com.javapractice.Array;

import java.util.ArrayList;

public class ArrayRemoveAll {
    public static void main(String[] args)  {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 的元素" +objArray);
        System.out.println("array2 的元素" +objArray2);
        objArray.removeAll(objArray2);//removeAll()用于移除相同元素
        System.out.println("array1 与 array2 数组差集为："+objArray);
    }
}
