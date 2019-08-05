package com.freestyle.framework.common;

import com.freestyle.framework.FrameworkApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Test {

       public  void test(){

              new ArrayList<String>();


       }
       public static void main(String[] args) {

              BlockingQueue<Integer> queue = new SynchronousQueue<>();
              System.out.print(queue.offer(1) + " ");
              System.out.print(queue.offer(2) + " ");
              System.out.print(queue.offer(3) + " ");
              //System.out.print(queue.take() + " ");
              System.out.println(queue.size());



       }







}
