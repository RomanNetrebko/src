package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
     private double TAX_RATE = 0.05;
    // Налоговоу ставку объявите в виде константы+
    // здесь ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(int TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    @Override
    public double tax(double i) {
        double j = 0;
        j = i * TAX_RATE;
        return j;
    }

    @Override
    public double income() {
    double i = 0;
    i = quantity * price;

        return i;
    }

    @Override
    public double incomeClean(double i, double j) {
        double m = i - j ;
        return m;
    }


    // Обеспечьте доступ к полям модели через getters и setters +
    // здесь ...


    // Переопределите методы реализуемых интерфейсов.+

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    // Расчёт суммы налога с продаж.
    // здесь ...

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
}
