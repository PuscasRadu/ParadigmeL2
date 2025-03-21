package ro.ulbs.paradigme.lab2;

public class Form {
    private int nrLaturi;
    private String color;

    public Form(){
        color = "white";
        nrLaturi = 4;
        counter++;
    }
    public Form(int n, String p){
        nrLaturi = n;
        color = p;
        counter++;
    }
    public float getArea(){
        return 0;
    }

    static public int getCounter(){
        return counter;
    }

    @Override
    public String toString() {
        return  "This form has the color "+color+" and signed number "+nrLaturi+" and area of "+getArea();
    }
    public static int counter = 0;




}

