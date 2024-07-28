package com.example;

public class FactoryImpl {

	public static void main(String[] args) {
		System.out.println("----Word Document----");
		DocumentFactory df = new WordDocumentFactory();
		Document d = df.createDocument();
		d.open();
		d.save();

		System.out.println("----Pdf Document----");
		df = new PdfDocumentFactory();
		d = df.createDocument();
		d.open();
		d.save();

		System.out.println("----Excel Document----");
		df = new ExcelDocumentFactory();
		d = df.createDocument();
		d.open();
		d.save();
	}

}
