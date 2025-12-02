public class Main {
    static void main() {
        Methods.NewMath.random(5, 10);
        Methods.NewMath.random(5, 10);

        Methods.NewArrayList<String> namen = new Methods.NewArrayList<>();
        namen.add("Max");
        namen.add("Anna");

        Methods.NewArrayList<Integer> zahlen = new Methods.NewArrayList<>();
        zahlen.add(1);
        zahlen.add(42);

        System.out.println(zahlen.get(1) + namen.get(1));
    }
}