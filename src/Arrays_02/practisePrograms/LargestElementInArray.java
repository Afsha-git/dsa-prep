package Arrays_02.practisePrograms;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {4,6,7,8,9,2,100};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
