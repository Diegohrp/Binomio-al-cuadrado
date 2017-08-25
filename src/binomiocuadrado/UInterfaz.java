/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomiocuadrado;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hernandez Velazquez Angel y Herrera Prado Diego
 */
public class UInterfaz extends JFrame implements ActionListener {

    private JFrame ventana;
    private Container contenedor;
    private JTextField equis, numero, resu;
    private JButton calcu, help, exit;
    private JLabel Hola, X, N;

    public UInterfaz() {
        crearVentana();
        CrearComponentes();
        this.ventana.setVisible(true);
    }

    //Se inicia la ventana donde se vera todo
    public void crearVentana() {
        ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setTitle("Binomio Cuadrado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        //Crear contenedor
        contenedor = ventana.getContentPane();
        contenedor.setBackground(Color.cyan);
    }

    //SE CREA EL CONTENIDO DE LA VENTANA
    public void CrearComponentes() {
        //Crear botones
        calcu = new JButton("CALCULA EL BINOMIO");
        calcu.setBounds(150, 300, 200, 20);
        calcu.setBackground(Color.BLACK);
        calcu.setForeground(Color.WHITE);
        calcu.setFont(new Font("Tahoma", 1, 10));
        contenedor.add(calcu);
        calcu.addActionListener(this);
        calcu.setVisible(true);

        help = new JButton("?");
        help.setBounds(440, 10, 50, 20);
        help.setBackground(Color.BLACK);
        help.setForeground(Color.WHITE);
        help.setFont(new Font("Arial", 1, 10));
        contenedor.add(help);
        help.addActionListener(this);
        help.setVisible(true);

        exit = new JButton("Exit");
        exit.setBounds(10, 10, 50, 20);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Arial", 1, 8));
        contenedor.add(exit);
        exit.addActionListener(this);
        exit.setVisible(true);

        //Crear JTEXTFIELD
        numero = new JTextField();
        numero.setBounds(300, 150, 100, 100);
        numero.setFont(new Font("Arial", 1, 30));
        contenedor.add(numero);
        numero.setVisible(true);

        equis = new JTextField();
        equis.setBounds(100, 150, 100, 100);
        equis.setFont(new Font("Arial", 1, 30));
        contenedor.add(equis);
        equis.setVisible(true);

        resu = new JTextField();
        resu.setBounds(150, 400, 200, 20);
        resu.setFont(new Font("Arial", 1, 10));
        resu.setHorizontalAlignment(JTextField.CENTER);
        resu.setEditable(false);
        contenedor.add(resu);
        resu.setVisible(true);

        //Crear JLabel
        Hola = new JLabel("BIENVENIDO A  Binomy Excelent 3.0");
        Hola.setBounds(70, 50, 400, 20);
        Hola.setFont(new Font("Arial", 1, 20));
        contenedor.add(Hola);
        Hola.setVisible(true);

        X = new JLabel("X   +");
        X.setBounds(210, 160, 400, 100);
        X.setFont(new Font("Arial", 1, 20));
        contenedor.add(X);
        X.setVisible(true);

        N = new JLabel("N");
        N.setBounds(410, 160, 400, 100);
        N.setFont(new Font("Arial", 1, 20));
        contenedor.add(N);
        N.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Se valida la introduccion de numeros
        try {
            if (e.getSource() == calcu) {
                Operacion o = new Operacion();
                o.signo(Integer.parseInt(equis.getText()), Integer.parseInt(numero.getText()));
                resu.setText(o.resul(Integer.parseInt(equis.getText()), Integer.parseInt(numero.getText())));
            }
        } catch (Exception el) {
            JOptionPane.showMessageDialog(this,"Introduce algo válido");
            equis.setText("");
            numero.setText("");
        }
        //Contenido de la ayuda
        if (e.getSource() == help) {
            JOptionPane.showMessageDialog(null, "<html>Un binomio cuadrado resulta de multiplicar el <br> primer termino por si mismo, mas el doble del <br> primero por el segundo, mas el segundo multiplicado <br> por si mismo. <br> En el primero cuadro ingrese el primer termino, que sera el que <br> incluya X², y en el segundo cuandro la variable numerocia que complementa <br> el binomio</html> ", " AYUDA", HEIGHT);
        } else {
            //Mnsaje boton salida
            if (e.getSource() == exit) {
                JOptionPane.showMessageDialog(null, "Gracias por su preferencia :v");
                System.exit(0);
            }

        }

    }
}

    