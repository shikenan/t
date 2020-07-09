package com.bjsxt.fiveoneserver.config;

public class Singleton {
    //指向自己唯一实例的静态引用,主动创建
  /*  private static Singleton singleton = new Singleton();
    //私有的构造方法,防止其他类创建自己的实例对象
    private Singleton() {
    }
    //静态公有的获取自己唯一实例的方法
    public static Singleton getInstance(){
        return singleton;
    }*/

   /* private static Singleton singleton = new Singleton();

    private Singleton(){};
    public static Singleton getSingleton(){
        return singleton;
    }*/

   //但势力模式
   private static Singleton singleton = new Singleton();
   private Singleton(){};
   public static Singleton getSingleton(){
       return singleton;
   }
   //排序
    public static void bubbleSort(int[] arr){

       int temp =0;
       int count =0;
       boolean flag ;
       for(int i =0;i<arr.length-1;i++){
           flag = true;
           for(int j=0;j<arr.length-1-i;j++){
               if(arr[j]>arr[j+1]){
                   temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   count++;
                   flag = false;
               }
           }
           if(flag){
               break;
           }
       }
        System.out.println("共比较了:"+count);
    }


    public Integer getNum(Integer n){

       if(n==1){
           return 1;
       }
       return n*getNum(n-1);

    }






}
