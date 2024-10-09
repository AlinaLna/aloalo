package model.gui;

import javax.swing.JFrame;

public class Frame {
    protected JFrame frame = new JFrame();

    public Frame(String title, int height, int width) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle(title);
        frame.setSize(height,width);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
