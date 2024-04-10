package collections.iterator;

public class DinnerMenuIterator implements Iterator {
    String[] items;
    int position = 0;
    public DinnerMenuIterator(String[] items) {
        this.items = items;
    }

    public String next() {
        String menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
