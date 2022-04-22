package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.rounder;

// Controller
public class ProductController {

    public Product model;
   public SalesView view;

    // Конструктор
    public ProductController(Product model , SalesView view) {
        this.model = model;
        this.view = view;
    }

    public ProductController() {
    }

    public void runApp() {

        view.getInputs();
        model.getName();

        Product p = new Product();
        p.income();
        p.tax(p.income());
        p.incomeClean(p.income(), p.tax(p.income()));

        rounder(p.income());
        rounder(p.tax(p.income()));
        rounder(p.incomeClean(p.income(), p.tax(p.income())));




       // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "[здесь должен быть вывод по формату]" + rounder(p.income()) +
                "Сумма налога" + rounder(p.tax(p.income())) +
                "Чистый доход" + rounder(p.incomeClean(p.income(), p.tax(p.income())));

        view.getOutput(output);
    }
}
