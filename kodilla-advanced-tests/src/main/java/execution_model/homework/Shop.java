package execution_model.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {

        private List<Order> orders;

        // Konstruktor
        public Shop() {
            this.orders = new ArrayList<>();
        }

        // Metoda dodająca nowe zamówienie
        public void addOrder(Order order) {
            orders.add(order);
        }

        // Metoda zwracająca listę zamówień z zakresu dwóch dat
        public List<Order> getOrdersBetweenDates(String startDate, String endDate) {
            List<Order> selectedOrders = new ArrayList<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Date start = dateFormat.parse(startDate);
                Date end = dateFormat.parse(endDate);

                for (Order order : orders) {
                    Date orderDate = dateFormat.parse(order.getOrderDate());
                    if (orderDate.after(start) && orderDate.before(end)) {
                        selectedOrders.add(order);
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace(); // lub obsłużenie błędu w inny sposób
            }

            return selectedOrders;
        }

        // Metoda pobierająca zamówienia na podstawie zakresu wartości zamówienia
        public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
            List<Order> selectedOrders = new ArrayList<>();
            for (Order order : orders) {
                if (order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue) {
                    selectedOrders.add(order);
                }
            }
            return selectedOrders;
        }

        // Metoda zwracająca liczbę zamówień
        public int getNumberOfOrders() {
            return orders.size();
        }

        // Metoda zwracająca sumę wartości wszystkich zamówień
        public double getTotalOrderValue() {
            double totalValue = 0.0;
            for (Order order : orders) {
                totalValue += order.getOrderValue();
            }
            return totalValue;
        }

        public static void main(String[] args) {
            // Przykładowe użycie klasy Shop
            Shop myShop = new Shop();

            // Dodanie kilku zamówień
            myShop.addOrder(new Order(100.50, "17/02/2021", "user1"));
            myShop.addOrder(new Order(75.25, "10/01/2023", "user2"));
            myShop.addOrder(new Order(150.0, "5/03/2022", "user1"));

            // Wyświetlenie liczby zamówień i sumy wartości
            System.out.println("Liczba zamówień: " + myShop.getNumberOfOrders());
            System.out.println("Suma wartości zamówień: $" + myShop.getTotalOrderValue());
        }
    }

