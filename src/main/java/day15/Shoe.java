package day15;

public class Shoe {
    private String name;
    private Double size;
    private Integer quantity;

    public Shoe(String name, Double size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public String toString(){
        return "{" + "Название: " + name + ", Размер: " + size + ", Количество: " + quantity + "}" + "\n";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }
}
