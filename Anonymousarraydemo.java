import java.io.*;
class Anonymousarraydemo{
    public static void main(String args[]){
        PrintArray(new int[]{10,20,30,40});
    }
    static void PrintArray(int arr[]){
        System.out.println("The elements in Anonymousarray are");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
