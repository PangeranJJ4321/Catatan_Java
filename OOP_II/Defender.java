package OOP_II;


public class Defender {
    int hp;
    int defen;

    Defender (int hp, int defen){
        this.hp = hp;
        this.defen  = defen;
    }

    void defend(Figter f){
        hp += f.hp;
        System.out.println(hp);
    }

    void defend(Defender d){
        hp -= d.hp*0.5;
        System.out.println(hp);

    }
}