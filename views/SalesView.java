package views;


import controllers.ProductController;
import models.Product;
import utils.Validator;

import java.util.Locale;
import java.util.Scanner;

// View
public class SalesView extends ProductController {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    public SalesView(String title, String name, int quantity, double price, Scanner scanner) {
        this.title = title;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.scanner = scanner;
    }

    public SalesView(String title, String name, int quantity, double price, Scanner scanner, Product model , SalesView view) {
        super(model , view);
        this.title = title;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.scanner = scanner;

    }

    public SalesView() {

    }
    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.+



    public void getInputs() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(title = "Введите наименование товара: ");
        Validator.validateName(scanner);
        model.getName();

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.



        System.out.println(title = "Введите количество: ");
        Validator.validateQuantityInput(scanner);
        model.getQuantity();
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        System.out.println(title = "Введите цену: ");
        Validator.validatePriceInput(scanner);
        model.getPrice();
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
