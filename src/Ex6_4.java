class Ex6_4 {
    public static void main(String[] args){
      Mymath mm = new Mymath();
      long reslut1 = mm.add(5L,3L);
        long reslut2 = mm.subtract(5L,3L) ;
        long reslut3 = mm.multiply(5L,3L) ;
        double reslut4 = mm.divide(5L,3L);


        System.out.println("add(5L,3L) =" +reslut1);
        System.out.println("subtract(5L,3L) =" +reslut2);
        System.out.println("multiply(5L,3L) =" +reslut3);
        System.out.println("divide(5L,3L) =" +reslut4);

    }

}

class Mymath{
    long add(long a,long b){
        long result = a+b;
        return result;
    }

    long subtract(long a,long b){return a-b;}
    long multiply(long a, long b){return a*b;}
    double divide(double a, double b){return a/b;}

}
