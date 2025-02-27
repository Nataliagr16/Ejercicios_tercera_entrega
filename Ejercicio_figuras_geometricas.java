package Ejercicios_tercer_corte;

import javax.swing.JOptionPane;
 * @author Natalia Giraldo

public class Ejercicio_figuras_geometricas extends javax.swing.JFrame {
    public Ejercicio_figuras_geometricas() {
        initComponents();
    }

    private void initComponents() {

        titulo = new javax.swing.JLabel();
        circulo = new javax.swing.JLabel();
        radio = new javax.swing.JLabel();
        info_radio = new javax.swing.JTextField();
        info_cuadrado = new javax.swing.JTextField();
        info_base_rect = new javax.swing.JTextField();
        cuadrado = new javax.swing.JLabel();
        lado_cuadrado = new javax.swing.JLabel();
        rectangulo = new javax.swing.JLabel();
        base_rect = new javax.swing.JLabel();
        altura_rect = new javax.swing.JLabel();
        info_lado_rombo = new javax.swing.JTextField();
        lado_rombo = new javax.swing.JLabel();
        info_altura_rect = new javax.swing.JTextField();
        info_basemayor_trap = new javax.swing.JTextField();
        info_altura_trap = new javax.swing.JTextField();
        info_base_triang = new javax.swing.JTextField();
        trapecio = new javax.swing.JLabel();
        basemayor_trap = new javax.swing.JLabel();
        basemenor_trap = new javax.swing.JLabel();
        altura_trap = new javax.swing.JLabel();
        triangulo = new javax.swing.JLabel();
        base_triang = new javax.swing.JLabel();
        altura_triang = new javax.swing.JLabel();
        info_alt_triang = new javax.swing.JTextField();
        rombo = new javax.swing.JLabel();
        calcular_circulo = new javax.swing.JButton();
        calcular_rect = new javax.swing.JButton();
        calcular_trap = new javax.swing.JButton();
        calcular_triang = new javax.swing.JButton();
        calcular_cuadrado = new javax.swing.JButton();
        calcular_rombo = new javax.swing.JButton();
        info_diag_rombo = new javax.swing.JTextField();
        diagonal = new javax.swing.JLabel();
        info_basemenor_trap = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 0, 18));
        titulo.setText("Modelado de figuras geométricas");

        circulo.setFont(new java.awt.Font("Arial", 0, 14));
        circulo.setText("Círculo");

        radio.setFont(new java.awt.Font("Arial", 0, 14));
        radio.setText("Radio:");

        info_radio.setFont(new java.awt.Font("Arial", 0, 14));

        info_cuadrado.setFont(new java.awt.Font("Arial", 0, 14));

        info_base_rect.setFont(new java.awt.Font("Arial", 0, 14));

        cuadrado.setFont(new java.awt.Font("Arial", 0, 14));
        cuadrado.setText("Cuadrado");

        lado_cuadrado.setFont(new java.awt.Font("Arial", 0, 14));
        lado_cuadrado.setText("Lado:");

        rectangulo.setFont(new java.awt.Font("Arial", 0, 14));
        rectangulo.setText("Rectángulo");

        base_rect.setFont(new java.awt.Font("Arial", 0, 14));
        base_rect.setText("Base:");

        altura_rect.setFont(new java.awt.Font("Arial", 0, 14));
        altura_rect.setText("Altura:");

        info_lado_rombo.setFont(new java.awt.Font("Arial", 0, 14));

        lado_rombo.setFont(new java.awt.Font("Arial", 0, 14));
        lado_rombo.setText("Lado:");

        info_altura_rect.setFont(new java.awt.Font("Arial", 0, 14));

        info_basemayor_trap.setFont(new java.awt.Font("Arial", 0, 14));
        info_basemayor_trap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_basemayor_trapActionPerformed(evt);
            }
        });

        info_altura_trap.setFont(new java.awt.Font("Arial", 0, 14));

        info_base_triang.setFont(new java.awt.Font("Arial", 0, 14));

        trapecio.setFont(new java.awt.Font("Arial", 0, 14));
        trapecio.setText("Trapecio");

        basemayor_trap.setFont(new java.awt.Font("Arial", 0, 14));
        basemayor_trap.setText("Base mayor:");

        basemenor_trap.setFont(new java.awt.Font("Arial", 0, 14));
        basemenor_trap.setText("Base menor:");

        altura_trap.setFont(new java.awt.Font("Arial", 0, 14));
        altura_trap.setText("Altura:");

        triangulo.setFont(new java.awt.Font("Arial", 0, 14));
        triangulo.setText("Triángulo");

        base_triang.setFont(new java.awt.Font("Arial", 0, 14));
        base_triang.setText("Base:");

        altura_triang.setFont(new java.awt.Font("Arial", 0, 14));
        altura_triang.setText("Altura:");

        info_alt_triang.setFont(new java.awt.Font("Arial", 0, 14));

        rombo.setFont(new java.awt.Font("Arial", 0, 14));
        rombo.setText("Rombo");

        calcular_circulo.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_circulo.setText("Calcular");
        calcular_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_circuloActionPerformed(evt);
            }
        });

        calcular_rect.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_rect.setText("Calcular");
        calcular_rect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_rectActionPerformed(evt);
            }
        });

        calcular_trap.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_trap.setText("Calcular");
        calcular_trap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_trapActionPerformed(evt);
            }
        });

        calcular_triang.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_triang.setText("Calcular");
        calcular_triang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_triangActionPerformed(evt);
            }
        });

        calcular_cuadrado.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_cuadrado.setText("Calcular");
        calcular_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_cuadradoActionPerformed(evt);
            }
        });

        calcular_rombo.setFont(new java.awt.Font("Arial", 0, 14));
        calcular_rombo.setText("Calcular");
        calcular_rombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_romboActionPerformed(evt);
            }
        });

        info_diag_rombo.setFont(new java.awt.Font("Arial", 0, 14));

        diagonal.setFont(new java.awt.Font("Arial", 0, 14));
        diagonal.setText("Diagonal:");

        info_basemenor_trap.setFont(new java.awt.Font("Arial", 0, 14));
        info_basemenor_trap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_basemenor_trapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(circulo)
                            .addComponent(cuadrado)
                            .addComponent(rectangulo)
                            .addComponent(rombo)
                            .addComponent(trapecio))
                        .addGap(29, 29, 29)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(triangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(info_base_triang, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(basemenor_trap)
                                    .addComponent(altura_trap)
                                    .addComponent(basemayor_trap)
                                    .addComponent(base_triang)
                                    .addComponent(altura_triang)
                                    .addComponent(diagonal)
                                    .addComponent(lado_rombo)
                                    .addComponent(altura_rect)
                                    .addComponent(base_rect)
                                    .addComponent(lado_cuadrado)
                                    .addComponent(radio))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(info_cuadrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(info_base_rect, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(info_altura_rect)
                                    .addComponent(info_lado_rombo)
                                    .addComponent(info_radio)
                                    .addComponent(info_diag_rombo)
                                    .addComponent(info_basemayor_trap, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(info_alt_triang, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(info_altura_trap)
                                    .addComponent(info_basemenor_trap))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcular_circulo)
                            .addComponent(calcular_triang)
                            .addComponent(calcular_trap)
                            .addComponent(calcular_rect)
                            .addComponent(calcular_cuadrado)
                            .addComponent(calcular_rombo))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circulo)
                    .addComponent(info_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio)
                    .addComponent(calcular_circulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(info_cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadrado)
                    .addComponent(lado_cuadrado)
                    .addComponent(calcular_cuadrado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(rectangulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(base_rect)
                            .addComponent(info_base_rect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_altura_rect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(altura_rect)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(calcular_rect)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_lado_rombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lado_rombo)
                            .addComponent(rombo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_diag_rombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diagonal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(calcular_rombo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_basemayor_trap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basemayor_trap)
                            .addComponent(trapecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_basemenor_trap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basemenor_trap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(info_altura_trap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(altura_trap))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(info_base_triang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(base_triang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(info_alt_triang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(altura_triang)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(triangulo)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(calcular_trap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcular_triang)
                        .addGap(48, 48, 48))))
        );

        pack();
    }

    private void info_basemayor_trapActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void calcular_circuloActionPerformed(java.awt.event.ActionEvent evt) {
        double radio = Double.parseDouble(info_radio.getText());
        double a_circ = Math.PI*Math.pow(radio, 2);
        double perim_circ = 2*Math.PI*radio;
        JOptionPane.showMessageDialog(null,"Área del círculo: "+a_circ+"\nPerímetro del círculo: "+perim_circ);
    }

    private void calcular_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {
        double lado_cuad = Double.parseDouble(info_cuadrado.getText());
        double a_cuad = Math.pow(lado_cuad, 2);
        double perim_cuad = 4*lado_cuad;
        JOptionPane.showMessageDialog(null,"Área del cuadrado: "+a_cuad+"\nPerímetro del cuadrado: "+perim_cuad);
    }

    private void calcular_rectActionPerformed(java.awt.event.ActionEvent evt) {
        double b_rect = Double.parseDouble(info_base_rect.getText());
        double a_alt = Double.parseDouble(info_altura_rect.getText());
        double ar_rect = b_rect*a_alt;
        double perim_rect = 2*(b_rect+a_alt);
        JOptionPane.showMessageDialog(null,"Área del rectángulo: "+ar_rect+"\nPerímetro del rectángulo: "+perim_rect);
    }

    private void calcular_romboActionPerformed(java.awt.event.ActionEvent evt) {
        double l_rombo = Double.parseDouble(info_lado_rombo.getText());
        double diag = Double.parseDouble(info_diag_rombo.getText());
        double diag_prin = Math.sqrt((4*Math.pow(l_rombo,2))-Math.pow(diag,2));
        double a_rombo = (diag_prin * diag)/2;
        double perim_rombo = 4*l_rombo;
        JOptionPane.showMessageDialog(null,"Área del rombo: "+a_rombo+"\nPerímetro del rombo: "+perim_rombo);     
    }

    private void info_basemenor_trapActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void calcular_trapActionPerformed(java.awt.event.ActionEvent evt) {
        double b_mayor = Double.parseDouble(info_basemayor_trap.getText());
        double b_menor = Double.parseDouble(info_basemenor_trap.getText());
        double al_trap = Double.parseDouble(info_altura_trap.getText());
        double a_trap = (b_mayor + b_menor) * al_trap/2;
        double perim_trap = b_mayor + b_menor + al_trap + Math.sqrt(Math.pow(al_trap,2)-Math.pow(b_mayor-b_menor,2));
        JOptionPane.showMessageDialog(null,"Área del trapecio: "+a_trap+"\nPerímetro del trapecio: "+perim_trap);        
    }

    private void calcular_triangActionPerformed(java.awt.event.ActionEvent evt) {
        double alt_tria = Double.parseDouble(info_alt_triang.getText());
        double bas_tria = Double.parseDouble(info_base_triang.getText());
        double hipot = Math.sqrt(Math.pow(alt_tria, 2) + Math.pow(bas_tria, 2));
        double a_triang = (alt_tria * bas_tria) / 2;
        double perim_triang = bas_tria+hipot+alt_tria;
        if ((bas_tria == alt_tria) && (bas_tria == hipot) && (alt_tria == hipot)) {
            JOptionPane.showMessageDialog(null,"Área del triángulo: "+a_triang+"\nPerímetro del triángulo: "+perim_triang+"\nEs un triángulo equilátero."); 
        } else if ((bas_tria != alt_tria) && (bas_tria != hipot) && (alt_tria != hipot)) {
            JOptionPane.showMessageDialog(null,"Área del triángulo: "+a_triang+"\nPerímetro del triángulo: "+perim_triang+"\nEs un triángulo escaleno.");
        } else {
            JOptionPane.showMessageDialog(null,"Área del triángulo: "+a_triang+"\nPerímetro del triángulo: "+perim_triang+"\nEs un triángulo isósceles.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_figuras_geometricas().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel altura_rect;
    private javax.swing.JLabel altura_trap;
    private javax.swing.JLabel altura_triang;
    private javax.swing.JLabel base_rect;
    private javax.swing.JLabel base_triang;
    private javax.swing.JLabel basemayor_trap;
    private javax.swing.JLabel basemenor_trap;
    private javax.swing.JButton calcular_circulo;
    private javax.swing.JButton calcular_cuadrado;
    private javax.swing.JButton calcular_rect;
    private javax.swing.JButton calcular_rombo;
    private javax.swing.JButton calcular_trap;
    private javax.swing.JButton calcular_triang;
    private javax.swing.JLabel circulo;
    private javax.swing.JLabel cuadrado;
    private javax.swing.JLabel diagonal;
    private javax.swing.JTextField info_alt_triang;
    private javax.swing.JTextField info_altura_rect;
    private javax.swing.JTextField info_altura_trap;
    private javax.swing.JTextField info_base_rect;
    private javax.swing.JTextField info_base_triang;
    private javax.swing.JTextField info_basemayor_trap;
    private javax.swing.JTextField info_basemenor_trap;
    private javax.swing.JTextField info_cuadrado;
    private javax.swing.JTextField info_diag_rombo;
    private javax.swing.JTextField info_lado_rombo;
    private javax.swing.JTextField info_radio;
    private javax.swing.JLabel lado_cuadrado;
    private javax.swing.JLabel lado_rombo;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel rectangulo;
    private javax.swing.JLabel rombo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel trapecio;
    private javax.swing.JLabel triangulo;
}
