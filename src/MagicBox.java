import java.util.Random;

public class MagicBox<T> {
    protected int size;
    protected T[] items;


     MagicBox(int size) {
        T[] items = (T[]) new Object[size];
        this.size = size;
        this.items = items;
    }


    boolean add(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В коробку добавлен объект " + item);
                return true;
            } else if (i >= size - 1) {
                System.out.println(item + " не добавлен(а). Коробка уже заполнена");
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int countNull = 0;
        for (T j : items) {
            if (j == null) {
                countNull++;
            }
        }
        if (countNull > 0) {

            throw new RuntimeException("Коробка не полна, осталось заполнить " + countNull + " ячейки(йку)");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(size);
            return items[randomInt];
        }
    }
}
