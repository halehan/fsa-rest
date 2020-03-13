package streams.examples;

import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMisc {

    class Student {

        private String name;
        private Set<String> book;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<String> getBook() {
            return book;
        }

        public void setBook(Set<String> book) {
            this.book = book;
        }

        public void addBook(String book) {
            if (this.book == null) {
                this.book = new HashSet<>();
            }
            this.book.add(book);
        }
        //getters and setters

    }

    public static void main(String[] args) {
        StreamsMisc sm = new StreamsMisc();
    //    sm.streamsRunnable();
        sm.flatMapExample();
    }

    private void flatMapExample() {

        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);


        List<String> collect =
                list.stream()
                        .map(x -> x.getBook())      //Stream<Set<String>>
                        .flatMap(x -> x.stream())   //Stream<String>
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println("flatMap " + x));

        Stream<Set> collectMap =
                list.stream()
                        .map(x -> x.getBook());

        collect.forEach(x -> System.out.println("map  " +x));

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        for(String ph : phones) {
            System.out.println(ph);
        }

    }

    private void streamsRunnable() {

        List<String> peeps = Arrays.asList("John","Tom", "Sally");

        List<String> answer = peeps.stream().map(String::toLowerCase).
                collect(Collectors.toList());

        List<String> answer2 = new ArrayList<String>();

        for(String peep: peeps) {
            answer2.add(peep.toUpperCase());
        }
        System.out.println(answer2);

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        numbers.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =
                numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);

        List<String> names =
                Arrays.asList("Reflection","Collection","Stream", "Suck");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);


        int sum = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i >= 2)
                .map(i -> i * 3)
                .sum();
        System.out.println(sum);

    }
}
