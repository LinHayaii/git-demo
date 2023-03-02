package property;

public class Armor extends Item{
    int ac;
    public void effect(){
        System.out.println("使用后加护盾");
    }
    public static void main(String[] args){
        Armor a = new Armor();
        Item b = new Item();
        Item c = new Armor();

        a.effect();
        b.effect();
        c.effect();
    }
}
