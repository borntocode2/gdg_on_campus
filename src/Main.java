import method.MyClass;

import java.util.function.UnaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> u = (s) -> "Hello, " + s;

        UnaryOperator<String> u2 = MyClass::hello;

    }
}