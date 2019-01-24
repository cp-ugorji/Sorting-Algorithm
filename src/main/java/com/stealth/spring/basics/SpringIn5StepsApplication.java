package com.stealth.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication 
{    
    //what are the beans?
    //what are the dependencies of the beans?
    //where can we find the beans in the project?
    
    public static void main(String[] args) 
    {
        //loosely coupled class
        //you can just switch to any sort algorithm by changing new BubbleSortAlgorithm() to new QuickSortAlgorithm()
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//        System.out.println(result);             
        
        //Application Context
        ApplicationContext appContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
        binarySearch.binarySearch(new int[] {12, 4, 6});
    }

}

