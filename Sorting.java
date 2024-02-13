import java.util.*;
import java.util.Arrays;

public class Sorting {

    // Bubble Sorting 
    public static void BubbleSort(int arr[]){

        for(int i = 0; i<arr.length-1; i++){
            for (int j =0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }  
    }

   // Selection Sorting 
    public static void SelectionSort(int arr[]){
        for(int i = 0; i< arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            //Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
                    
        }
    }

    //Insertion sort 
    public static void InsertionSort(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev= i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1]= curr;
        }
    }

    //Count Sorting 
    public static void CountSorting(int arr[]){
        //To find largest element so i can hace size of my count arr
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            largest= Math.max(largest, arr[i]);
        }

        //We calculate frequency of each element from arr and store it in count arr{0,2,1,2,2,0,0,1}
        int count[] = new int[largest+1];
        for(int i =0 ; i<arr.length; i++){
            count[arr[i]]++;
        }

        //Actual Count sorting here 
        int j = 0;
        for(int i =0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] =i; 
                j++;
                count[i]--;
            }
        }
    }

    //To print sorted array
    public static void PrintArr(int arr[]){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,1,3,2,4,3,7};
        CountSorting(arr);
        //Arrays.sort(arr, 0,3, Collections.reverseOrder());
        PrintArr(arr);
        
        
        
    }
}
