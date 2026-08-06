package basic_java;


// int []arr;  Declaration
//arr=new int[3];  Creation
// int [] arr= new int [3];   Declaration and creation in single line
// int []arr= {101,102,103};  Declaration, creation and initialization in single line.
public class array_Practice {
    public static void main(String[] args){
        // 1. Initializing an array of integers
        int[] nums= {10,20,30,40,50};

        //2. Access elements using an index (Indices start at 0
        System.out.println("First Element:"+ nums[0]); // output 10
        System.out.println("Third Element:"+ nums[2]); // output 30

        //3. Find the length of the array
        System.out.println("Array size:" + nums.length); // output 5

        //4. Modify an element value
        nums[1]=99;
        System.out.println("Updated second element: " + nums[1]); // Outputs 99

        //5. Iterate using a traditional for loop(Good for tracking Indices)
        System.out.println("Updated second element: " + nums[1]); // Outputs 99


    }

}
