import controllers.ProductController;
import models.Product;
import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {


        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр
        Product product = new Product();
        SalesView salesView = new SalesView();
        ProductController productController = new ProductController();


        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
//         controller.runApp();
    }
}
