public class P09 {
    //Largest Among three numbers
    public static void main(String[] args) {
        double n1 = -4.4;
        double n2 = 4.4;
        double n3 = 3.2;
        if ( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + "the largest number ");
        else if( n2 >= n1 && n2 >= n3 )
                System.out.println(n2 + "the largest number ");
        else
                    System.out.println(n3 + "the largest number .");


    }
}
