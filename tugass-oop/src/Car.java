public class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name, String color){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}
