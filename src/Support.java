import charactor.Hero;
public class Support extends Hero{
    public void heal(Hero...heroes){
        for(int i = 0; i < heroes.length; i++){
            System.out.println(name + "治疗了" + heroes[i].name);
        }
    }
    public static void main(String[] args){
        Support nai = new Support();
        nai.name = "奶妈";
        nai.armor = 10;
        nai.hp = 400;
        nai.moveSpeed = 30;

        Hero garon = new Hero();
        garon.name = "盖伦";
        Hero teemo = new Hero();
        teemo.name = "提莫";

        nai.heal(garon,teemo);
        //make some change
        //make changes
    }
}
