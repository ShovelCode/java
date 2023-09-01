interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class ShapeDrawer {
    void draw(Shape shape) {
        shape.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.draw(new Circle());
        drawer.draw(new Rectangle());
    }
}
