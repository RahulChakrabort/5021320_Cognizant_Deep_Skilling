package com.example;

public class WordDocumentFactory extends DocumentFactory {

	@Override
	Document createDocument() {
		return new WordDocument();
	}

}
