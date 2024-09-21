package ues.sistemaDeRegistros;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    private JLabel idLabel, descriptionLabel, categoryLabel, amountLabel, costLabel, priceLabel, stateLabel;
    private JTextField idTextField, descriptionTextField, categoryTextField, amountTextField, costTextField, priceTextField, stateTextField;
    private JButton saveButton, cancelButton;

    public Formulario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setTitle("Productos");
        setLayout(new BorderLayout(10, 10));

        JPanel leftCentralPanel = new JPanel(new GridLayout(4,2));

        idLabel = new JLabel("ID");
        descriptionLabel = new JLabel("Description");
        categoryLabel = new JLabel("Category");
        amountLabel = new JLabel("Amount");

        idTextField = new JTextField();
        descriptionTextField = new JTextField();
        categoryTextField = new JTextField();
        amountTextField = new JTextField();

        leftCentralPanel.add(idLabel);
        leftCentralPanel.add(idTextField);
        leftCentralPanel.add(descriptionLabel);
        leftCentralPanel.add(descriptionTextField);
        leftCentralPanel.add(categoryLabel);
        leftCentralPanel.add(categoryTextField);
        leftCentralPanel.add(amountLabel);
        leftCentralPanel.add(amountTextField);


        JPanel rightCentralPanel = new JPanel(new GridLayout(4,2));

        costLabel = new JLabel("Cost");
        priceLabel = new JLabel("Price");
        stateLabel = new JLabel("State");

        costTextField = new JTextField();
        priceTextField = new JTextField();
        stateTextField = new JTextField();

        rightCentralPanel.add(costLabel);
        rightCentralPanel.add(costTextField);
        rightCentralPanel.add(priceLabel);
        rightCentralPanel.add(priceTextField);
        rightCentralPanel.add(stateLabel);
        rightCentralPanel.add(stateTextField);


        JPanel centralPanel = new JPanel(new GridLayout(1, 2, 10, 10)); // 3 filas y 2 columnas

        centralPanel.add(leftCentralPanel);
        centralPanel.add(rightCentralPanel);

        add(centralPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");

        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        add(buttonPanel, BorderLayout.SOUTH);

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel titleLabel = new JLabel("Datos del producto");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 12));
        titlePanel.add(titleLabel);

        add(titlePanel, BorderLayout.NORTH);

        setVisible(true);
    }
}
