public class User {

    double weight;
    double height;

    public User(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calcBMI() {
        return this.weight / (this.height * this.height);
    }
}
