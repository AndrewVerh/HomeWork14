public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(5);
        MagicBox<Integer> integerMagicBox = new MagicBox<>(3);

        stringMagicBox.add("Petya");
        stringMagicBox.add("Olya");
        stringMagicBox.add("Oleg");
        stringMagicBox.add("Tanya");
        //stringMagicBox.add("Dasha");
        //stringMagicBox.add("Sasha");
        //stringMagicBox.add("Masha");
        //System.out.println(stringMagicBox.pick());

        System.out.println();

        integerMagicBox.add(4);
        //integerMagicBox.add(0);
        //integerMagicBox.add(11);
        //integerMagicBox.add(203);
        //integerMagicBox.add(134);
        System.out.println(integerMagicBox.pick());

        //stringMagicBox.items [2] = "Olya";

    }
}
