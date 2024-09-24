package com.kumar.proxy;

import java.net.URL;

public class ImageProxy implements Icon {
    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private Thread retrievalThread;

    public ImageProxy(ImageIcon imageIcon, URL imageURL) {
        this.imageIcon = imageIcon;
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon() {

    }
}
