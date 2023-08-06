public class part3 {


//    Write a program to sum all the values of a given Array in Java.
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
//    What is the output? => 2

//    double[ ] exampleArray = {1,5,6,5,4,1};
//
//    double maximum = examplesArray[0];
//
//    int index = 0;
//
//          for (int i = 1; i<exampleArray.length>; i++){
//
//        if (exampleArray[ i ] > maximum) {
//
//            maximum = exampleArray[ i ];
//
//            index = i;
//
//        }
//
//    }
//
//          System.out.println(index);


//
//    Write a public static method called "toPower" that takes in as parameters two integers
//    called size and power. The method should return an array of size "size" with each array index
//    raised to the value of "power." So, for example, if we passed in "size = 4" and "power = 2" to
//    the "toPower," the method should return the following result: [0,1,4,9].
    public static int[] toPower(int size, int power) {
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) Math.pow(i,power);
        }
        return res;
    }
    public static void main(String[] args) {

        int[] res = part3.toPower(4,2);
        for (int i:res) {
            System.out.println(i);
        }
    }
}
