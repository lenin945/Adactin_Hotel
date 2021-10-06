package org.junit;

import java.io.IOException;

import org.baseClass.BaseClass;

public class sample extends BaseClass {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		createCell("Adactin", "OrderID", 1, 1, "Lenin");
	String v = readCell("Adactin", "OrderID", 1, 1, "dd-MM-YY");
	System.out.println(v);
	}
}
