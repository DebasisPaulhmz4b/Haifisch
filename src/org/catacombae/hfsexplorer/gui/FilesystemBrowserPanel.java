/*-
 * Copyright (C) 2006-2008 Erik Larsson
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * FilesystemBrowserPanel.java
 *
 * Created on den 24 oktober 2006, 15:31
 */

package org.catacombae.hfsexplorer.gui;
import javax.swing.*;

/**
 *
 * @author  Erik
 */
public class FilesystemBrowserPanel extends javax.swing.JPanel {
    private static final ImageIcon FORWARD_ICON = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/forward.png"));
    private static final ImageIcon EXTRACT_ICON = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/extract.png"));
    private static final ImageIcon BACK_ICON = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/back.png"));
    private static final ImageIcon UP_ICON = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/folderup.png"));
    private static final ImageIcon INFO_ICON = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/info.png"));
    /*
    private static final ImageIcon FORWARD_ICON;
    private static final ImageIcon EXTRACT_ICON;
    private static final ImageIcon BACK_ICON;
    private static final ImageIcon UP_ICON;
    private static final ImageIcon INFO_ICON;
        

    static {
        ImageIcon forwardIcon = null, extractIcon = null, backIcon = null, upIcon = null, infoIcon = null;
        try {
            
            forwardIcon = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/forward.png"));
            extractIcon = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/extract.png"));
            backIcon = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/back.png"));
            upIcon = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/folderup.png"));
            infoIcon = new javax.swing.ImageIcon(ClassLoader.getSystemResource("res/info.png"));
        } catch(Exception e) {
            e.printStackTrace();
        }
        FORWARD_ICON = forwardIcon;
        EXTRACT_ICON = extractIcon;
        BACK_ICON = backIcon;
        UP_ICON = upIcon;
        INFO_ICON = infoIcon;
    }
    */
    
    /** Creates new form FilesystemBrowserPanel */
    public FilesystemBrowserPanel() {
        initComponents();
        fileTableScroller.getViewport().setBackground(fileTable.getBackground()); // To remove the grey area below the actual table
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addressField = new javax.swing.JTextField();
        pathLabel = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        extractButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        boxPanel = new javax.swing.JPanel();
        treeTablePanel = new javax.swing.JPanel();
        treeTableSplit = new javax.swing.JSplitPane();
        dirTreeScroller = new javax.swing.JScrollPane();
        dirTree = new javax.swing.JTree();
        fileTableScroller = new javax.swing.JScrollPane();
        fileTable = new javax.swing.JTable();
        statusLabelPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();

        pathLabel.setText("Path:");

        goButton.setIcon(FORWARD_ICON);
        goButton.setText("Go");

        extractButton.setIcon(EXTRACT_ICON);
        extractButton.setText("Extract");

        upButton.setIcon(UP_ICON);
        upButton.setText("Up");

        infoButton.setIcon(INFO_ICON);
        infoButton.setText("Info");

        boxPanel.setLayout(new java.awt.BorderLayout());

        treeTablePanel.setLayout(new java.awt.BorderLayout());

        treeTableSplit.setDividerLocation(200);
        treeTableSplit.setContinuousLayout(true);

        dirTreeScroller.setViewportView(dirTree);

        treeTableSplit.setLeftComponent(dirTreeScroller);

        fileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"yada.txt", "1 KiB", "Textdokument", "2006-06-11 14:34"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Namn", "Storlek", "Typ", "Senast �ndrad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fileTable.setIntercellSpacing(new java.awt.Dimension(4, 0));
        fileTable.setShowHorizontalLines(false);
        fileTable.setShowVerticalLines(false);
        fileTableScroller.setViewportView(fileTable);

        treeTableSplit.setRightComponent(fileTableScroller);

        treeTablePanel.add(treeTableSplit, java.awt.BorderLayout.CENTER);

        boxPanel.add(treeTablePanel, java.awt.BorderLayout.CENTER);

        statusLabelPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText("No file system loaded");
        statusLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        statusLabelPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        boxPanel.add(statusLabelPanel, java.awt.BorderLayout.SOUTH);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(pathLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addressField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(goButton)
                .addContainerGap())
            .add(boxPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(upButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(extractButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoButton)
                .addContainerGap(545, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(upButton)
                    .add(extractButton)
                    .add(infoButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(goButton)
                    .add(pathLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(boxPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressField;
    private javax.swing.JPanel boxPanel;
    public javax.swing.JTree dirTree;
    private javax.swing.JScrollPane dirTreeScroller;
    public javax.swing.JButton extractButton;
    public javax.swing.JTable fileTable;
    public javax.swing.JScrollPane fileTableScroller;
    public javax.swing.JButton goButton;
    public javax.swing.JButton infoButton;
    private javax.swing.JLabel pathLabel;
    public javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusLabelPanel;
    private javax.swing.JPanel treeTablePanel;
    private javax.swing.JSplitPane treeTableSplit;
    public javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables

    /*
    public static void main(String[] args) {
        JFrame jf = new JFrame("Test");
        jf.add(new FilesystemBrowserPanel());
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    */
}
