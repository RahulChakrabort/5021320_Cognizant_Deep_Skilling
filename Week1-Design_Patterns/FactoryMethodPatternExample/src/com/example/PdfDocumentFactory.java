package com.example;

public class PdfDocumentFactory extends DocumentFactory {

	@Override
	Document createDocument() {
		return new PdfDocument();
	}

}
