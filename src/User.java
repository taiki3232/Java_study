public class User {

    double weight;
    double height;

    public double calcBMI() {
        return this.weight / (this.height * this.height);
    }
}
