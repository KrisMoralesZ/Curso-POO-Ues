package ues.sistemaDeRegistros;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    private JLabel idLabel, descriptionLabel, categoryLabel, amountLabel, costLabel, priceLabel, stateLabel;
    private JTextField idTextField, descriptionTextField, categoryTextField, amountTextField, costTextField, priceTextField, stateTextField;
    private JButton saveButton, cancelButton;

    public Formulario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Productos");

        JPanel panel = new JPanel(new FlowLayout());

        idLabel = new JLabel("ID");
        descriptionLabel = new JLabel("Description");
        categoryLabel = new JLabel("Category");
        amountLabel = new JLabel("Amount");
        costLabel = new JLabel("Cost");
        priceLabel = new JLabel("Price");
        stateLabel = new JLabel("State");

        idTextField = new JTextField(10);
        descriptionTextField = new JTextField(10);
        categoryTextField = new JTextField(10);
        amountTextField = new JTextField(10);
        costTextField = new JTextField(10);
        priceTextField = new JTextField(10);
        stateTextField = new JTextField(10);

        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");

        panel.add(idLabel);
        panel.add(idTextField);
        panel.add(descriptionLabel);
        panel.add(descriptionTextField);
        panel.add(categoryLabel);
        panel.add(categoryTextField);
        panel.add(amountLabel);
        panel.add(amountTextField);
        panel.add(costLabel);
        panel.add(costTextField);
        panel.add(priceLabel);
        panel.add(priceTextField);
        panel.add(stateLabel);
        panel.add(stateTextField);
        panel.add(saveButton);
        panel.add(cancelButton);

        add(panel);

        setVisible(true);
    }
}

