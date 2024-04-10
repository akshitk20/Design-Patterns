package collections.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<String> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        String menuItem = items.get(position);
        position = position + 1;
        return menuItem;    }
}
