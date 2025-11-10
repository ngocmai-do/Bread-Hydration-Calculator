import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class UI {
    int toggler = 0;
    int secondToggler = 0;

    public class FirstWindow extends JFrame implements ActionListener {
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
                toggler = 1;
                new SecondWindow();
            }
        }
    }


    public class SecondWindow extends JFrame implements ActionListener {
        private JPanel secondWindowPanel = new JPanel(new GridLayout(6,1));
        private JLabel secondQuestion = new JLabel("What do you want to calculate today?");
        private JButton flour = new JButton("Flour");
        private JButton water = new JButton ("Water");
        private JButton hydration = new JButton("Hydration");
        private JButton starter = new JButton ("Starter");
        private JButton goBack = new JButton("Go Back");

        public SecondWindow () {
            secondWindowPanel.add(secondQuestion);
            secondWindowPanel.add(flour);
            secondWindowPanel.add(water);
            secondWindowPanel.add(hydration);

            if (toggler == 1) {
                secondWindowPanel.add(starter);
                starter.addActionListener(this);
            }
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
                toggler = 0;
                new FirstWindow();
            } else if (e.getSource() == flour) {
                dispose();
                secondToggler = 1;
                new ThirdWindow();
            } else if (e.getSource() == water) {
                dispose();
                secondToggler = 2;
                new ThirdWindow();
            } else if (e.getSource() == hydration) {
                dispose();
                secondToggler = 3;
                new ThirdWindow();
            } else if (e.getSource() == starter) {
                dispose();
                secondToggler = 4;
                new ThirdWindow();
            }
        }
    }

    public class ThirdWindow extends JFrame implements ActionListener {
        private JPanel thirdWindowPanel = new JPanel();
        private JPanel northPanel = new JPanel(new GridLayout(4,2));
        private JPanel centerPanel = new JPanel();
        private JPanel southPanel = new JPanel(new GridLayout(2,1));

        private JLabel mU = new JLabel("Measure Unit: ");
        private String [] measureArray = {"gram","dl"};
        private JComboBox<String> measureUnit = new JComboBox<>(measureArray);
        private JLabel flour = new JLabel("Flour: ");
        private JLabel water = new JLabel("Water: ");
        private JLabel hydration = new JLabel("Hydration: ");
        private JLabel starter = new JLabel("Starter: ");
        private JTextField tfFlour = new JTextField(10);
        private JTextField tfWater = new JTextField(10);
        private JTextField tfHydration = new JTextField(10);
        private JTextField tfStarter = new JTextField(10);

        private JButton calculateButton = new JButton("Calculate");
        private JLabel resLabel = new JLabel("");
        private JButton goBack = new JButton("Go Back");

        public ThirdWindow () {

            measureUnit.setSelectedIndex(-1);
            measureUnit.setEditable(true);
            measureUnit.addActionListener(this);
            northPanel.add(mU);
            northPanel.add(measureUnit);

            if (secondToggler == 1) {
                northPanel.add(hydration);
                northPanel.add(tfHydration);
                northPanel.add(water);
                northPanel.add(tfWater);
                if (toggler == 1) {
                    northPanel.add(starter);
                    northPanel.add(tfStarter);
                }
            }

            if (secondToggler == 2) {
                northPanel.add(hydration);
                northPanel.add(tfHydration);
                northPanel.add(flour);
                northPanel.add(tfFlour);
                if (toggler == 1) {
                    northPanel.add(starter);
                    northPanel.add(tfStarter);
                }
            }

            if (secondToggler == 3) {
                northPanel.add(water);
                northPanel.add(tfWater);
                northPanel.add(flour);
                northPanel.add(tfFlour);
                if (toggler == 1) {
                    northPanel.add(starter);
                    northPanel.add(tfStarter);
                }
            }

            if (secondToggler == 4) {
                northPanel.add(hydration);
                northPanel.add(tfHydration);
                northPanel.add(flour);
                northPanel.add(tfFlour);
                northPanel.add(water);
                northPanel.add(tfWater);
            }

            centerPanel.add(calculateButton);
            calculateButton.addActionListener(this);

            southPanel.add(resLabel);
            southPanel.add(goBack);
            goBack.addActionListener(this);

            add(thirdWindowPanel);
            add(northPanel, BorderLayout.NORTH);
            add(centerPanel, BorderLayout.CENTER);
            add(southPanel, BorderLayout.SOUTH);

            setTitle("Hydration Calculator");
            setSize(300, 300);
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == goBack) {
                dispose();
                toggler = 0;
                new FirstWindow();
            }
        }
    }

}
