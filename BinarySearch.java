import java.util.Scanner;

class BinarySearch {
    int binarySearch(int arr[],int key){
        int l=0,h=arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(key==arr[m]){
                return m;
            }
            if(key>arr[m]){
                l=m+1;
            }
            else{
                h=m-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int []ar = new int[size];
        System.out.println("Enter the array:");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Enter the value to search:");
        int value = sc.nextInt();

        int index = ob.binarySearch(ar,value);

        if(index==-1){
            System.out.println("Key value not found in array.");
        }
        else{
            System.out.println("Key value is found at index : "+index);
        }


    }
}

//OUTPUT
/*
Enter the size of array:5
Enter the array:
4
6
8
9
3
Enter the value to search:6
Key value is found at index : 1
 */