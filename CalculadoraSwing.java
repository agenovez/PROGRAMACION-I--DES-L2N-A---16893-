package com.mycompany.calculadoraswing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. Crear la Interfaz Operacion
interface Operacion {
    double calcular(double a, double b);
}

// 2. Clases que implementan la Interfaz Operacion
class Suma implements Operacion {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

class Resta implements Operacion {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

class Multiplicacion implements Operacion {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}

class Division implements Operacion {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}

// 3. Clase Calculadora
class Calculadora {
    public double ejecutarOperacion(Operacion operacion, double a, double b) {
        return operacion.calcular(a, b);
    }
}

// 4. Interfaz Gráfica con Java Swing
public class CalculadoraSwing extends JFrame {
    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JLabel etiquetaResultado;

    public CalculadoraSwing() {
        // Configuración básica de la ventana
        setTitle("Calculadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Crear componentes
        JLabel etiquetaNumero1 = new JLabel("Número 1:");
        JLabel etiquetaNumero2 = new JLabel("Número 2:");
        campoNumero1 = new JTextField();
        campoNumero2 = new JTextField();
        etiquetaResultado = new JLabel("Resultado: ");
        JButton botonSuma = new JButton("Sumar");
        JButton botonResta = new JButton("Restar");
        JButton botonMultiplicacion = new JButton("Multiplicar");
        JButton botonDivision = new JButton("Dividir");

        // Añadir componentes a la ventana
        add(etiquetaNumero1);
        add(campoNumero1);
        add(etiquetaNumero2);
        add(campoNumero2);
        add(botonSuma);
        add(botonResta);
        add(botonMultiplicacion);
        add(botonDivision);
        add(etiquetaResultado);

        // Crear instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Configurar eventos para los botones
        botonSuma.addActionListener(e -> realizarOperacion(new Suma(), calculadora));
        botonResta.addActionListener(e -> realizarOperacion(new Resta(), calculadora));
        botonMultiplicacion.addActionListener(e -> realizarOperacion(new Multiplicacion(), calculadora));
        botonDivision.addActionListener(e -> realizarOperacion(new Division(), calculadora));
    }

    private void realizarOperacion(Operacion operacion, Calculadora calculadora) {
        try {
            double numero1 = Double.parseDouble(campoNumero1.getText());
            double numero2 = Double.parseDouble(campoNumero2.getText());
            double resultado = calculadora.ejecutarOperacion(operacion, numero1, numero2);
            etiquetaResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            etiquetaResultado.setText("Por favor, ingrese números válidos.");
        } catch (ArithmeticException e) {
            etiquetaResultado.setText("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calculadora = new CalculadoraSwing();
            calculadora.setVisible(true);
        });
    }
}
