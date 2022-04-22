package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.toFixed;

// Controller
public class ProductController {

    protected Product model;
    SalesView view;

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

        toFixed(p.income());
        toFixed(p.tax(p.income()));
        toFixed(p.incomeClean(p.income(), p.tax(p.income())));


       // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "[здесь должен быть вывод по формату]";

        view.getOutput(output);
    }
}
