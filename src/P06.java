public class P06 {
    //Program to Swap Two Numbers
    public static void main(String[] args) {
        float first = 3.5f;
        float second = 7.5f;
        System.out.println("__before swapping__");
        System.out.println("first =" + first);
        System.out.println("secomd =" +second);

        float teampary = first;
        first = second;
        second = teampary;
        System.out.println("__After swapping__");
        System.out.println("first number =" + first);
        System.out.println("second number  =" +second);




    }
}
