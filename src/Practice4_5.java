/*public class Practice4_5 {
    public static void main(String[] args){
        for(int i=0;i<=10;i++)
        {
            for(int j=0; j<=i;j++)
                System.out.print("*");
                System.out.println();

        }
    }
}*/

public class Practice4_5 {
    public static void main(String[] args)
    {
        int i=1 , j=1;
        while(j<=10)
        {
            if(i==1&&j==1)
            {
                System.out.printf("*");
            }
             if(i<j)
            {
                System.out.print("*");
                i++;
                continue;
            }
            else if(i==j)
            {
                System.out.println();
            }
            i=0;
            j++;
        }
    }
}

