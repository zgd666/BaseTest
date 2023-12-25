import pojo.People;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearning {
    public static void main(String[] args) {
        IntStream build = IntStream.builder().add(20).add(80).add(40).build();
//        OptionalInt min = build.min();
//        if (min.isPresent()) {
//            System.out.println(min.getAsInt());
//        }
//        OptionalInt max = build.max();
//        if (max.isPresent()) {
//            System.out.println(max.getAsInt());
//        }
//        IntPredicate intPredicate = new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                System.out.println(value);
//                return value > 30;
//            }
//        };
//        IntStream intStream = build.filter(intPredicate);
//        long count = intStream.count();
//        System.out.println(count);
//        for (int i : build.sorted().toArray()) {
//            System.out.println(i);
//        }

        List<People> people = new ArrayList<>();
        people.add(new People("Alice", 25));
        people.add(new People("Bob", 30));
        people.add(new People("Alice", 20));
        people.add(new People("Bob", 25));
        Stream<People> stream = people.stream();
        Comparator<People> comparator = new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0){
                    return i;
                }else{
                    return Integer.compare(o1.getAge(), o2.getAge());
                }

            }
        };
//        List<People> sortedPeople = people.stream()
//                .sorted(Comparator.comparing(People::getName)
//                        .thenComparing(People::getAge))
//                .collect(Collectors.toList());
//        for (People sortedPerson : sortedPeople) {
//            String s = sortedPerson.getName() + ":" + sortedPerson.getAge();
//            System.out.println(s);
//        }
        for (People people1 : stream.sorted(comparator).collect(Collectors.toList())) {
            String s = people1.getName() + ":" + people1.getAge();
            System.out.println(s);
        }

    }
}
