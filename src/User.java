public class User {

    private double weight;
    private double height;

    public User(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() { 
        return this.weight;
    }

    public double getHeghter() {
        return this.height;
    }

    public double calcBMI() {
        return this.weight / (this.height * this.height);
    }
}
