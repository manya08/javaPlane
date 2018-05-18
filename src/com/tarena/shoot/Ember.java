package com.tarena.shoot;

import java.awt.image.BufferedImage;

public class Ember {
    private int index;
    private int i;
    private int intevel = 40;
    private int x, y;
    private BufferedImage[] images;
    private BufferedImage image;

    public Ember(FlyingObject fly) {
        this.images = fly.ember;
        this.image = images[0];
        this.x = fly.x;
        this.y = fly.y;
    }

    public boolean burnDown() {
        i++;
        if (i % intevel == 0) {
            if (index == images.length) {
                return true;
            }
            image = images[index++];
        }
        return false;
    }

    public BufferedImage[] getImages() {
        return images;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

