/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stealth.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Chux
 */
@Component
//@Component tells spring framework that this is a java beans
public class BinarySearchImpl 
{
    @Autowired
    //@Autowired tells spring framework that SortAlgorithm is a dependency of the beans
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    
    public void binarySearch(int[] numbers){
        //sorting the array
//        BubbleSortAlgorithm bSort = new BubbleSortAlgorithm();
//        int[] retult = bSort.sort(numbers);
        
        //loosely coupled
        int[] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm + " - " + sortedNumber);
        System.out.println("Sorted array: "); 
        printArray(sortedNumber, sortedNumber.length);
        
        //searching the array
        //returning the result
        //return 3;
    }
    
    // Function to print an array  
    static void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
