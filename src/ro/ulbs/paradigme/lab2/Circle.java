package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;
    public Circle() {
        super(1,"Albastru");
        radius = 1;
    }
    public Circle(float radius) {
        super(3, "Mov");
        this.radius = radius;
    }


}
