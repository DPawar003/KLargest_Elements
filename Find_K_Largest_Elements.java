import java.util.*;
import java.util.PriorityQueue;
import java.util.Arrays;

public class KLargest{
    public static int[] findLargest(int[] arr,int N,int K){
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int num:arr){
            if(minHeap.size()<K){
                minHeap.add(num);
            }else if(num>minHeap.peek()){
                minHeap.poll();
                minHeap.add(num);
            }
        }
        int result[]=new int[K];
        for(i=0;i<K;i++){
            result[i]=minHeap.poll();
        }
        return result;
    } 
}
public static void main(String[] args){
    int[] arr={10,50,60,9,99,555,85,0}
    int N=arr.length;
    int K=3;
    int[] result=findLargest(arr,N,K);
    System.out.println(Arrays.toString(result));
}
