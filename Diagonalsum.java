import java.io.*;
import java.util.*;
class Diagonalsum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of the matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter"+(r*c)+"elements into the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("sum of principal diagonal elements is"+sum);
    }
}
