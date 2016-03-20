package com.flatironschool.javacs;

public class HelloWorld {
    private String version;

    public HelloWorld() {
	version = System.getProperty("java.specification.version");
    }

    public double getVersion() {
        return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	HelloWorld main = new HelloWorld();
	System.out.println(main.getVersion());
    }
}
