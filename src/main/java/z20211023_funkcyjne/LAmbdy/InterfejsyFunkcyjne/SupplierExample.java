package z20211023_funkcyjne.LAmbdy.InterfejsyFunkcyjne;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier=() -> "test supl";
        printValueFromSupplier(supplier);
        //to samo
        printValueFromSupplier( ()-> "test supl");
    }

    static void  printValueFromSupplier(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}
