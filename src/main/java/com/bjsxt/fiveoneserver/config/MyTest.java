package com.bjsxt.fiveoneserver.config;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*List<String> list = new ArrayList<>();
        list.add("hello");
        Class<?> c = Class.forName("java.util.List");
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(list,12);
        System.out.println(list);*/

      /*  int[] arr={21,18,17,32};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=1;i<=4;i++){
            sum+=jiSuan(i);
            System.out.println(sum);
        }*/



        /*Class c1 = Class.forName("com.bjsxt.fiveoneserver.config.Student");

        Constructor constructor = c1.getConstructor();
        Student student = (Student)constructor.newInstance();
        Method setAge = c1.getMethod("setAge", Integer.class);
        setAge.invoke(student,12);
        Method getAge = c1.getMethod("getAge");
        System.out.println(getAge.invoke(student));*/


    }


/*    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            boolean flag = true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    public static  int jiSuan(int n){
        if(n==1){
            return 1;
        }else {
            return n*jiSuan(n-1);
        }
    }*/



}
