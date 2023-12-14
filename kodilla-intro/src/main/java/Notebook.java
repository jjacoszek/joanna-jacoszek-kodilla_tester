public class Notebook {
    int weight;
    int price;
    int productionYear;

    public Notebook(int weight, int price, int productionYear) {
        this.weight = weight;
        this.price = price;
        this.productionYear = productionYear;
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This weight is light.");
        } else if (this.weight > 700 && this.weight < 1700) {
            System.out.println("The weight is quite heavy.");
        } else {
            System.out.println("The weight is heavy");
        }
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkProductionYearAndPrice() {
        if (this.price > 600 && this.price < 1000 && this.productionYear > 2020) {
            System.out.println("The Price is good and the production year is new.");
        } else if (this.price > 1000 && this.productionYear > 2010 && this.productionYear < 2015) {
            System.out.println("This notebook is expensive and the production year is quite old.");
        } else {
            System.out.println("The year and price are different");
        }
    }
}