package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;
    public Square() {
        super(4,"Portocaliu");
        side = 5;
    }
    public Square(float side) {
        super(4, "Mov");
        this.side = side;
    }

}
