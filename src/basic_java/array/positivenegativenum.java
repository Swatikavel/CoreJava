package basic_java.array;

public class positivenegativenum {
    public static void main(String[]args){
        int [] arr ={-1,-5,5,6,-2};
        int [] arr1 ={ };
        for (int i=0; i< arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            } else if (arr[i]<0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
