public class Chair {

    private String name;
    private String color;

    public Chair(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name, String color){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
