
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class StegGui extends javax.swing.JFrame {

    int xSc, ySc;

    String[] imagesPath = {"black1", "black2", "black4", "black5", "black6"};
    int picNum = 0;
    private String stat_path = "";
    private String stat_name = "";
    private BufferedImage img = null;
    private Steganography s = new Steganography();
    private String outputPath;

    public StegGui() {
        initComponents();
        setLocationRelativeTo(null);
        events.setVisible(false);
        encodePanel.setVisible(false);
        decodePanel.setVisible(false);
        encodeImageScrollPane.setVisible(false);

        jPasswordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField2.getText().equals("shealy") && jPasswordField1.getText().equals("shahinasi")) {
                    leftPanel.setVisible(false);
                    rightPanel.setVisible(false);
                    events.setVisible(true);
                    jTextField2.setText("");
                    jPasswordField1.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong username or password!");
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        events = new javax.swing.JPanel();
        decodeBtn = new javax.swing.JButton();
        encodeBtn = new javax.swing.JButton();
        xLabel1 = new javax.swing.JLabel();
        encodePanel = new javax.swing.JPanel();
        encodeNowBtn = new javax.swing.JButton();
        textScrollPane = new javax.swing.JScrollPane();
        hidingText = new javax.swing.JTextArea();
        encodeImageScrollPane = new javax.swing.JScrollPane();
        photoLabel1 = new javax.swing.JLabel();
        decodePanel = new javax.swing.JPanel();
        decodeNowBtn = new javax.swing.JButton();
        decodeImageScrollPane = new javax.swing.JScrollPane();
        photoLabel = new javax.swing.JLabel();
        leftArrow1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        signInBtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        rightPanel = new javax.swing.JPanel();
        xLabel = new javax.swing.JLabel();
        leftArrow = new javax.swing.JLabel();
        rightArrow = new javax.swing.JLabel();
        mainPhotoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(708, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        events.setBackground(new java.awt.Color(0, 0, 0));
        events.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        decodeBtn.setBackground(new java.awt.Color(0, 0, 0));
        decodeBtn.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        decodeBtn.setForeground(new java.awt.Color(204, 204, 204));
        decodeBtn.setText("Decode");
        decodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeBtnActionPerformed(evt);
            }
        });
        events.add(decodeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 220, 30));

        encodeBtn.setBackground(new java.awt.Color(0, 0, 0));
        encodeBtn.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        encodeBtn.setForeground(new java.awt.Color(204, 204, 204));
        encodeBtn.setText("Encode ");
        encodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeBtnActionPerformed(evt);
            }
        });
        events.add(encodeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 220, 30));

        xLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        xLabel1.setToolTipText("");
        xLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xLabel1MouseClicked(evt);
            }
        });
        events.add(xLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        encodePanel.setBackground(new java.awt.Color(0, 0, 0));
        encodePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encodeNowBtn.setBackground(new java.awt.Color(153, 153, 255));
        encodeNowBtn.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        encodeNowBtn.setText("Encode now");
        encodeNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeNowBtnActionPerformed(evt);
            }
        });
        encodePanel.add(encodeNowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 630, 30));

        hidingText.setColumns(20);
        hidingText.setRows(5);
        textScrollPane.setViewportView(hidingText);

        encodePanel.add(textScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 610, 270));

        encodeImageScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        encodeImageScrollPane.setOpaque(false);

        photoLabel1.setBackground(new java.awt.Color(0, 0, 0));
        encodeImageScrollPane.setViewportView(photoLabel1);

        encodePanel.add(encodeImageScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 290));

        events.add(encodePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 630, 320));

        decodePanel.setBackground(new java.awt.Color(0, 0, 0));
        decodePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        decodeNowBtn.setBackground(new java.awt.Color(153, 153, 255));
        decodeNowBtn.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        decodeNowBtn.setText("Decode now");
        decodeNowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decodeNowBtnMouseClicked(evt);
            }
        });
        decodePanel.add(decodeNowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 630, 30));

        decodeImageScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        decodeImageScrollPane.setOpaque(false);

        photoLabel.setBackground(new java.awt.Color(0, 0, 0));
        decodeImageScrollPane.setViewportView(photoLabel);

        decodePanel.add(decodeImageScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 290));

        events.add(decodePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 630, 320));

        leftArrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leftArrow.png"))); // NOI18N
        leftArrow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrow1MouseClicked(evt);
            }
        });
        events.add(leftArrow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(events, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        leftPanel.setBackground(new java.awt.Color(0, 0, 0));
        leftPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                leftPanelMouseDragged(evt);
            }
        });
        leftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leftPanelMousePressed(evt);
            }
        });
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        leftPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 30));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(null);
        leftPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, 30));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Welcome to the black box");
        leftPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 200, 30));

        signInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.png"))); // NOI18N
        signInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInBtnMouseClicked(evt);
            }
        });
        leftPanel.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sign In");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Sign In ");
        leftPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password");
        leftPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 2, 9)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Verify your identity to continue..");
        leftPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untitled.png"))); // NOI18N
        leftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 230, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untitled.png"))); // NOI18N
        leftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Username");
        leftPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, -1));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Remember my password?");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        leftPanel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 230, -1));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 287, 440));

        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        xLabel.setToolTipText("");
        xLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xLabelMouseClicked(evt);
            }
        });
        rightPanel.add(xLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leftArrow.png"))); // NOI18N
        leftArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftArrowMouseClicked(evt);
            }
        });
        rightPanel.add(leftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rightArrow.png"))); // NOI18N
        rightArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightArrowMouseClicked(evt);
            }
        });
        rightPanel.add(rightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        mainPhotoLabel.setBackground(new java.awt.Color(0, 0, 0));
        mainPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black1.jpg"))); // NOI18N
        mainPhotoLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPhotoLabelMouseDragged(evt);
            }
        });
        mainPhotoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPhotoLabelMousePressed(evt);
            }
        });
        rightPanel.add(mainPhotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 450, 440));

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPanelMousePressed
        xSc = evt.getX();
        ySc = evt.getY();
    }//GEN-LAST:event_leftPanelMousePressed

    private void leftPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xSc, y - ySc);
    }//GEN-LAST:event_leftPanelMouseDragged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void signInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInBtnMouseClicked
        if (jTextField2.getText().equals("shealy") && jPasswordField1.getText().equals("shahinasi")) {
            leftPanel.setVisible(false);
            rightPanel.setVisible(false);
            events.setVisible(true);
            if (!jCheckBox1.isSelected()) {
                jTextField2.setText("");
                jPasswordField1.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Wrong username or password!");
        }
    }//GEN-LAST:event_signInBtnMouseClicked

    private void mainPhotoLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPhotoLabelMousePressed
        xSc = evt.getX();
        ySc = evt.getY();
    }//GEN-LAST:event_mainPhotoLabelMousePressed

    private void mainPhotoLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPhotoLabelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
    }//GEN-LAST:event_mainPhotoLabelMouseDragged

    private void rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightArrowMouseClicked
        mainPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(getPic(imagesPath) + ".jpg")));
    }//GEN-LAST:event_rightArrowMouseClicked

    private void leftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrowMouseClicked
        picNum -= 2;
        if (picNum == -1) {
            picNum = imagesPath.length - 2;
        } else if (picNum == -2) {
            picNum = imagesPath.length - 3;
        }
        mainPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(getPic(imagesPath) + ".jpg")));
    }//GEN-LAST:event_leftArrowMouseClicked

    private void xLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xLabelMouseClicked

    private void xLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_xLabel1MouseClicked

    private void encodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeBtnActionPerformed
        encodeBtn.setEnabled(false);
        decodeBtn.setEnabled(true);
        encodePanel.setVisible(true);
        decodePanel.setVisible(false);
        encodeImageScrollPane.setVisible(false);
        textScrollPane.setVisible(true);
    }//GEN-LAST:event_encodeBtnActionPerformed

    private void decodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeBtnActionPerformed
        encodeBtn.setEnabled(true);
        decodeBtn.setEnabled(false);
        decodePanel.setVisible(true);
        encodePanel.setVisible(false);
    }//GEN-LAST:event_decodeBtnActionPerformed

    private void encodeNowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeNowBtnActionPerformed

        JFileChooser chooser = new JFileChooser("./");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setFileFilter(new Image_Filter());
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File directory = chooser.getSelectedFile();
            try {
                String text = hidingText.getText();
                String ext = Image_Filter.getExtension(directory);
                String name = directory.getName();
                String path = directory.getPath();
                path = path.substring(0, path.length() - name.length() - 1);
                name = name.substring(0, name.length() - 4);

                String stegan = JOptionPane.showInputDialog(this,
                        "Enter output file name:", "File name",
                        JOptionPane.PLAIN_MESSAGE);

                if (s.encode(path, name, ext, stegan, text)) {
                    JOptionPane.showMessageDialog(this, "The Image was encoded Successfully!",
                            "Success!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "The Image could not be encoded!",
                            "Error!", JOptionPane.INFORMATION_MESSAGE);
                }
                textScrollPane.setVisible(false);
                encodeImageScrollPane.setVisible(true);
                photoLabel1.setIcon(new ImageIcon(ImageIO.read(new File(path + "/" + stegan + ".png"))));
            } catch (Exception except) {
                JOptionPane.showMessageDialog(this, "The File cannot be opened!",
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_encodeNowBtnActionPerformed

    private void leftArrow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftArrow1MouseClicked
        int response = JOptionPane.showConfirmDialog(this, "Do you want to log out?");
        if (response == 0) {
            events.setVisible(false);
            leftPanel.setVisible(true);
            rightPanel.setVisible(true);
        }
    }//GEN-LAST:event_leftArrow1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked

    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void decodeNowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decodeNowBtnMouseClicked
        JFileChooser chooser = new JFileChooser("./");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setFileFilter(new Image_Filter());
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File directory = chooser.getSelectedFile();
            try {
                String image = directory.getPath();
                stat_name = directory.getName();
                stat_path = directory.getPath();
                stat_path = stat_path.substring(0, stat_path.length() - stat_name.length() - 1);
                stat_name = stat_name.substring(0, stat_name.length() - 4);
                photoLabel.setIcon(new ImageIcon(ImageIO.read(new File(image))));
                JOptionPane.showMessageDialog(this, s.decode(stat_path, stat_name));
            } catch (Exception except) {
                JOptionPane.showMessageDialog(this, "The File cannot be opened!",
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_decodeNowBtnMouseClicked

    private String getPic(String arr[]) {
        picNum++;
        if (picNum == arr.length) {
            picNum = 0;
        }
        return arr[picNum];
    }

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
            java.util.logging.Logger.getLogger(StegGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StegGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StegGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StegGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StegGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decodeBtn;
    private javax.swing.JScrollPane decodeImageScrollPane;
    private javax.swing.JButton decodeNowBtn;
    private javax.swing.JPanel decodePanel;
    private javax.swing.JButton encodeBtn;
    private javax.swing.JScrollPane encodeImageScrollPane;
    private javax.swing.JButton encodeNowBtn;
    private javax.swing.JPanel encodePanel;
    private javax.swing.JPanel events;
    private javax.swing.JTextArea hidingText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel leftArrow;
    private javax.swing.JLabel leftArrow1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel mainPhotoLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel photoLabel1;
    private javax.swing.JLabel rightArrow;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel signInBtn;
    private javax.swing.JScrollPane textScrollPane;
    private javax.swing.JLabel xLabel;
    private javax.swing.JLabel xLabel1;
    // End of variables declaration//GEN-END:variables
}
