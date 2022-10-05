package game.hero;
public class Elf4 {

    private String nickname;
    private int id;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Elf4() {
        System.out.println("Привет, я эльф!");
    }

    public Elf4(String nickname){
        this.nickname = nickname;
    }

    public Elf4(int id) {
        this.id = id;
    }


    public Elf4(String nickname, int id) {
        this.nickname = nickname;
        this.id = id;
    }

}
