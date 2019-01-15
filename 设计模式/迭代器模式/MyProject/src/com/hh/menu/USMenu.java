package com.hh.menu;

import java.util.Iterator;

public class USMenu {

	private MenuItem[] items = new MenuItem[2];

	public USMenu() {
		items[0] = new MenuItem("∫∫±§", "4");
		items[1] = new MenuItem("’®º¶Õ»", "6");
	}

	public Iterator getIterator() {
		return new UsMenuIterator();
	}

	class UsMenuIterator implements Iterator {

		private int position = 0;

		@Override
		public boolean hasNext() {
			if (position < 2) {
				return true;
			}
			
			position++;
			return false;
		}

		@Override
		public Object next() {
			MenuItem menuItem = items[position];
			position++;
			return menuItem;
		}

	}

}
