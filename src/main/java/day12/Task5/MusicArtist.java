package day12.Task5;

public class MusicArtist {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "name: " + this.name +  " age: " + this.age;
    }
}
