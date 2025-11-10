import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    public static class FirstWindow extends JFrame implements ActionListener {
        private JPanel firstWindowPanel = new JPanel(new GridLayout(3,1));
        private JLabel whichBreadQuestion = new JLabel("What do you want to make today?");
        private JButton normalBreadButton = new JButton("Normal yeast bread");
        private JButton sourdoughBreadButton = new JButton("Sourdough bread");


        public FirstWindow () {

            normalBreadButton.addActionListener(this);
            sourdoughBreadButton.addActionListener(this);
            firstWindowPanel.add(whichBreadQuestion);
            firstWindowPanel.add(normalBreadButton);
            firstWindowPanel.add(sourdoughBreadButton);

            add(firstWindowPanel);
            setTitle("Hydration Calculator");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == normalBreadButton) {
                dispose();
                new SecondWindow();
            }
            if(e.getSource() == sourdoughBreadButton) {
                dispose();
                new ThirdWindow();
            }
        }
    }


    public static class SecondWindow extends JFrame implements ActionListener {
        private JPanel secondWindowPanel = new JPanel(new GridLayout(5,1));
        private JButton flour = new JButton("Flour");
        private JButton water = new JButton ("Water");
        private JButton hydration = new JButton("Hydration");
        private JLabel secondQuestion = new JLabel("What do you want to calculate today?");
        private JButton goBack = new JButton("Go Back");

        public SecondWindow () {
            secondWindowPanel.add(secondQuestion);
            secondWindowPanel.add(flour);
            secondWindowPanel.add(water);
            secondWindowPanel.add(hydration);
            secondWindowPanel.add(goBack);

            flour.addActionListener(this);
            water.addActionListener(this);
            hydration.addActionListener(this);
            goBack.addActionListener(this);

            add(secondWindowPanel);
            setTitle("Hydration Calculator");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == goBack) {
                dispose();
                new FirstWindow();
            }
        }
    }

    public static class ThirdWindow extends JFrame implements ActionListener {
        private JPanel thirdWindowPanel = new JPanel(new GridLayout(6,1));
        private JLabel secondQuestion = new JLabel("What do you want to calculate today?");
        private JButton flour = new JButton("Flour");
        private JButton water = new JButton ("Water");
        private JButton starter = new JButton ("Starter");
        private JButton hydration = new JButton("Hydration: ");
        private JButton goBack = new JButton("Go Back");

        public ThirdWindow () {
            thirdWindowPanel.add(secondQuestion);
            thirdWindowPanel.add(flour);
            thirdWindowPanel.add(water);
            thirdWindowPanel.add(starter);
            thirdWindowPanel.add(hydration);
            thirdWindowPanel.add(goBack);

            flour.addActionListener(this);
            water.addActionListener(this);
            starter.addActionListener(this);
            hydration.addActionListener(this);
            goBack.addActionListener(this);

            add(thirdWindowPanel);
            setTitle("Hydration Calculator");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == goBack) {
                dispose();
                new FirstWindow();
            }
        }
    }

    public static class FourthWindow extends JFrame implements ActionListener {
        private JPanel fourthWindowPanel = new JPanel(new GridLayout(7,2));
        private String [] measureArray = {"gram","dl"};
        private JComboBox<String> measureUnit = new JComboBox<>(measureArray);
        private JLabel mU = new JLabel("Measure Unit: ");


        public FourthWindow () {

            measureUnit.setSelectedIndex(-1);
            measureUnit.setEditable(true);
            measureUnit.addActionListener(this);
            fourthWindowPanel.add(mU);
            fourthWindowPanel.add(measureUnit);

            add(fourthWindowPanel);
            setTitle("Hydration Calculator");
            setSize(300, 200);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
