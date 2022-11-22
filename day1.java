public class day1 {
    public static void main(String args[]) {
        // Here in this program we are going to take input from user using command line arguments
        // We are going to take eaks data type as input from user
        //String input  
        String name1 = args[0];
        String name2 = args[1];
        // output for the two variables name1 and name2
        System.out.println( "First name is "+ name1);
        System.out.println("Second name is " + name2);
        

        // Next we are going to take 2 integers as input ans produce the output as the sum of both the integers

        int num1 = Integer.parseInt(args[2]);
        int num2 = Integer.parseInt(args[3]);

        int sum = num1 + num2;
        System.out.println("Sum of two integers is = "+sum);
    }
}
