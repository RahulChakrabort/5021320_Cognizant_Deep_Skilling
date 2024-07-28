package com.example;

public class ProxyImage implements Image {

	private RealImage realImage;

	@Override
	public void display(String imageUrl) {
		if (realImage == null)
			realImage = new RealImage();
		realImage.display(imageUrl);
	}

}
