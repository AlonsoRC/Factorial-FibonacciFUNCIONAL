/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.fibonacci1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class FactorialFibonacci extends JFrame implements ActionListener{
        
    public JLabel Numero,respuestaFIBO,respuestaFACTO ;           // etiqueta o texto no editable
    public JTextField numero, rFIBO, rFACTO;        // caja de texto, para insertar datos
    public JButton obtener;          // boton con una determinada accion
   public int NumeroRecibido, Factorial;

    public FactorialFibonacci() {
        super();                    // usamos el contructor de la clase padre JFrame
        Ventana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes     
    }
      private void Ventana() {
        this.setTitle("Factorial&Fibonacci");                   // colocamos titulo a la ventana
        this.setSize(300, 300);                                 // colocamos tamaño a la ventana (ancho, alto)
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        Numero = new JLabel();
        respuestaFIBO = new JLabel();
        respuestaFACTO = new JLabel();
        
        numero = new JTextField();
        rFIBO = new JTextField();
        rFACTO = new JTextField();
        obtener = new JButton();
  
        // configuramos los componentes
        Numero.setText("Numero");              // colocamos un texto a la etiqueta
        Numero.setBounds(50, 50, 100, 25);     // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        numero.setBounds(150, 50, 100, 25);    // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        obtener.setText("Obtener");            // colocamos un texto al boton
        obtener.setBounds(50, 100, 200, 30);   // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        respuestaFIBO.setText("Fibonacci");
        respuestaFIBO.setBounds(50, 150, 100, 25);
        rFIBO.setBounds(150, 150, 100, 25);
        respuestaFACTO.setText("Factorial");
        respuestaFACTO.setBounds(50, 180, 100, 25);
        rFACTO.setBounds(150, 180, 100, 25);
        // adicionamos los componentes a la ventana
        this.add(Numero);
        this.add(numero);
        this.add(obtener);
        this.add(respuestaFIBO);
        this.add(rFIBO);
        this.add(respuestaFACTO);
        this.add(rFACTO);
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == obtener){
            int resultado = Integer.parseInt(numero.getText());
            int nums = 0;
            int nums2=1;
        
            String fibona="0 1 ";
            for(int i=0; i<=resultado-2; i++){
                int nums3;
                fibona+=(nums2+nums)+" ";
                nums3=nums;
                nums=nums2;
                nums2=nums3+nums2;                    
            }
            rFIBO.setText(String.valueOf(fibona));  
        }
        if(e.getSource() == obtener){
            NumeroRecibido = Integer.parseInt(numero.getText());
            Factorial = NumeroRecibido;
            for(int i = NumeroRecibido - 1; i >= 1; i--){
                Factorial = Factorial *  i; 
            }
            rFACTO.setText(String.valueOf(Factorial));
        }
    }
   
  
}
