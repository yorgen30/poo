import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class JFInterfaz extends JFrame implements ActionListener{
private JLabel aceleracion;
private JTextField aceleracion1;
private JTextField aceleracion2;
private JTextField aceleracion3;
private JLabel auto1;
private JLabel auto2;
private JLabel auto3;
private JLabel auto4;
private JButton d1;
private JButton d2;
private JButton d3;
private JButton estadistica;
private JPanel jPanel1;
private JLabel nombre;
private JTextField txtauto1;
private JTextField txtauto2;
private JTextField txtauto3;
private JTextField velocidad1;
private JTextField velocidad2;
private JTextField velocidad3;
private JLabel velocidadInicial;
public void actionPerformed(ActionEvent evt){
    String comando=evt.getActionCommand();
    if(comando.equals("Estadistica")){
        
    }else if(comando.equals("1000m")){
       
    }
    JOptionPane.showMessageDialog(null,comando);
}
JFInterfaz(){
Rapido r=new  Rapido();
jPanel1 = new javax.swing.JPanel();
auto1 = new javax.swing.JLabel();
auto2 = new javax.swing.JLabel();
auto3 = new javax.swing.JLabel();
nombre = new javax.swing.JLabel();
velocidadInicial = new javax.swing.JLabel();
aceleracion = new javax.swing.JLabel();
txtauto1 = new javax.swing.JTextField(Rapido.a1.getNombre());
txtauto2 = new javax.swing.JTextField(Rapido.a2.getNombre());
txtauto3 = new javax.swing.JTextField(Rapido.a3.getNombre());
velocidad1 = new javax.swing.JTextField();
velocidad2 = new javax.swing.JTextField();
velocidad3 = new javax.swing.JTextField();
aceleracion1 = new javax.swing.JTextField(Rapido.a1.getAceleracion());
aceleracion2 = new javax.swing.JTextField(Rapido.a2.getAceleracion());
aceleracion3 = new javax.swing.JTextField(Rapido.a3.getAceleracion());
d1 = new JButton("1000m");
d2 = new JButton("2000m");
d3 = new JButton("3000m");
estadistica = new javax.swing.JButton();
auto4 = new javax.swing.JLabel();

estadistica.addActionListener((this));
txtauto1.setHorizontalAlignment(SwingConstants.CENTER);
txtauto2.setHorizontalAlignment(SwingConstants.CENTER);
txtauto3.setHorizontalAlignment(SwingConstants.CENTER);
velocidad1.setHorizontalAlignment(SwingConstants.CENTER);
velocidad2.setHorizontalAlignment(SwingConstants.CENTER);
velocidad3.setHorizontalAlignment(SwingConstants.CENTER);
aceleracion1.setHorizontalAlignment(SwingConstants.CENTER);
aceleracion2.setHorizontalAlignment(SwingConstants.CENTER);
aceleracion3.setHorizontalAlignment(SwingConstants.CENTER);

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jPanel1.setBackground(new java.awt.Color(255, 255, 255));

auto1.setText("Auto 1:");

auto2.setText("Auto 2:");

auto3.setText("Auto 3:");

nombre.setText("Nombre");

velocidadInicial.setText("velocidad Inicial");

aceleracion.setText("Aceleracion");

velocidad3.setToolTipText("");

estadistica.setText("Estadistica");

auto4.setText("Distancia");

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(96, 96, 96)
.addComponent(nombre)
.addGap(38, 38, 38)
.addComponent(velocidadInicial)
.addGap(21, 21, 21)
.addComponent(aceleracion))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(48, 48, 48)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(auto3)
.addComponent(auto2)
.addComponent(auto1)
.addComponent(auto4))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(28, 28, 28)
.addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(txtauto1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
.addComponent(txtauto2))
.addComponent(txtauto3))
.addGap(24, 24, 24)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(velocidad3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
.addComponent(velocidad2)
.addComponent(velocidad1))))
.addGap(18, 18, 18)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(aceleracion3, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(aceleracion2, javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(aceleracion1))
.addGap(2, 2, 2))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(156, 156, 156)
.addComponent(estadistica)))
.addContainerGap(69, Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(nombre)
.addComponent(velocidadInicial)
.addComponent(aceleracion))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(auto1)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txtauto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(velocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(aceleracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(auto2)
.addComponent(txtauto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(velocidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(aceleracion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(auto3)
.addComponent(txtauto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(velocidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(aceleracion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(d1)
.addComponent(d2)
.addComponent(d3)
.addComponent(auto4))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(estadistica)
.addContainerGap(13, Short.MAX_VALUE))
);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);

pack();
show();
}

}
