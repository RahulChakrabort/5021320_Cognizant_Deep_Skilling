package com.example;

public class ProxyTest {

	public static void main(String[] args) {
		Image i = new ProxyImage();
		i.display("https://www.pngwing.com/en/free-png-ifyun");

		Image i2 = new ProxyImage();
		i2.display("https://www.urldecoder.io/java/");
	}

}
