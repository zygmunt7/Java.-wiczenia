package Gra;

public class Character {
    public String name;
    public int hp;
    public int hit;
    public int comboHit;

    public Character(String name, int hp, int hit, int comboHit) {
        this.name = name;
        this.hp = hp;
        this.hit = hit;
        this.comboHit = comboHit;
    }

    public String characters() {
        System.out.println("Postać: " + name);
        System.out.println("Posiada HP: " + hp);
        System.out.println("Hit: " + hit);
        System.out.println("Hit Combo: " + comboHit);
        /*Batle batle= new Batle();
        batle.batleCharacters();*/

        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Character{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hp=").append(hp);
        sb.append(", hit=").append(hit);
        sb.append(", comboHit=").append(comboHit);
        sb.append('}');
        return sb.toString();
    }
}
