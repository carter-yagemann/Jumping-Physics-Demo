/*
 * Copyright (c) 2014 Carter Yagemann
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.yagemann.physicsdemo;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.KeyboardFocusManager;
import java.awt.KeyEventDispatcher;

/**
 *
 * @author Carter Yagemann
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new CustomKeyEventDispatcher());
        
        XWorkerThread xWorkerThread = new XWorkerThread();
        xWorkerThread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        velocityField = new javax.swing.JTextField();
        accelerationField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        dispositionLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myCanvas1 = new org.yagemann.physicsdemo.MyCanvas();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Physics Demo");
        setResizable(false);

        velocityField.setText("750");
        velocityField.setEnabled(false);
        velocityField.setName(""); // NOI18N

        accelerationField.setText("-1");
        accelerationField.setEnabled(false);

        startButton.setText("Jump");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        dispositionLabel.setText("0");

        jLabel2.setText("Starting Velocity");

        jLabel3.setText("Acceleration");

        javax.swing.GroupLayout myCanvas1Layout = new javax.swing.GroupLayout(myCanvas1);
        myCanvas1.setLayout(myCanvas1Layout);
        myCanvas1Layout.setHorizontalGroup(
            myCanvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        myCanvas1Layout.setVerticalGroup(
            myCanvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jButton1.setText("Unlock");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Up - Jump");

        jLabel4.setText("Left & Right - Move");

        jLabel5.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myCanvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dispositionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accelerationField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(velocityField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accelerationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dispositionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(myCanvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        performJump();
    }//GEN-LAST:event_startButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        velocityField.setEnabled(!velocityField.isEnabled());
        accelerationField.setEnabled(!accelerationField.isEnabled());
        
        if (velocityField.isEnabled()) {
            jButton1.setText("Lock");
        } else {
            jButton1.setText("Unlock");
        }
    }//GEN-LAST:event_jButton1MouseClicked
 
    private void performJump() {
        // Get variables
        long startingVelocity;
        long acceleration;
        
        try {
            startingVelocity = Long.parseLong(velocityField.getText());
            acceleration = Long.parseLong(accelerationField.getText());
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return;
        }
        
        // Validate inputs
        if (startingVelocity <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Velocity must be greater than 0!",
                    "Invalid Argument",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (acceleration >= 0) {
            JOptionPane.showMessageDialog(null,
                    "Acceleration must be negative!",
                    "Invalid Argument",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Disable start button
        startButton.setEnabled(false);
        startButton.invalidate();
        
        // Start worker thread
        WorkerThread thread = new WorkerThread("calculation thread", 
                startingVelocity, acceleration);
        thread.start();
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accelerationField;
    private javax.swing.JLabel dispositionLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.yagemann.physicsdemo.MyCanvas myCanvas1;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField velocityField;
    // End of variables declaration//GEN-END:variables

    private boolean jumping = false;
    // Thread for doing the calculations
    class WorkerThread extends Thread {
        
        private final long STARTING_VELOCITY, ACCELERATION;
        
        public WorkerThread(String str, long v, long a) {
            super(str);
            STARTING_VELOCITY = v;
            ACCELERATION = a;
        }
        
        @Override
        public void run() {
            if (!jumping) {
                jumping = true;
                
                Physics physics = new Physics();
                physics.startCalculation(0, STARTING_VELOCITY, ACCELERATION);

                long position = 0;

                while (position >= 0) {
                    position = physics.getCurrentDisposition() / 1000;
                    dispositionLabel.setText(Long.toString(position));
                    dispositionLabel.invalidate();
                    myCanvas1.setY((int) position);
                }

                // Clean-up
                myCanvas1.setY(0);
                dispositionLabel.setText("0");
                dispositionLabel.invalidate();
                startButton.setEnabled(true);
                startButton.invalidate();
                
                jumping = false;
            }
        }
    }
    
    class XWorkerThread extends Thread {
        
        @Override
        public void run() {
            
            final int targetFramerate = 200;
            
            long FPS_TIME = System.currentTimeMillis();
            long FPS;
            int frameLockTime = 0;
            
            while (true) {
                if (movement == -1) {
                    myCanvas1.moveLeft();
                }
                if (movement == 1) {
                    myCanvas1.moveRight();
                }
                
                // Calculate framerate
                FPS = Math.round(1.0 / (System.currentTimeMillis() - FPS_TIME) * 1000);
                jLabel5.setText(FPS + " FPS");
                FPS_TIME = System.currentTimeMillis();
                
                // Adjust framerate lock
                if (FPS != targetFramerate) {
                    if (FPS > targetFramerate) {
                        frameLockTime++;
                    } else {
                        if (frameLockTime > 0)
                            frameLockTime--;
                    }
                }
                
                try {
                    sleep(frameLockTime);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
    
    private int movement = 0;
    
    // Custome key handler class
    class CustomKeyEventDispatcher implements KeyEventDispatcher {
        
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            
            // Key pressed handler
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        performJump();
                        break;
                    case KeyEvent.VK_LEFT:
                        movement = -1;
                        break;
                    case KeyEvent.VK_RIGHT:
                        movement = 1;
                        break;
                }
            }
            
            // Key release handler
            if (e.getID() == KeyEvent.KEY_RELEASED) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        movement = 0;
                        break;
                    case KeyEvent.VK_RIGHT:
                        movement = 0;
                        break;
                }
            }
            
            return false;
        }
    }
    
}
