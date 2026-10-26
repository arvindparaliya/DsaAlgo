package com.arvind;

public class Mountain {
    public static void main(String[] args){
        //just simple find the max value in the array
        //You must write an algorithm that runs in O(log n) time. (means binary search)
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2};
        //index no. :0, 1, 2, 3, 4, 5, 6, 7
        int ans = peakIndexInMountain(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
                // we are in decreasing part of the array, this may be the ans but look at the left
                //that's why end != mid - 1
            }
            else{
                //we are in ascending part of the array
                start = mid + 1; //because we know that mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest number because of hte 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is the what the check say
        //at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence cause of the above line that is the best possible answer

        return start; //or return end as both are equal
    }
}
