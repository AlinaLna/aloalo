package model.gui;

import java.awt.Color;
import javax.swing.JPanel;

public class Panel {
    private JPanel panel = new JPanel();

    public Panel(int index_x, int index_y, int width, int height) {
        panel.setBounds(index_x, index_y, width, height);
    }

    public Panel(int index_x, int index_y, int width, int height, int color_r, int color_g, int color_b) {
        panel.setBounds(index_x, index_y, width, height);
        panel.setBackground(new Color(color_r,color_g,color_b));
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
   
}
