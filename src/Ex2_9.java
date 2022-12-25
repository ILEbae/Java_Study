public class Ex2_9 {
    public static void main(String[] arg){
        String ur1 = "www.codechobo.com";
        float f1 = 0.10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f,%e,%g%n",f1,f1,f1);
        System.out.printf("f2=%f,%e,%g%n",f2,f2,f2);
        System.out.printf("f1=%f,%e,%g%n",f3,f3,f3);
        System.out.printf("d=%f%n",d);
        System.out.printf("d=%14.10f%n",d);
        System.out.printf("[1234567890]%n");
        System.out.printf("[%s]%n",ur1);
        System.out.printf("[%20s]%n",ur1);
        System.out.printf("[%-20s]%n",ur1);
        System.out.printf("[%.8s]",ur1);





    }
}
