import java.awt.BorderLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import java.awt.event.*;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class Festa {

public static void main(String[] args) {

JFrame janela = new JFrame("Festa Java");

janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

janela.setSize(250, 100);

JLabel etiqueta = new JLabel("A festa do Java vai começar");

janela.add(etiqueta, BorderLayout.NORTH);

JButton botao = new JButton("Clique aqui para iniciar a festa");

botao.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent ae) {

JOptionPane.showMessageDialog(null, "A festa já começou");

}

});

janela.add( botao, BorderLayout.SOUTH);

janela.setLocationRelativeTo(null);

janela.setVisible(true);

}

}
