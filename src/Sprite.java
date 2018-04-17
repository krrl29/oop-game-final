import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Sprite {
    protected int x, y, width, height;
    boolean visable;
    protected Image image;
    private Random rand;

    public Sprite() {
        this.x = 0;
        this.y = 0;
        this.visable = false;
    }

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract void drawEntity(Graphics g);

    protected void getImageDim() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void LoadImage(String imagePath) {
        ImageIcon ii = new ImageIcon(imagePath);
        image = ii.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(x,y,width,height);
    }

    public boolean isVisable() {
        return visable;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

