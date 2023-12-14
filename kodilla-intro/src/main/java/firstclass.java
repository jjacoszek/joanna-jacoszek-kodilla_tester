public class firstclass {
    public static void main(String[] args) {
        String greeting = "Hello World!";
        String name = "Joanna";
        int age = 34;
        char firstletter = 'J';

        System.out.println(greeting);
        System.out.println(name);
        System.out.println(age);
        System.out.println(firstletter);


        Notebook notebook = new Notebook(600, 900, 2023);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.productionYear);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkProductionYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2014);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.productionYear);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkProductionYearAndPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2008);
        System.out.println("The notebook weight is " + oldNotebook.weight);
        System.out.println("The notebook price is" + oldNotebook.price);
        System.out.println("The Production Year is " + oldNotebook.productionYear);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkProductionYearAndPrice();


    }
}





