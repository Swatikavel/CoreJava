package basic_java.array;

public class DuplicateElement {
    public static void main (String[] args){
        int[]arr={10,20,40,10,50,20,10};
        for(int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate elements:" +arr[i]);

                }
            }

        }
    }
}
