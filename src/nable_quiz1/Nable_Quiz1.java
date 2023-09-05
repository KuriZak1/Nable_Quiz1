/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nable_quiz1;

import static java.util.Arrays.copyOf;
import java.util.Scanner;

/**
 *
 * @author Jake Marson Nable
 */
public class Nable_Quiz1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = 1;
        do{
            menu();
            System.out.println("Do you want to have another Transaction?\n[1] YES.\n[2] NO.");
            int user = scan.nextInt();
            if(user == 2){
                System.out.println("Ok, Have a nice day");
                loop++;
            }else{
                System.out.println("Ok, Another Transcation");
            }
            
        }while(loop == 1);
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("[1] Code One.\n[2] Code Two.\n[3] Code Three");
        int user = scan.nextInt();
        switch(user){
            case 1:
                codeOne();
                break;
            case 2:
                codeTwo();
                break;
            case 3:
                codeThree();
                break;
        }
    }
    
    
    public static void codeThree(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int size = scan.nextInt();
        int [] arr = new int[size];
        
        System.out.println("Enter the Numbers");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int m = arr[i];
            arr [i] = arr [index];
            arr[index] = m;
        }
    }
    public static void codeTwo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int size = scan.nextInt();
        int [] arr = new int[size];
        
        System.out.println("Enter the Numbers");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        
        System.out.println("Enter the index you want to delete");
        int index = scan.nextInt();
        
        arr[index] = 0;
        
        System.out.println("After deleting");
        printArray(arr);
    }
    public static void codeOne(){
        int [] array = {82,44,96,7,13,56,74,14,98,36};
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+".");
        }
    }
    public static void printArray(int arr[]){
        for (int num: arr){
            System.out.println(num);
        }
    }
}