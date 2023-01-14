class Ex6_2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();

        System.out.println("t1의 채널 값은" + t1.channel + "입니다");
        System.out.println("t2의 채널 값은" + t2.channel + "입니다");

        t1.channel =7;
        System.out.println("t1의 채널 값을 7로 변경하였습니다");
        System.out.println("t1의 채널 값은" + t1.channel + "입니다");
        System.out.println("t2의 채널 값은" + t2.channel + "입니다");

    }
}
class Tv2{
    int channel;
    String color;
    boolean power;

    void power() {power =! power;}
    void channelup() {channel++;}
    void channeldown() {channel--;}
}