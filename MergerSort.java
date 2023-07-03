import java.util.Scanner;

class MergerSort {
    public static void divide(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int i1 = si;
        int i2 =mid+1;
        int x=0;
        while(i1<=mid && i2<=ei){
            if(arr[i1]<=arr[i2]){
                merged[x++]=arr[i1++];
            }
            else{
                merged[x++]=arr[i2++];
            }
        }
        while(i1<=mid){
            merged[x++]=arr[i1++];
        }
        while(i2<=ei){
            merged[x++]=arr[i2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int n = arr.length;
        System.out.println("Enter the array:");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

//OUTPUT
/*
Enter the array size:
6
Enter the array:
6
3
9
5
2
8
2 3 5 6 8 9
 */
