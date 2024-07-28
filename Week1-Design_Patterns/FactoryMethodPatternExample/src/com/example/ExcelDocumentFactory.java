package com.example;

public class ExcelDocumentFactory extends DocumentFactory {

	@Override
	Document createDocument() {
		return new ExcelDocument();
	}

}
