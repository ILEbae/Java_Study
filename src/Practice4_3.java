public class Practice4_3 {
    public static void main(String[] args)
    {
        int sum =0 , temp = 0;
        System.out.println("1+(1+2)+(1+2+3)+...+(1+2+3+...+9+10) = ?");
        for(int i =1; i<=10 ; i++)
        {
            sum+=i;
            temp = sum +temp;
        }

        System.out.println(temp);

    }
}
