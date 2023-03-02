package property;
public class Item {
    String name;
    int price;

    public void effect() {
        System.out.println("使用后可以有效果");
    }

    public static void main(String[] args){
        Item hpBottle = new Item();
        hpBottle.name = "血瓶";
        hpBottle.price = 50;

        Item shoes = new Item();
        shoes.name = "草鞋";
        shoes.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;

        float f1 = 3.14f;
        double d1 = 3.14;
        double d2 = 1.234e2;//科学计数法表示

        long val = 26L;//使用L表示是long
        short sh = 129;
        byte b = 127;
        int decVal = 26;
        int hexVal = 0x1a;//16进制 带0x
        int oxVal = 032;//8进制 带0
        int binVal = 0b10010;//2进制

        byte bb;
        bb = 8;
        short s = 319;
        int i = 46;
        long l = 234L;
        float ff = 3.45f;
        double dd = 3.23;
        char c = '单';
        String hehe = "双字符";
        char cc = '双';


    }
}
