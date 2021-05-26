
import javax.swing.JOptionPane;
import java.awt.Color;

public class TicTacToe extends javax.swing.JFrame {

    // for selecting the turn 
    int turn = 2;

    // for button if it is used ones 
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    // wining logic  
    int pone_won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int ptwo_won[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    // 21  possible way  to win for Player one
    int pone_won() {
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1 && pone_won[4] == 1 && pone_won[5] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn6.setForeground(Color.red);

            return 1;
        }
        if (pone_won[3] == 1 && pone_won[4] == 1 && pone_won[5] == 1 && pone_won[2] == 1 && pone_won[8] == 1) {
            btn4.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[1] == 1 && pone_won[2] == 1 && pone_won[4] == 1 && pone_won[7] == 1) {
            btn1.setForeground(Color.red);
            btn2.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn8.setForeground(Color.red);

            return 1;
        }
        if (pone_won[6] == 1 && pone_won[7] == 1 && pone_won[8] == 1 && pone_won[4] == 1 && pone_won[1] == 1) {
            btn2.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[4] == 1 && pone_won[8] == 1 && pone_won[2] == 1 && pone_won[6] == 1) {
            btn1.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn7.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[1] == 1 && pone_won[2] == 1 && pone_won[3] == 1 && pone_won[6] == 1) {
            btn1.setForeground(Color.red);
            btn2.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1 && pone_won[7] == 1 && pone_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[1] == 1 && pone_won[4] == 1 && pone_won[7] == 1 && pone_won[3] == 1 && pone_won[5] == 1) {
            btn2.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn6.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[1] == 1 && pone_won[2] == 1 && pone_won[5] == 1 && pone_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn2.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[6] == 1 && pone_won[7] == 1 && pone_won[8] == 1 && pone_won[5] == 1 && pone_won[2] == 1) {
            btn7.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn9.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn3.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1 && pone_won[4] == 1 && pone_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1 && pone_won[4] == 1 && pone_won[2] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn3.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1 && pone_won[4] == 1 && pone_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[4] == 1 && pone_won[8] == 1 && pone_won[5] == 1 && pone_won[2] == 1) {
            btn1.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn3.setForeground(Color.red);

            return 1;
        }
        if (pone_won[6] == 1 && pone_won[4] == 1 && pone_won[2] == 1 && pone_won[5] == 1 && pone_won[8] == 1) {
            btn7.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn3.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[0] == 1 && pone_won[1] == 1 && pone_won[2] == 1) {

            btn1.setForeground(Color.red);
            btn2.setForeground(Color.red);
            btn3.setForeground(Color.red);

            return 1;
        }
        if (pone_won[3] == 1 && pone_won[4] == 1 && pone_won[5] == 1) {
            btn4.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn6.setForeground(Color.red);

            return 1;
        }
        if (pone_won[6] == 1 && pone_won[7] == 1 && pone_won[8] == 1) {
            btn7.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn9.setForeground(Color.red);
            return 1;
        }
        if (pone_won[0] == 1 && pone_won[3] == 1 && pone_won[6] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);
            return 1;
        }
        if (pone_won[1] == 1 && pone_won[4] == 1 && pone_won[7] == 1) {
            btn2.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn8.setForeground(Color.red);
            return 1;
        }
        if (pone_won[2] == 1 && pone_won[5] == 1 && pone_won[8] == 1) {
            btn3.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (pone_won[2] == 1 && pone_won[4] == 1 && pone_won[6] == 1) {
            btn3.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn7.setForeground(Color.red);
            return 1;
        }
        if (pone_won[0] == 1 && pone_won[4] == 1 && pone_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);
            return 1;

        }
        return 0;
    }

    // Eight possible way  to win for Player two
    int ptwo_won() {
        if (ptwo_won[0] == 1 && ptwo_won[1] == 1 && ptwo_won[2] == 1) {
            btn1.setForeground(Color.red);
            btn2.setForeground(Color.red);
            btn3.setForeground(Color.red);

            return 1;
        }
        if (ptwo_won[3] == 1 && ptwo_won[4] == 1 && ptwo_won[5] == 1) {
            btn4.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn6.setForeground(Color.red);

            return 1;
        }
        if (ptwo_won[6] == 1 && ptwo_won[7] == 1 && ptwo_won[8] == 1) {
            btn7.setForeground(Color.red);
            btn8.setForeground(Color.red);
            btn9.setForeground(Color.red);

            return 1;
        }
        if (ptwo_won[0] == 1 && ptwo_won[3] == 1 && ptwo_won[6] == 1) {
            btn1.setForeground(Color.red);
            btn4.setForeground(Color.red);
            btn7.setForeground(Color.red);

            return 1;
        }
        if (ptwo_won[1] == 1 && ptwo_won[4] == 1 && ptwo_won[7] == 1) {
            btn2.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn8.setForeground(Color.red);
            return 1;
        }
        if (ptwo_won[2] == 1 && ptwo_won[5] == 1 && ptwo_won[8] == 1) {
            btn3.setForeground(Color.red);
            btn6.setForeground(Color.red);
            btn9.setForeground(Color.red);
            return 1;
        }
        if (ptwo_won[2] == 1 && ptwo_won[4] == 1 && ptwo_won[6] == 1) {
            btn3.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn7.setForeground(Color.red);
            return 1;
        }
        if (ptwo_won[0] == 1 && ptwo_won[4] == 1 && ptwo_won[8] == 1) {
            btn1.setForeground(Color.red);
            btn5.setForeground(Color.red);
            btn9.setForeground(Color.red);
            return 1;
        }

        //if the match is Draw
        return 0;
    }

    public TicTacToe() {
        initComponents();
    }

    // winig logic method
    public void wining_result() {

        int result1 = pone_won();
        int result2 = ptwo_won();

        if (result1 == 1) {
            JOptionPane.showMessageDialog(btn1, " Player one Has Won the game :) \n Player two lost the game sorry :(");
        } else if (result2 == 1) {
            JOptionPane.showMessageDialog(btn1, " Player two Has Won the game :) \n Player one lost the game sorry :(");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        title = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        reset1 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");

        title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("TAC");

        reset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reset.setText("Play Again");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        title1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title1.setText("TOE");

        title2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("GAME ");

        title3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title3.setText("TIC ");

        reset1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reset1.setText("Home");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        reset2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reset2.setText("Exit");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(title3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(title)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(title1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(title2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        // cod for first button 
        if (buttonused[0] == 0) {

            //if candition for turn 
            if (turn % 2 == 0) {

                // printing  X for palyer one 
                turn++;
                btn1.setForeground(Color.WHITE);
                btn1.setText("X");
                buttonused[0] = 1;
                pone_won[0] = 1;

                //  wining prt method 
                wining_result();

                // else part for turn
            } else {

                //print O for paler two
                turn++;
                btn1.setText("O");
                buttonused[0] = 1;
                ptwo_won[0] = 1;

                //  wining prt method 
                wining_result();
            }

            // message box if the button used allredy
        } else {
            JOptionPane.showMessageDialog(btn1, " This Button Is Used Allready ! ");
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        // code for second button 
        if (buttonused[1] == 0) {

            //if condition fo turn
            if (turn % 2 == 0) {

                //printing X for palyer one
                turn++;
                btn2.setForeground(Color.WHITE);
                btn2.setText("X");
                buttonused[1] = 1;
                pone_won[1] = 1;

                //  wining prt method 
                wining_result();

                //else part for turn
            } else {

                //printing O for palyer two
                turn++;
                btn2.setText("O");
                buttonused[1] = 1;
                ptwo_won[1] = 1;

                //  wining prt method 
                wining_result();
            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn2, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // cod for Third button 
        if (buttonused[2] == 0) {

            //if condition for turn
            if (turn % 2 == 0) {

                //printing X for palyer one 
                turn++;
                btn3.setForeground(Color.WHITE);
                btn3.setText("X");
                buttonused[2] = 1;
                pone_won[2] = 1;

                //  wining prt method 
                wining_result();

            } //else part for turn
            else {

                //printin O for palyer two
                turn++;
                btn3.setText("O");
                buttonused[2] = 1;
                ptwo_won[2] = 1;

                //  wining part method 
                wining_result();

            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn3, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //cod for 4th button
        if (buttonused[3] == 0) {

            //if condition for turn
            if (turn % 2 == 0) {
                turn++;
                btn4.setForeground(Color.WHITE);
                btn4.setText("X");
                buttonused[3] = 1;
                pone_won[3] = 1;

                //  wining part method 
                wining_result();

            } // else part for turn
            else {

                //printing O for secand player
                turn++;
                btn4.setText("O");
                buttonused[3] = 1;
                ptwo_won[3] = 1;

                //  wining part method 
                wining_result();
            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn4, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // cod for 5th button 
        if (buttonused[4] == 0) {

            //if condition for turn
            if (turn % 2 == 0) {
                turn++;
                btn5.setForeground(Color.WHITE);
                btn5.setText("X");
                buttonused[4] = 1;
                pone_won[4] = 1;

                //  wining part method 
                wining_result();

            }//else part for turn 
            else {

                // printing O for second player
                turn++;
                btn5.setText("O");
                buttonused[4] = 1;
                ptwo_won[4] = 1;

                //  wining part method 
                wining_result();
            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn5, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // code for 6th button
        if (buttonused[5] == 0) {

            //if condition for turn
            if (turn % 2 == 0) {
                turn++;
                btn6.setForeground(Color.WHITE);
                btn6.setText("X");
                buttonused[5] = 1;
                pone_won[5] = 1;

                //  wining part method 
                wining_result();

            } //else part for turn
            else {
                turn++;
                btn6.setText("O");
                buttonused[5] = 1;
                ptwo_won[5] = 1;

                //  wining part method 
                wining_result();
            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn6, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // code for 7th button
        if (buttonused[6] == 0) {
            
            //if condition for turn
            if (turn % 2 == 0) {
                turn++;
                btn7.setForeground(Color.WHITE);
                btn7.setText("X");
                buttonused[6] = 1;
                pone_won[6] = 1;
                
                //  wining part method 
                wining_result();
               
            }//else part for turn
            else {
                turn++;
                btn7.setText("O");
                buttonused[6] = 1;
                ptwo_won[6] = 1;

            //  wining part method 
                wining_result();
            }
        } // message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn7, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // code for 8 button
        if (buttonused[7] == 0) {
            
            //if condition for turn
            if (turn % 2 == 0) {
                turn++;
                btn8.setForeground(Color.WHITE);
                btn8.setText("X");
                buttonused[7] = 1;
                pone_won[7] = 1;
                
                //  wining part method 
                wining_result();
                
            } //else psrt for turn
            else {
                turn++;
                btn8.setText("O");
                buttonused[7] = 1;
                ptwo_won[7] = 1;

            //  wining part method 
                wining_result();
            }
        }// message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn8, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // code for 9th button
        if (buttonused[8] == 0) {
            
            //if cundition for turn
            if (turn % 2 == 0) {
                turn++;
                btn9.setForeground(Color.WHITE);
                btn9.setText("X");
                buttonused[8] = 1;
                pone_won[8] = 1;

               //  wining part method 
                wining_result();
                
            } else {
                turn++;
                btn9.setText("O");
                buttonused[8] = 1;
                ptwo_won[8] = 1;

             //  wining part method 
                wining_result();
            }
        }// message box if the button used allredy
        else {
            JOptionPane.showMessageDialog(btn9, " This Button Is Used Allready ! ");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // reset button
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        btn1.setForeground(Color.black);
        btn2.setForeground(Color.black);
        btn3.setForeground(Color.black);
        btn4.setForeground(Color.black);
        btn5.setForeground(Color.black);
        btn6.setForeground(Color.black);
        btn7.setForeground(Color.black);
        btn8.setForeground(Color.black);
        btn9.setForeground(Color.black);

        //for reset the turn
        turn = 2;
        
        //reset the buttonused array
        for (int i = 0; i < 9; i++) {
            buttonused[i] = 0;
        }
         //reset the  pone_won array
        for (int i = 0; i < 9; i++) {
            pone_won[i] = 0;
        }
         //reset the  ptwo_won array
        for (int i = 0; i < 9; i++) {
            ptwo_won[i] = 0;
        }

    }//GEN-LAST:event_resetActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        //home button
        new firstpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reset1ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        //Exit button
        this.setVisible(false);
    }//GEN-LAST:event_reset2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    // End of variables declaration//GEN-END:variables
}
