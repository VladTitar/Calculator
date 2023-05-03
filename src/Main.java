public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

//        Ошибка возникает из-за того, что переменная b равна нулю, что приводит к исключению ArithmeticException при делении на ноль.
//        Нужно использовать проверку на ноль перед вызовом операции деления в классе Calculator,
//        чтобы избежать возникновения исключения ArithmeticException.
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
    }
}
