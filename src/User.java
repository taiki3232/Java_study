public class User {

    private String name;
    private double weight;
    private double height;

    public User(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public String getName() {
        return this.name;
    }
    public double getWeight() { 
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double calcBMI() {
        return this.weight / (this.height * this.height);
    }
}
