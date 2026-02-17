import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        //
        //Create a list of strings with proper names.
        // Write a method that returns a list of all strings starting with the
        // letter 'A' (uppercase) and have exactly 3 letters. Print the result.
        List<String> properNamesList = new ArrayList<>(List.of(
                "Juan", "Pedro", "Ana", "Maria", "Antonio", "Zacarías", "Illán" ));

        printGoodNames(properNamesList);

        //Exercise 2
        //
        // Program a method that returns a chain separated by commas,
        // based on a list of Integers. Each element must be preceded by letter “e”
        // if the number is even, or by the letter “o” if the number is odd.
        // For example, if the input list is (3, 55, 44), the output must be “o3, o55, e44”. Print the result.
        List<Integer> integersList = new ArrayList<>(List.of(
                3, 55, 4, 16, 33, 15, 24 ));
        System.out.println(createChain(integersList));

        //Exercise 3
        //
        // Create a Functional Interface that contains a method called operation().
        // This method must return a float. Inject into the interface created by a lambda,
        // the body of the method, so that the operation can be transformed with a sum,
        // a subtraction, a multiplication and a division.
        OperationsInterface opSum = (i1,i2) ->(i1+i2);
        OperationsInterface opRes = (i1,i2) ->(i1-i2);
        OperationsInterface opMul = (i1,i2) ->(i1*i2);
        OperationsInterface opDiv = (i1,i2) ->((float) i1 /i2);
        OperationsInterface opMod = (i1,i2) ->(i1%i2);

        List<OperationsInterface> ob = new ArrayList<>(List.of(opRes,opDiv,opSum,opMul,opMod));

        ob.forEach(o -> System.out.println(o.operation(12, 32)));

        //Exercise 4
        //
        //Create a list that contains some strings of text and numbers.
        //
        //Sort them by:
        //
        //    Alphabetically for the first character. (Note: charAt(0)return the numeric code of the first character)
        //    The chains that contain an "e" first, the rest of the chains after. Put the code directly into the lambda.
        //    Change all the items in the list that have an ‘a’. Modify the ‘a’ for a ‘4’.
        //    Show only elements that are numerical. (Even if they are saved as Strings).
        List<String> list = new ArrayList<>(Arrays.asList(
                "Manzana", "123", "Banana", "42", "Pera", "7", "Elefante", "Sandía"
        ));

        list.sort((a, b) -> a.charAt(0) - b.charAt(0));
        System.out.println(list);

        list.sort((a, b) -> Boolean.compare(!a.contains("e"), !b.contains("e")));
        System.out.println(list);

        list.replaceAll(s -> s.replace("a", "4"));
        System.out.println(list);


        list.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }

    public static void printGoodNames(List<String> list){
        list.stream()
                .filter(o -> o.startsWith("A" ))
                .filter(o -> o.length() == 3)
                .forEach(System.out::println);
    }

    public static String createChain(List<Integer> list){

        return list.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));
    }

}