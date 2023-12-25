import pojo.People;

import java.util.function.Consumer;

public class ConsumerLearning {
    public static void main(String[] args) {
        Consumer<People> consumer = new Consumer<People>() {
            @Override
            public void accept(People people) {
                int i = people.getAge() + 18;
                System.out.println(i);
            }

            @Override
            public Consumer<People> andThen(Consumer<? super People> after) {
                return Consumer.super.andThen(after);
            }
        };
        Consumer<People> consumer02 = new Consumer<People>() {
            @Override
            public void accept(People people) {
                int age = people.getAge();
                System.out.println(age);
                String name = people.getName();
                System.out.println(name);
            }
        };
        consumer.andThen(consumer02).accept(new People("张国鼎",18));

    }
}
