package com.hh.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class ChineseMenu {

	private ArrayList<MenuItem> arrayList = new ArrayList<>();
	
	public ChineseMenu() {
		arrayList.add(new MenuItem("������","12"));
		arrayList.add(new MenuItem("С����Ģ��","14"));
	}
	
	public Iterator getIterator() {
		return arrayList.iterator();
	}
	
}
