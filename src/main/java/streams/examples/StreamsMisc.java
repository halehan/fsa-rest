package streams.examples;

import org.apache.tomcat.util.http.fileupload.util.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMisc {

    public static void main(String[] args) {
        StreamsMisc sm = new StreamsMisc();
        sm.streamsRunnable();
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
