class Ex6_1 {
    public static void main(String[] args){
        Tv t;
        t = new Tv();
        t.channel =7;
        t.channeldown();
        System.out.println("현재 채널은"+t.channel+"입니다");

    }
}

class Tv{
    int channel;
    String color;
    boolean power;

    void power() {power =! power;}
    void channelup() {channel++;}
    void channeldown() {channel--;}
}
