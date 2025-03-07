package ro.ulbs.paradigme.lab2;

public class Form {
    private int nrLaturi;
    private String color;

    public Form(){
        color = "white";
        nrLaturi = 4;
    }
    public Form(int n, String p){
        nrLaturi = n;
        color = p;
    }
    public float getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return  "This form has the color "+color+" and signed number "+nrLaturi+" and area of "+getArea();
    }
}
