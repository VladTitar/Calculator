public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        /*
         * Проблема с кодом, заключается в делении на ноль.
         * Конкретнее, переменная b инициализируется значением 0 при вызове метода minus().
         * В результате происходит деление на ноль в следующей строке: "int c = calc.devide.apply(a, b);", что приводит к исключению ArithmeticException.
         * Ошибка возникает из-за того, что переменная b равна нулю, что приводит к исключению ArithmeticException при делении на ноль.
         * Чтобы избежать ошибки, можно использовать конструкцию try-catch для обработки исключения.
         *
         * Также можно добавить проверку на ноль перед вызовом операции деления,
         * чтобы избежать возникновения исключения: BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
         */

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
