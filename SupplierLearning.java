import pojo.People;

import java.util.function.Supplier;

public class SupplierLearning {
    public static void main(String[] args) {
        Supplier<People> supplier = new Supplier<People>() {
            @Override
            public People get() {
                return new People("张国鼎",18);
            }
        };
        People people = supplier.get();
        String name = people.getName();
        System.out.println(name);
    }
}
