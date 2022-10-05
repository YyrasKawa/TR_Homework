import game.hero.Elf4;

public class Homework {
    public static void main(String[] args) {
        Elf4 elf4_hero = new Elf4();
        elf4_hero.setNickname("Muilcorch");
        elf4_hero.setId(2458);
        System.out.println("Меня зовут: " + elf4_hero.getNickname());
        System.out.println("Мой id на карте: " + elf4_hero.getId());
        System.out.println("Запомни хорошо: " + elf4_hero.getNickname() + " " + elf4_hero.getId());
    }
}
