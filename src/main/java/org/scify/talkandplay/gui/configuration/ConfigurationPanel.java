package org.scify.talkandplay.gui.configuration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.scify.talkandplay.gui.MainFrame;
import org.scify.talkandplay.gui.MainPanel;
import org.scify.talkandplay.models.User;
import org.scify.talkandplay.services.CategoryService;
import org.scify.talkandplay.services.UserService;

public class ConfigurationPanel extends javax.swing.JPanel {

    private MainFrame parent;
    private User user;
    private InfoPanel infoPanel;
    private TabsPanel tabsPanel;
    private JPanel infoWrapperPanel;
    private GridBagConstraints gbc;
    private CategoryService categoryService;
    private UserService userService;

    public ConfigurationPanel(String userName, MainFrame parent) {
        this.parent = parent;
        this.categoryService = new CategoryService();
        this.userService = new UserService();
        this.user = userService.getUser(userName);

        initComponents();
        initCustomComponents();
    }

    private void initCustomComponents() {
        parent.setPanelTitle("Προτιμήσεις χρήστη");
        gbc = new GridBagConstraints();
        contentPanel.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        infoPanel = new InfoPanel(this, user);
        infoWrapperPanel = new JPanel();
        infoWrapperPanel.add(infoPanel);
        infoWrapperPanel.setBackground(Color.white);
        contentPanel.add(infoWrapperPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 2;
        tabsPanel = new TabsPanel(user, this);
        contentPanel.add(tabsPanel, gbc);
    }

    public void addPanel(JPanel panel) {
        infoWrapperPanel.removeAll();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 1;
        infoWrapperPanel.add(panel, gbc);
        revalidate();
        repaint();
    }

    public void redrawCategoriesList() {
        tabsPanel.redrawCategoriesList();
    }

    public void goBack() {
        parent.changePanel(new MainPanel(parent));
    }

    public void showInfoPanel() {
        infoWrapperPanel.removeAll();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 1;
        infoWrapperPanel.add(infoPanel, gbc);
        revalidate();
        repaint();
    }

    public void hideInfoPanel() {
        infoWrapperPanel.removeAll();
        JPanel emptyPanel = new JPanel();
        emptyPanel.setPreferredSize(new Dimension(460, infoWrapperPanel.getHeight()));
        emptyPanel.setMinimumSize(new Dimension(460, infoWrapperPanel.getHeight()));
        emptyPanel.setBackground(Color.white);
        infoWrapperPanel.add(emptyPanel);
        revalidate();
        repaint();
    }

    public void displayMessage(String msg) {
        JOptionPane.showMessageDialog(parent,
                msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    // End of variables declaration//GEN-END:variables
}
