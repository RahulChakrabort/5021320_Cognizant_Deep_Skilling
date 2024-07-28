package com.example;

public class Computer {
	private String cpu;
	private int ram;
	private int storage;

	private Computer(Builder b) {
		this.cpu = b.cpu;
		this.ram = b.ram;
		this.storage = b.storage;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}

	public static class Builder {
		private String cpu;
		private int ram;
		private int storage;

		public Builder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}

		public Builder setRam(int ram) {
			this.ram = ram;
			return this;
		}

		public Builder setStorage(int storage) {
			this.storage = storage;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
