public class Ex2_8 {
    public static void main(String args[]){
        int x = 10 , y=5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
