package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordValidatorForm {
    public JPanel panelMain;
    private JTextField txtPassword;
    private JTextField txtPassword2;
    private JButton btvalidate;

    public PasswordValidatorForm() {
        btvalidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var password1 = txtPassword.getText();
                var password2 = txtPassword2.getText();

                var result = PasswordValidator.validate(password1, password2);

                var passwordValidator1 = new PasswordValidator2(password1, password2, false);
                var result2 =  passwordValidator1.validate();

                var passwordValidator2 = new PasswordValidator2(password1, password2, true);
                var result3 = passwordValidator2.validate();



                //passwordValidator1.validate()

                JOptionPane.showMessageDialog(null, result.isEmpty() ? "Good password": result);



            }
        });
    }
}
