/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stealth.spring.basics;

import org.springframework.stereotype.Component;

/**
 *
 * @author Chux
 */
@Component
//currently, spring framwork know that this beans should be used
//but to make it stop, that is if we want to switch to the QuickSortAlgoritm,
//all we have to do is comment the @component here and add it to the QuickSortAlgoritm class.
//another way of having more than one beans is to have both bean class have the @component annotation
//however, the application will fail to run because there are more than one java bean class with @component annotation
//so we have to choose the one to be dorminant by adding the @Primary annotation to the java bean class we want dorminant
//see the QuickSortAlgoritm class for detail
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers)
    {
        //logic for bubble sort
        int i, j, n = numbers.length, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (numbers[j] > numbers[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = numbers[j]; 
                    numbers[j] = numbers[j + 1]; 
                    numbers[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
        return numbers;
    }
}
