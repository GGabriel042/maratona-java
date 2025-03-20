package Exercicios.OOPInterface05.dominio;

public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public void resizeHeight(int newHeight) {
        this.height = newHeight;
    }

    public void showSize() {
        System.out.println("The width is "+ width+ " and the height is "+ height);
    }
}
