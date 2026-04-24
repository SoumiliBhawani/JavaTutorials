package CopyConstructor;

public class SimpleTree {

    private int height;
    private String type;

    // parameterized constuctor
    public SimpleTree(int height, String type) {
        this.height = height;
        this.type = type;
    }

    // Copy Constructor
    public SimpleTree(SimpleTree other) {
        this.height = other.height;
        this.type = other.type;
    }

    public void display() {
        System.out.println("Height: " + height + ", Type: " + type);
    }
}
