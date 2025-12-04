package ExceptionHandling;

public class BasicTryCatch{
    public static void main(String[] args) {
        try{
     int[]nums={1,2,3,4};
     System.out.println(nums[10]);
    }catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    } 
    }
   
}

