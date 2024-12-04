package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCircleApp {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        SwingUtilities.invokeLater(ColorCircleFrame::new);
    }
}

// JPanel to handle the circle's color
class CirclePanel extends JPanel {
    private Color circleColor = Color.WHITE;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(circleColor);
        g.fillOval(100, 50, 150, 150);
        g.setColor(Color.BLACK);
        g.drawOval(100, 50, 150, 150);
    }

    public void setCircleColor(Color color) {
        this.circleColor = color;
        repaint();
    }
}

// Main Jframe class
class ColorCircleFrame extends JFrame {
    private final CirclePanel circlePanel;
    private final JComboBox<String> colorDropdown;
    private final JTextField colorOutputField;

    public ColorCircleFrame() {
        setTitle("Color Circle Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Circle Panel
        circlePanel = new CirclePanel();
        circlePanel.setPreferredSize(new Dimension(300, 200));
        add(circlePanel, BorderLayout.CENTER);

        // Control Panel
        JPanel controlPanel = new JPanel(new GridLayout(2, 1));
        colorDropdown = new JComboBox<>(new String[]{"Select Color", "Red", "Blue", "Green"});
        colorOutputField = new JTextField();
        colorOutputField.setEditable(false);

        controlPanel.add(colorDropdown);
        controlPanel.add(colorOutputField);
        add(controlPanel, BorderLayout.SOUTH);

        // Dropdown Action Listener
        colorDropdown.addActionListener(new ColorChangeListener());

        setVisible(true);
    }

    private class ColorChangeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = (String) colorDropdown.getSelectedItem();
            if (selectedColor == null || selectedColor.equals("Select Color")) {
                circlePanel.setCircleColor(Color.WHITE);
                colorOutputField.setText("");
                return;
            }

            Color color;
            switch (selectedColor) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Green":
                    color = Color.GREEN;
                    break;
                default:
                    color = Color.WHITE;
                    break;
            }

            circlePanel.setCircleColor(color);
            colorOutputField.setText("Selected Color: " + selectedColor);
        }
    }
}
