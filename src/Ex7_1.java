class Tv1{
    boolean power;
    int  channel;

    void power() {power = ! power;}
    void channelup() {++channel;}
    void channeldown() {--channel;}


}

class smartTv extends Tv1{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}



class Ex7_1 {
    public static void main(String args[]){
        smartTv stv = new smartTv();
        stv.channel = 10;
        stv.channelup();
        System.out.println(stv.channel);
        stv.displayCaption("Hello world");
        stv.caption = true;
        stv.displayCaption("Hello world");


    }

}
