// <!-- Problem Description
// You are a kindergarten teacher. You want to teach your students that being truthful is a good thing and that falsehood is a bad thing.

// Complete the function to return "Good" when the input is true and "Bad" when the input is false.
// Hint: Write down the conditions and think about if-else to implement it. -->

public class A {

    public static String trueOrFalse(boolean input){
        if(input==true){
            return "Good";
        }
        else{
            return "Bad";
        }
    }
    public static void main(String[] args){
    	boolean test=true;
        System.out.println("Hello world");
        boolean ip =false;
        System.out.println(trueOrFalse(ip));
    }
}
