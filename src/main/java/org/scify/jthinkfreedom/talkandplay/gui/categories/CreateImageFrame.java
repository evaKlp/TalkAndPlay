package org.scify.jthinkfreedom.talkandplay.gui.categories;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.scify.jthinkfreedom.talkandplay.gui.helpers.GuiHelper;
import org.scify.jthinkfreedom.talkandplay.models.Category;
import org.scify.jthinkfreedom.talkandplay.models.Tile;
import org.scify.jthinkfreedom.talkandplay.models.User;
import org.scify.jthinkfreedom.talkandplay.services.TileService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author christina
 */
public class CreateImageFrame extends javax.swing.JFrame {

    private UpdateCategoryFrame parent;
    private Category category;
    private String imagePath;
    private String soundPath;
    private GuiHelper guiHelper;
    private TileService tileService;
    private User user;

    /**
     * Creates new form CreateCategoryFrame
     */
    public CreateImageFrame() {
        initComponents();
    }

    public CreateImageFrame(UpdateCategoryFrame parent, User user, Category category) {
        this.parent = parent;
        this.guiHelper = new GuiHelper();
        this.user = user;
        this.tileService = new TileService();
        this.category = category;
        this.imagePath = "";
        this.soundPath = "";
        initComponents();
        initCustomComponents();
        setTitle("Δημιουργία Καρτέλας - Talk&Play");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        defaultPhotoLabel = new javax.swing.JLabel();
        uploadImageButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        uploadSoundButton = new javax.swing.JButton();
        categoryNameExplLabel = new javax.swing.JLabel();
        categoryNameLabel = new javax.swing.JLabel();
        soundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talk&Play");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        defaultPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/no-photo.png"))); // NOI18N

        uploadImageButton.setBackground(new java.awt.Color(255, 255, 255));
        uploadImageButton.setForeground(new java.awt.Color(51, 51, 51));
        uploadImageButton.setText("Ανεβάστε εικόνα");
        uploadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setForeground(new java.awt.Color(51, 51, 51));
        saveButton.setText("Αποθήκευση");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Όνομα εικόνας:");

        nameTextField.setMinimumSize(new java.awt.Dimension(100, 23));

        errorLabel.setBackground(new java.awt.Color(153, 0, 0));
        errorLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorLabel.setText("Παρακαλώ συμπληρώστε σωστά όλα τα πεδία");

        uploadSoundButton.setBackground(new java.awt.Color(255, 255, 255));
        uploadSoundButton.setForeground(new java.awt.Color(51, 51, 51));
        uploadSoundButton.setText("Ανεβάστε ήχο");
        uploadSoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSoundButtonActionPerformed(evt);
            }
        });

        categoryNameExplLabel.setText("Προσθήκη καρτέλας στην κατηγορία");

        categoryNameLabel.setText("jLabel2");

        soundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/scify/jthinkfreedom/talkandplay/resources/sound_20x20.png"))); // NOI18N
        soundLabel.setPreferredSize(new java.awt.Dimension(32, 29));
        soundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(defaultPhotoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameLabel)
                                            .addComponent(categoryNameLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(categoryNameExplLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(errorLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(uploadSoundButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uploadImageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(defaultPhotoLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(categoryNameExplLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categoryNameLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadImageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadSoundButton)
                    .addComponent(saveButton)
                    .addComponent(soundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String name = nameTextField.getText();

        if (name.isEmpty() || imagePath.isEmpty() || soundPath.isEmpty()) {
            errorLabel.setVisible(true);
        } else {
            errorLabel.setVisible(false);
            Tile tile = new Tile(name, imagePath, soundPath, category);

            try {
                tileService.save(tile, user);
                // parent.drawCategories(categoryService.getCategories(user.getName()));
            } catch (Exception ex) {
                Logger.getLogger(CreateImageFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void uploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonActionPerformed
        imagePath = "";
        JFileChooser chooser = new JFileChooser();

        chooser.setDialogTitle("Διαλέξτε εικόνα");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg", "JPG", "JPEG", "gif"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            imagePath = chooser.getSelectedFile().getAbsolutePath();
            defaultPhotoLabel.setIcon(guiHelper.getIcon(imagePath));
        }
    }//GEN-LAST:event_uploadImageButtonActionPerformed

    private void uploadSoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadSoundButtonActionPerformed
        soundPath = "";
        JFileChooser chooser = new JFileChooser();

        chooser.setDialogTitle("Διαλέξτε ήχο");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new FileNameExtensionFilter("Sound Files", "mp3", "wma", "wav", "ra", "ram", "rm", "mid"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            soundPath = chooser.getSelectedFile().getAbsolutePath();
            soundLabel.setVisible(true);
        }
    }//GEN-LAST:event_uploadSoundButtonActionPerformed

    private void soundLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundLabelMouseClicked
        //play sound
    }//GEN-LAST:event_soundLabelMouseClicked

    private void initCustomComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        categoryNameLabel.setText(category.getName());
        errorLabel.setVisible(false);
        soundLabel.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryNameExplLabel;
    private javax.swing.JLabel categoryNameLabel;
    private javax.swing.JLabel defaultPhotoLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel soundLabel;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JButton uploadSoundButton;
    // End of variables declaration//GEN-END:variables
}
