package org.scify.talkandplay.gui.grid;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.scify.talkandplay.models.User;
import uk.co.caprica.vlcj.component.EmbeddedMediaListPlayerComponent;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;

public class EntertainmentPanel_TEST extends javax.swing.JPanel {

    private User user;
    private JFrame parent;
    private JButton pauseButton, skipButton, rewindButton, replayButton;

    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;

    public EntertainmentPanel_TEST(User user, JFrame parent) {
        this.parent = parent;
        this.user = user;
        this.mediaPlayerComponent = new EmbeddedMediaListPlayerComponent();
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectMusicButton = new javax.swing.JButton();
        selectVideoButton = new javax.swing.JButton();
        mediaPanel = new javax.swing.JPanel();

        selectMusicButton.setText("Select music");
        selectMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMusicButtonActionPerformed(evt);
            }
        });

        selectVideoButton.setText("Select video");
        selectVideoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectVideoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mediaPanelLayout = new javax.swing.GroupLayout(mediaPanel);
        mediaPanel.setLayout(mediaPanelLayout);
        mediaPanelLayout.setHorizontalGroup(
            mediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mediaPanelLayout.setVerticalGroup(
            mediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectMusicButton)
                            .addComponent(selectVideoButton))
                        .addGap(0, 284, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectMusicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectVideoButton)
                .addGap(222, 222, 222)
                .addComponent(mediaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMusicButtonActionPerformed
       /* if (user.getEntertainmentModule().getMusicPath() != null && !user.getEntertainmentModule().getMusicPath().isEmpty() && (new File(user.getEntertainmentModule().getMusicPath())).exists()) {
            // userImage = "";
            JFileChooser chooser = new JFileChooser();

            chooser.setDialogTitle("Διαλέξτε μουσική");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(new FileNameExtensionFilter("Sound Files", "mp3", "wav", "aiff"));
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setCurrentDirectory(new File(user.getEntertainmentModule().getMusicPath()));
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                //userImage = chooser.getSelectedFile().getAbsolutePath();
                // imageLabel.setIcon(guiHelper.getIcon(userImage));
                playMusic(chooser.getSelectedFile().getAbsolutePath());
            }
        } else {
            JOptionPane.showMessageDialog(parent,
                    "Ο φάκελος Μουσική δεν έχει οριστεί σωστά.",
                    "Σφάλμα",
                    JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_selectMusicButtonActionPerformed

    private void selectVideoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectVideoButtonActionPerformed
      /*  if (user.getEntertainmentModule().getMusicPath() != null && !user.getEntertainmentModule().getMusicPath().isEmpty() && (new File(user.getEntertainmentModule().getMusicPath())).exists()) {
            // userImage = "";
            JFileChooser chooser = new JFileChooser();

            chooser.setDialogTitle("Διαλέξτε βίντεο");
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(new FileNameExtensionFilter("Video Files", "avi", "mp4"));
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            chooser.setCurrentDirectory(new File(user.getEntertainmentModule().getVideosPath()));
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                //userImage = chooser.getSelectedFile().getAbsolutePath();
                // imageLabel.setIcon(guiHelper.getIcon(userImage));
                playMusic(chooser.getSelectedFile().getAbsolutePath());
            }
        } else {
            JOptionPane.showMessageDialog(parent,
                    "Ο φάκελος Video δεν έχει οριστεί σωστά.",
                    "Σφάλμα",
                    JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_selectVideoButtonActionPerformed

    private void initCustomComponents() {

    }

    private void playMusic(String path) { 
        
        JFrame frame = new JFrame("My First Media Player");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mediaPlayerComponent);
        frame.setVisible(true);
        
       /* mediaPanel.removeAll();
        mediaPanel.setLayout(new BorderLayout());
        mediaPanel.add(mediaPlayerComponent, BorderLayout.CENTER);

        JPanel controlsPane = new JPanel();
        pauseButton = new JButton("Pause");
        controlsPane.add(pauseButton);
        rewindButton = new JButton("Rewind");
        controlsPane.add(rewindButton);
        skipButton = new JButton("Skip");
        controlsPane.add(skipButton);
        replayButton = new JButton("Replay");
        controlsPane.add(replayButton);

        mediaPanel.add(controlsPane, BorderLayout.SOUTH);
        mediaPlayerComponent.getMediaPlayer().setRepeat(true);

        addMediaButtonListeners();
        mediaPanel.revalidate();
        mediaPanel.repaint();*/
        mediaPlayerComponent.getMediaPlayer().playMedia(path);
    }

    private void playVideo(String path) {
        mediaPanel.removeAll();

        mediaPanel.add(mediaPlayerComponent, BorderLayout.CENTER);

        mediaPanel.revalidate();
        mediaPanel.repaint();
        mediaPlayerComponent.getMediaPlayer().playMedia(path);
    }

    private void addMediaButtonListeners() {
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().pause();
            }
        });

        rewindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().skip(-10000);
            }
        });

        skipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.getMediaPlayer().skip(10000);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mediaPanel;
    private javax.swing.JButton selectMusicButton;
    private javax.swing.JButton selectVideoButton;
    // End of variables declaration//GEN-END:variables
}
