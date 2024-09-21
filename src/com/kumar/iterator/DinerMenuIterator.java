package com.kumar.iterator;

import java.util.Iterator;
import java.util.List;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;

    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItems = items[position];
        position = position + 1;
        return menuItems;
    }

    @Override
    public void remove() {
        throw  new UnsupportedOperationException("You shouldn't be tying to removed menu items.");
    }
}
