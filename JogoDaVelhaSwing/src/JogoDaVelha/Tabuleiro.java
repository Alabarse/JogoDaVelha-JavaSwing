package JogoDaVelha;

import java.util.Random;


public class Tabuleiro extends javax.swing.JFrame {
    static int turno = 0;
    static boolean doisJogadores = false;
    
    boolean posicao1 = false;
    boolean posicao2 = false;
    boolean posicao3 = false;
    boolean posicao4 = false;
    boolean posicao5 = false;
    boolean posicao6 = false;
    boolean posicao7 = false;
    boolean posicao8 = false;
    boolean posicao9 = false;
    
    public void vsCPU(){
        Random random = new Random();
        int valorAleatorio = random.nextInt(9) + 0;
        if (valorAleatorio == 1) {
            if (Campo1.getText().equalsIgnoreCase("")) {
                Campo1.setText("O"); 
        }else if (valorAleatorio == 2) {
            if (Campo2.getText().equalsIgnoreCase("")) {
                Campo2.setText("O"); 
        }else if (valorAleatorio == 3) {
            if (Campo3.getText().equalsIgnoreCase("")) {
                Campo3.setText("O"); 
        }else if (valorAleatorio == 4) {
            if (Campo4.getText().equalsIgnoreCase("")) {
                Campo4.setText("O"); 
        }else if (valorAleatorio == 5) {
            if (Campo5.getText().equalsIgnoreCase("")) {
                Campo5.setText("O"); 
        }else if (valorAleatorio == 6) {
            if (Campo6.getText().equalsIgnoreCase("")) {
                Campo6.setText("O"); 
        }else if (valorAleatorio == 7) {
            if (Campo7.getText().equalsIgnoreCase("")) {
                Campo7.setText("O"); 
        }else if (valorAleatorio == 8) {
            if (Campo8.getText().equalsIgnoreCase("")) {
                Campo8.setText("O"); 
        }else if (valorAleatorio == 9) {
            if (Campo9.getText().equalsIgnoreCase("")) {
                Campo9.setText("O"); 
                                           }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }   
            }
        }
    }
    
public static void quemGanhou() {
    
    // Jogador X vencedor
    if (Campo1.getText().equalsIgnoreCase("X") && Campo2.getText().equalsIgnoreCase("X") && Campo3.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo4.getText().equalsIgnoreCase("X") && Campo5.getText().equalsIgnoreCase("X") && Campo6.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo7.getText().equalsIgnoreCase("X") && Campo8.getText().equalsIgnoreCase("X") && Campo9.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo1.getText().equalsIgnoreCase("X") && Campo4.getText().equalsIgnoreCase("X") && Campo7.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo2.getText().equalsIgnoreCase("X") && Campo5.getText().equalsIgnoreCase("X") && Campo8.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo3.getText().equalsIgnoreCase("X") && Campo6.getText().equalsIgnoreCase("X") && Campo9.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if (Campo1.getText().equalsIgnoreCase("X") && Campo5.getText().equalsIgnoreCase("X") && Campo9.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if (Campo7.getText().equalsIgnoreCase("X") && Campo5.getText().equalsIgnoreCase("X") && Campo3.getText().equalsIgnoreCase("X")) {
        lblGanhador.setText("  Jogador1 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }
    
    // Jogador "O" Vencedor
        if (Campo1.getText().equalsIgnoreCase("O") && Campo2.getText().equalsIgnoreCase("O") && Campo3.getText().equalsIgnoreCase("O")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo4.getText().equalsIgnoreCase("O") && Campo5.getText().equalsIgnoreCase("O") && Campo6.getText().equalsIgnoreCase("O")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo7.getText().equalsIgnoreCase("O") && Campo8.getText().equalsIgnoreCase("O") && Campo9.getText().equalsIgnoreCase("O")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo1.getText().equalsIgnoreCase("O") && Campo4.getText().equalsIgnoreCase("O") && Campo7.getText().equalsIgnoreCase("O")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo2.getText().equalsIgnoreCase("o") && Campo5.getText().equalsIgnoreCase("o") && Campo8.getText().equalsIgnoreCase("o")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if  (Campo3.getText().equalsIgnoreCase("o") && Campo6.getText().equalsIgnoreCase("o") && Campo9.getText().equalsIgnoreCase("o")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if (Campo1.getText().equalsIgnoreCase("o") && Campo5.getText().equalsIgnoreCase("o") && Campo9.getText().equalsIgnoreCase("o")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }else if (Campo7.getText().equalsIgnoreCase("o") && Campo5.getText().equalsIgnoreCase("o") && Campo3.getText().equalsIgnoreCase("O")) {
        lblGanhador.setText("  Jogador2 Vencedor!!  ");
        Campo1.setVisible(false);
        Campo2.setVisible(false);
        Campo3.setVisible(false);
        Campo4.setVisible(false);
        Campo5.setVisible(false);
        Campo6.setVisible(false);
        Campo7.setVisible(false);
        Campo8.setVisible(false);
        Campo9.setVisible(false);
    }
    
    
}

public void vezDeQuem() {
        if (turno == 0) {
            lblVezDeQuem.setText("O");
        }else if (turno == 1) {
            lblVezDeQuem.setText("X");
        }
}
  
    public Tabuleiro() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Campo1 = new javax.swing.JButton();
        Campo9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblVezDeQuem = new javax.swing.JLabel();
        Campo4 = new javax.swing.JButton();
        Campo7 = new javax.swing.JButton();
        Campo2 = new javax.swing.JButton();
        Campo5 = new javax.swing.JButton();
        Campo8 = new javax.swing.JButton();
        Campo3 = new javax.swing.JButton();
        Campo6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblGanhador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ModoDeJogo = new javax.swing.JMenu();
        DoisJogadores = new javax.swing.JMenuItem();
        vsCPU = new javax.swing.JMenuItem();
        Opcoes = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");

        Campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo1ActionPerformed(evt);
            }
        });

        Campo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setText("Jogando: ");

        lblVezDeQuem.setText("X");

        Campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo4ActionPerformed(evt);
            }
        });

        Campo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo7ActionPerformed(evt);
            }
        });

        Campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo2ActionPerformed(evt);
            }
        });

        Campo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo5ActionPerformed(evt);
            }
        });

        Campo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo8ActionPerformed(evt);
            }
        });

        Campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo3ActionPerformed(evt);
            }
        });

        Campo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo6ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator1.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator2.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator3.setForeground(new java.awt.Color(1, 1, 1));

        jSeparator4.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator4.setForeground(new java.awt.Color(1, 1, 1));

        lblGanhador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenu1.setText("Novo Jogo");

        ModoDeJogo.setText("Modo de Jogo");

        DoisJogadores.setText("2 X 2");
        DoisJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoisJogadoresActionPerformed(evt);
            }
        });
        ModoDeJogo.add(DoisJogadores);

        vsCPU.setText("Vs CPU");
        ModoDeJogo.add(vsCPU);

        jMenu1.add(ModoDeJogo);

        jMenuBar1.add(jMenu1);

        Opcoes.setText("Opções");

        Exit.setText("Sair");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Opcoes.add(Exit);

        jMenuBar1.add(Opcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVezDeQuem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblGanhador, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(Campo9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(Campo6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(Campo7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(Campo8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVezDeQuem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(112, 112, 112)
                .addComponent(lblGanhador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(Campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(Campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(Campo9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(Campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(Campo6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Campo7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(Campo8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo1ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo1.setText("X");
            posicao1 = true;
            turno = 1;
                if (posicao1 == true) {
                    Campo1.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo1.setText("O");
            posicao1 = true;
            turno = 0;
                if (posicao1 == true) {
                    Campo1.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo1ActionPerformed

    private void Campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo4ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo4.setText("X");
            posicao4 = true;
            turno = 1;
                if (posicao4 == true) {
                    Campo4.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo4.setText("O");
            posicao4 = true;
            turno = 0;
                if (posicao4 == true) {
                    Campo4.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo4ActionPerformed

    private void Campo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo7ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo7.setText("X");
            posicao7 = true;
            turno = 1;
                if (posicao7 == true) {
                    Campo7.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo7.setText("O");
            posicao7 = true;
            turno = 0;
                if (posicao7 == true) {
                    Campo7.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo7ActionPerformed

    private void Campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo2ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo2.setText("X");
            posicao2 = true;
            turno = 1;
                if (posicao2 == true) {
                    Campo2.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo2.setText("O");
            posicao2 = true;
            turno = 0;
                if (posicao2 == true) {
                    Campo2.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo2ActionPerformed

    private void Campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo3ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo3.setText("X");
            posicao3 = true;
            turno = 1;
                if (posicao3 == true) {
                    Campo3.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo3.setText("O");
            posicao3 = true;
            turno = 0;
                if (posicao3 == true) {
                    Campo3.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo3ActionPerformed

    private void Campo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo5ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo5.setText("X");
            posicao5 = true;
            turno = 1;
                if (posicao5 == true) {
                    Campo5.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo5.setText("O");
            posicao5 = true;
            turno = 0;
                if (posicao5 == true) {
                    Campo5.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo5ActionPerformed

    private void Campo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo6ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo6.setText("X");
            posicao6 = true;
            turno = 1;
                if (posicao6 == true) {
                    Campo6.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo6.setText("O");
            posicao6 = true;
            turno = 0;
                if (posicao6 == true) {
                    Campo6.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo6ActionPerformed

    private void Campo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo8ActionPerformed
        vezDeQuem();
        if (turno == 0) {
            Campo8.setText("X");
            posicao8 = true;
            turno = 1;
                if (posicao8 == true) {
                    Campo8.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo8.setText("O");
            posicao8 = true;
            turno = 0;
                if (posicao8 == true) {
                    Campo8.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo8ActionPerformed

    private void Campo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo9ActionPerformed
      vezDeQuem();
        if (turno == 0) {
            Campo9.setText("X");
            posicao9 = true;
            turno = 1;
                if (posicao9 == true) {
                    Campo9.setEnabled(false);
            }
        }else if (turno == 1) {
            Campo9.setText("O");
            posicao9 = true;
            turno = 0;
                if (posicao9 == true) {
                    Campo9.setEnabled(false);
                }
        }
        quemGanhou();
    }//GEN-LAST:event_Campo9ActionPerformed

    private void DoisJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoisJogadoresActionPerformed
        // Resetando o jogo
        Campo1.setVisible(true);
        Campo2.setVisible(true);
        Campo3.setVisible(true);
        Campo4.setVisible(true);
        Campo5.setVisible(true);
        Campo6.setVisible(true);
        Campo7.setVisible(true);
        Campo8.setVisible(true);
        Campo9.setVisible(true);
        Campo1.setEnabled(true);
        Campo2.setEnabled(true);
        Campo3.setEnabled(true);
        Campo4.setEnabled(true);
        Campo5.setEnabled(true);
        Campo6.setEnabled(true);
        Campo7.setEnabled(true);
        Campo8.setEnabled(true);
        Campo9.setEnabled(true);
        Campo1.setText("");
        Campo2.setText("");
        Campo3.setText("");
        Campo4.setText("");
        Campo5.setText("");
        Campo6.setText("");
        Campo7.setText("");
        Campo8.setText("");
        Campo9.setText("");
        
        doisJogadores = true;
    }//GEN-LAST:event_DoisJogadoresActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    }//GEN-LAST:event_ExitActionPerformed

   
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Campo1;
    private static javax.swing.JButton Campo2;
    private static javax.swing.JButton Campo3;
    private static javax.swing.JButton Campo4;
    private static javax.swing.JButton Campo5;
    private static javax.swing.JButton Campo6;
    private static javax.swing.JButton Campo7;
    private static javax.swing.JButton Campo8;
    private static javax.swing.JButton Campo9;
    private javax.swing.JMenuItem DoisJogadores;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu ModoDeJogo;
    private javax.swing.JMenu Opcoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private static javax.swing.JLabel lblGanhador;
    private javax.swing.JLabel lblVezDeQuem;
    private javax.swing.JMenuItem vsCPU;
    // End of variables declaration//GEN-END:variables
}
