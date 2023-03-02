package charactor;
public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;
    public Hero(){};
    public void huixue(int xp){
        hp = hp + xp;
        xp = 0;
    }
    public static void main(String[] args){
        Hero garen  = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;//java默认数字为double
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        int tmp = 100;
        garen.huixue(tmp);
        System.out.println(tmp+" "+garen.hp);
    }
}
