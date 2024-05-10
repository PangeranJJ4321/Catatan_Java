package OOP_II;

public class Figter {
    int hp;
    int attactPower;

    Figter(int hp, int attackPower){
        this.hp = hp;
        this.attactPower = attackPower;
    }

    void attack(Defender d){
        d.hp -= attactPower;
        System.out.println(d.hp);
    }
    void defend(Defender d){
        d.hp -= attactPower*0.5;
        System.out.println((int) d.hp);
    }



}