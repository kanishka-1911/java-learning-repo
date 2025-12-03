import java.util.*;

//Array-collection of elements of the same data type stored at contiguous memory locations.
// int [] marks=new int[]{10,2030};
   
class arr {
    public static void main(String[] args) {
        int[] score = new int[5]; // declaring and initialising array
        Scanner a = new Scanner(System.in);
        System.out.print("enter mat score:");
        score[0] = a.nextInt();
        System.out.print("enter science score:");
        score[1] = a.nextInt();
        System.out.print("enter social score:");
        score[2] = a.nextInt();
        System.out.print("enter english score:");
        score[3] = a.nextInt();
        System.out.print("enter cs score:");
        score[4] = a.nextInt();
        a.close();
        int tot = score[0] + score[1] + score[2] + score[3] + score[4];
        System.out.println("Total score: " + tot);
        System.out.println("acessing maths score:" + score[0]);// using index

    }
}

// 1D array methods
class arrmethods {
    public static void main(String[] args) {
        // 1. Creating and Initializing array
        int[] numbers = { 50, 10, 30, 70, 20 };

        // 2. Printing original array
        System.out.println("Original array: " + Arrays.toString(numbers));//string rep of object

        // 3. Accessing an element
        System.out.println("Element at index 2: " + numbers[2]);

        // accessing a range of elements
        int[] subarr = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("elements from index 1 to 4:" + Arrays.toString(subarr));

        // 4. Updating an element
        numbers[1] = 99;
        System.out.println("After updating index 1: " + Arrays.toString(numbers));

        // 5. Length of array
        System.out.println("Length of array: " + numbers.length);

        // 6. Sorting array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 7. Finding max and min
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) { // enhanced for loop
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // 8. Sum of elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // 9. Searching an element (e.g., 30)
        int key = 30;
        boolean found = false;
        for (int num : numbers) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(key + " is found in the array.");
        else
            System.out.println(key + " is not found in the array.");

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 10, 20, 30, 60, 50 };

        // 10.compare() -() 0 ,if both arrays are equal <0 → if array1 is less than
        // array2 >0 if array1 is greater than array
        System.out.println("compare(): " + Arrays.compare(arr1, arr2));

        // 11.copyOf() - Creates a new array with new length
        int[] arrCopy = Arrays.copyOf(arr1, 7);
        System.out.println("copyOf(): " + Arrays.toString(arrCopy));

        // 12.equals()
        System.out.println("equals(): " + Arrays.equals(arr1, arr2));

        // 13.fill() - fills array with a specified value
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 99);
        System.out.println("fill(): " + Arrays.toString(fillArray));

        // 14.mismatch() - index where arrays first differ
        System.out.println("mismatch(): " + Arrays.mismatch(arr1, arr2)); // 3

    }
}

class TwoD {
    public static void main(String[] args) {
        // 1. Declare and initialize a 2D array
        int[][] matrix = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // 2. Print the 2D array using deepToString
        System.out.println("Original Matrix:");
        System.out.println(Arrays.deepToString(matrix));

        // 3. Access and update an element
        System.out.println("Element at (1,1): " + matrix[1][1]);
        matrix[1][1] = 99;
        System.out.println("Updated Matrix:");
        System.out.println(Arrays.deepToString(matrix));

        // 4. Print using nested for loop
        System.out.println("Matrix using loop:");
        //for loop for manipulation
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // 5.Sum of all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // 6.Find max and min values
        int max = matrix[0][0];
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max)
                    max = val;
                if (val < min)
                    min = val;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // 7. deepEquals() - for multidimensional arrays
        int[][] multi1 = { { 1, 2 }, { 3, 4 } };
        int[][] multi2 = { { 1, 2 }, { 3, 4 } };
        System.out.println("deepEquals(): " + Arrays.deepEquals(multi1, multi2)); // true
    }
}

// 1D
class car {
    public static void main(String[] args) {
        // String cars;
        String[] cars = { "BMW", "Volvo", "Manhedra", "Tesla" };
        System.out.println(cars[0]);// accessing
        cars[2] = "Kiwi";// updating
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Element at index " + i + " is " + cars[i]);// printing elemts
        }
        // for-each:works value based
        for (String i : cars) {
            System.out.println(i);
        }
        cars[4] = "Tata";
        System.out.println(cars[0]);// java.lang.ArrayIndexOutOfBoundsException
    }
}

class lexi {
    public static void main(String[] args) {
        String[] nums = new String[] { "1", "9", "10" };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));// "1" comes before "10" because it's shorter and starts with the same
                                                  // character.(like a dict)

    }
}

// grtting input using for loop in array
class getIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of sub " + (i + 1) + " :");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        sc.close();
        float avg = sum / 5;
        System.out.println("You have entered marks of 5 subjects");
        System.out.println("the total of your marks are: " + sum);
        System.out.println("Your average is " + avg);
    }
}
class printNum{
    public static void main(String[] args) {
        int[] num={10,20,64,67,49,33,89,90,77,45};
        for(int i=0;i<num.length;i++){
            System.out.print( num[i]+ " ");//10 20 64 67 49 33 89 90 77 45  " " adds space
        }
    }
}
class MidEle{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=scan.nextInt();
        int[]elements=new int[size];
        for (int i=0;i<elements.length;i++){//or use i<=size-1 instead of elements.length
            System.out.print("enter "+(i+1)+"th number: ");
            elements[i]=scan.nextInt();
            
        }
        if (size%2==0){
            int mid =size/2;
            int even=mid-1;
            System.out.println("The mid element is "+elements[even]+ ","+elements[mid]);
        }
        else{
                int mid =size/2;
                System.out.println("The mid element is: "+elements[mid]);
            }
            
        }
    }
//multi dm array
class multi{
    public static void main(String[] args) {
        int[][]tens = {{10,20,30},
                       {40,50,60,30},
                       {1,2,3}};
        tens[2][2]=4;//modifying
        System.out.println("accessing 2nd element of first array: "+tens[0][1]);
        System.out.println("length of array: "+tens.length);//3
        System.out.println("length of first array: "+tens[0].length);//3
        System.out.println("length of second array: "+tens[1].length);//4
        //looping through multi-dim array
        for(int i=0;i<tens.length;i++){//tens.length gives num of arrays inside multidim here:3
            for(int j=0;j<tens[i].length;j++){//tens[i].length gives size of each array inside it
                System.out.print(tens[i][j]+" ");
            }
        }
        }
}
class Marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size: ");
       int size=sc.nextInt();
        int[]marks=new int[size];
        for(int i=1;i<marks.length;i++){
            marks[i]=sc.nextInt();
           System.out.println(Arrays.toString(marks));
        }

    }
}