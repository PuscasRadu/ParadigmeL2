package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    private float base;
    private float height;

    public Triangle() {
        super(3,"Indigo");
        base = 1;
        height = 2;
    }
    public Triangle(float base, float height) {
        super(3, "Galben");
        this.base = base;
        this.height = height;
    }
}
