package MyStudyPlan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class ManageSubjects extends javax.swing.JFrame {

    private DefaultTableModel table;

    /**
     * Creates new form NewTask
     */
    public ManageSubjects() {
        initComponents();

        table = (DefaultTableModel) SubjectsTable.getModel();
        for (Subject subj : Database.getSubjList()) {
            table.addRow(new Object[]{subj.getCode(), subj.getName(), subj.getColorHex()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CodeTxt = new javax.swing.JLabel();
        CodeTxtField = new javax.swing.JTextField();
        SubjectTxt = new javax.swing.JLabel();
        SubjectTxtField = new javax.swing.JTextField();
        ColorTxt = new javax.swing.JLabel();
        ColorTxtField = new javax.swing.JTextField();
        ColorPickerBtn = new javax.swing.JButton();
        SubjectAddBtn = new javax.swing.JButton();
        SubjectRemoveBtn = new javax.swing.JButton();
        SearchPanel = new org.jdesktop.swingx.JXSearchPanel();
        SearchBtn = new javax.swing.JButton();
        SubjectsScrollPane = new javax.swing.JScrollPane();
        SubjectsTable = new javax.swing.JTable();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Subjects");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);

        TopBanner.setBackground(new java.awt.Color(59, 162, 191));

        jLabel1.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        jLabel1.setText("Manage Subjects");

        javax.swing.GroupLayout TopBannerLayout = new javax.swing.GroupLayout(TopBanner);
        TopBanner.setLayout(TopBannerLayout);
        TopBannerLayout.setHorizontalGroup(
                TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopBannerLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        TopBannerLayout.setVerticalGroup(
                TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBannerLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)));

        CodeTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        CodeTxt.setText("Code");

        CodeTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        SubjectTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        SubjectTxt.setText("Subject");

        SubjectTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        ColorTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        ColorTxt.setText("Color");

        ColorTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ColorTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ColorTxtFieldFocusLost(evt);
            }
        });
        ColorTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ColorTxtFieldKeyPressed(evt);
            }
        });

        ColorPickerBtn.setBackground(new java.awt.Color(255, 0, 51));
        ColorPickerBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ColorPickerBtn.setText(" ");
        ColorPickerBtn.setToolTipText("");
        ColorPickerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ColorPickerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorPickerBtnActionPerformed(evt);
            }
        });

        SubjectAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubjectAddBtn.setText("+");
        SubjectAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectAddBtnActionPerformed(evt);
            }
        });

        SubjectRemoveBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubjectRemoveBtn.setText("‒");
        SubjectRemoveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectRemoveBtnActionPerformed(evt);
            }
        });

        SearchPanel.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchBtn.setBackground(new java.awt.Color(86, 96, 118));
        SearchBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        SearchBtn.setText("Search");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        SubjectsTable.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        SubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Code", "Subjects", "Color"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        SubjectsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubjectsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        SubjectsTable.setShowGrid(false);
        SubjectsTable.setShowVerticalLines(true);
        SubjectsTable.getTableHeader().setReorderingAllowed(false);
        SubjectsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectsTableMouseClicked(evt);
            }
        });
        SubjectsScrollPane.setViewportView(SubjectsTable);
        if (SubjectsTable.getColumnModel().getColumnCount() > 0) {
            SubjectsTable.getColumnModel().getColumn(1).setPreferredWidth(450);
        }

        CancelBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        CancelBtn.setText("Cancel");
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(59, 162, 191));
        SaveBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        SaveBtn.setText("Save");
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(86, 96, 118));
        ClearBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        ClearBtn.setText("Clear");
        ClearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopBanner, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addGap(500, 500, 500)
                                                        .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                75, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75,
                                                                Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                .createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SubjectsScrollPane,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(CodeTxt)
                                                                        .addComponent(CodeTxtField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                105,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SubjectTxt)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(SubjectTxtField))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ColorTxt)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(ColorTxtField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        76,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(ColorPickerBtn)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(SubjectAddBtn)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(SubjectRemoveBtn))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SearchPanel,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(SearchBtn)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ClearBtn)
                                                                .addGap(0, 103, Short.MAX_VALUE)))))
                                .addGap(38, 38, 38)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TopBanner, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(CodeTxt)
                                        .addComponent(SubjectTxt)
                                        .addComponent(ColorTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(CodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubjectTxtField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorPickerBtn)
                                        .addComponent(SubjectAddBtn)
                                        .addComponent(SubjectRemoveBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchBtn)
                                        .addComponent(ClearBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SubjectsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(SaveBtn)
                                        .addComponent(CancelBtn))
                                .addGap(18, 18, 18)));

        ColorTxtField.setText(String.format("#%02x%02x%02x", ColorPickerBtn.getBackground().getRed(),
                ColorPickerBtn.getBackground().getGreen(), ColorPickerBtn.getBackground().getBlue()));
        ColorTxtField.setForeground(ColorPickerBtn.getBackground());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchBtnActionPerformed
        Pattern pattern = SearchPanel.getPattern();
        Vector<Integer> row = new Vector<Integer>();
        if (pattern != null) {
            ClearBtnActionPerformed(null);
            for (int i = 0; i < SubjectsTable.getRowCount(); i++) {
                if (!pattern.matcher(SubjectsTable.getValueAt(i, 0).toString()).find()
                        && !pattern.matcher(SubjectsTable.getValueAt(i, 1).toString()).find()
                        && !pattern.matcher(SubjectsTable.getValueAt(i, 2).toString()).find()) {
                    row.add(i);
                }
            }
        }
        for (int i = row.size() - 1; i >= 0; i--) {
            ((DefaultTableModel) SubjectsTable.getModel()).removeRow(row.get(i));
        }
    }// GEN-LAST:event_SearchBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClearBtnActionPerformed
        table = (DefaultTableModel) SubjectsTable.getModel();
        for (int i = table.getRowCount() - 1; i >= 0; i--) {
            table.removeRow(i);
        }
        for (Subject subj : Database.getSubjList()) {
            table.addRow(new Object[]{subj.getCode(), subj.getName(), subj.getColorHex()});
        }
    }// GEN-LAST:event_ClearBtnActionPerformed

    private void SubjectAddBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SubjectAddBtnActionPerformed
        boolean flag = false;
        if (getCode().isEmpty()) {
            CodeTxtField.setBorder(BorderFactory.createLineBorder(Color.red));
            CodeTxtField.setPreferredSize(new Dimension(CodeTxtField.getWidth(), CodeTxtField.getHeight() + 1));
            flag = true;
        }
        if (getSubject().isEmpty()) {
            SubjectTxtField.setBorder(BorderFactory.createLineBorder(Color.red));
            SubjectTxtField
                    .setPreferredSize(new Dimension(SubjectTxtField.getWidth(), SubjectTxtField.getHeight() + 1));
            flag = true;
        }
        if (getColor().isEmpty()) {
            ColorTxtField.setBorder(BorderFactory.createLineBorder(Color.red));
            ColorTxtField.setPreferredSize(new Dimension(ColorTxtField.getWidth(), ColorTxtField.getHeight() + 1));
            flag = true;
        }
        if (flag) {
            Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.WARNING,
                    "Missing or incorrect information!");
            return;
        }
        setSubject();
    }// GEN-LAST:event_SubjectAddBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }// GEN-LAST:event_CancelBtnActionPerformed

    private void SubjectRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SubjectRemoveBtnActionPerformed
        int row = SubjectsTable.getSelectedRow();
        if (SubjectsTable.getSelectedRow() != -1) {
            if (CodeTxtField.getText().equals(getData(row)[0])
                    && SubjectTxtField.getText().equals(getData(row)[1])
                    && ColorTxtField.getText().equals(getData(row)[2])) {
                for (int i = 0; i < Database.getClassList().size(); i++) {
                    if (Database.getClassList().get(i).getSubject().getCode().equals(getData(row)[0])
                            && Database.getClassList().get(i).getSubject().getName().equals(getData(row)[1])
                            && Database.getClassList().get(i).getSubject().getColorHex().equals(getData(row)[2])) {
                        Database.getClassList().remove(i);
                    }
                }
                for (int i = 0; i < Database.getTaskList().size(); i++) {
                    if (Database.getTaskList().get(i).getSubject().getCode().equals(getData(row)[0])
                            && Database.getTaskList().get(i).getSubject().getName().equals(getData(row)[1])
                            && Database.getTaskList().get(i).getSubject().getColorHex().equals(getData(row)[2])) {
                        Database.getTaskList().remove(i);
                    }
                }
                for (int i = 0; i < Database.getExamList().size(); i++) {
                    if (Database.getExamList().get(i).getSubject().getCode().equals(getData(row)[0])
                            && Database.getExamList().get(i).getSubject().getName().equals(getData(row)[1])
                            && Database.getExamList().get(i).getSubject().getColorHex().equals(getData(row)[2])) {
                        Database.getExamList().remove(i);
                    }
                }
                removeSubject();
                CodeTxtField.setText("");
                SubjectTxtField.setText("");
                ColorTxtField.setText("");
            }
        }
    }// GEN-LAST:event_SubjectRemoveBtnActionPerformed

    private void ColorPickerBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ColorPickerBtnActionPerformed
        ColorPicker cp = new ColorPicker();
        cp.setLocationRelativeTo(null);
        cp.setLocation(this.getX() + 44, this.getY() + 180);
        cp.setVisible(true);
        this.setEnabled(false);
        cp.getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.decode("#3BA2BF")));
        cp.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ManageSubjects.this.setEnabled(true);
                ManageSubjects.this.requestFocus();
                ManageSubjects.this
                        .setExtendedState(ManageSubjects.this.getExtendedState() & ~ManageSubjects.ICONIFIED);
                ColorTxtField.setText(cp.getHexValue());
                ColorTxtField.setForeground(new Color(Integer.parseInt(cp.getHexValue().substring(1), 16)));
                ColorPickerBtn.setBackground(new Color(Integer.parseInt(cp.getHexValue().substring(1), 16)));
            }
        });
    }// GEN-LAST:event_ColorPickerBtnActionPerformed

    private void ColorTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_ColorTxtFieldFocusLost
        if (!ColorTxtField.getText().isEmpty()) {
            ColorTxtField.setForeground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
            ColorPickerBtn.setBackground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
        }
    }// GEN-LAST:event_ColorTxtFieldFocusLost

    private void ColorTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_ColorTxtFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !ColorTxtField.getText().isEmpty()) {
            ColorTxtField.setForeground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
            ColorPickerBtn.setBackground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
        }
    }// GEN-LAST:event_ColorTxtFieldKeyPressed

    private void SubjectsTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SubjectsTableMouseClicked
        int row = SubjectsTable.getSelectedRow();
        CodeTxtField.setText(getData(row)[0]);
        SubjectTxtField.setText(getData(row)[1]);
        ColorTxtField.setText(getData(row)[2]);
        ColorTxtField.setForeground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
        ColorPickerBtn.setBackground(new Color(Integer.parseInt(ColorTxtField.getText().substring(1), 16)));
    }// GEN-LAST:event_SubjectsTableMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SaveBtnActionPerformed
        this.dispose();
    }// GEN-LAST:event_SaveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CodeTxt;
    private javax.swing.JTextField CodeTxtField;
    private javax.swing.JButton ColorPickerBtn;
    private javax.swing.JLabel ColorTxt;
    private javax.swing.JTextField ColorTxtField;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private org.jdesktop.swingx.JXSearchPanel SearchPanel;
    private javax.swing.JButton SubjectAddBtn;
    private javax.swing.JButton SubjectRemoveBtn;
    private javax.swing.JLabel SubjectTxt;
    private javax.swing.JTextField SubjectTxtField;
    private javax.swing.JScrollPane SubjectsScrollPane;
    private javax.swing.JTable SubjectsTable;
    private javax.swing.JPanel TopBanner;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @param fontName
     * @param fontStyle
     * @param fontSize
     * @return Font
     */
    private Font getFont(String fontName, int fontStyle, float fontSize) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName))
                    .deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(ManageSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return String
     */
    public String getCode() {
        return CodeTxtField.getText();
    }

    /**
     * @return String
     */
    public String getColor() {
        return ColorTxtField.getText();
    }

    /**
     * @return String
     */
    public String getColorBtn() {
        return String.format("#%02x%02x%02x", ColorPickerBtn.getBackground().getRed(),
                ColorPickerBtn.getBackground().getGreen(), ColorPickerBtn.getBackground().getBlue());
    }

    /**
     * @return Pattern
     */
    public Pattern getSearchPanel() {
        return SearchPanel.getPattern();
    }

    /**
     * @return String
     */
    public String getSubject() {
        return SubjectTxtField.getText();
    }

    /**
     * @param row
     * @return String[]
     */
    public String[] getData(int row) {
        String[] data = new String[table.getColumnCount()];
        for (int i = 0; i < table.getColumnCount(); i++) {
            data[i] = table.getValueAt(row, i).toString();
        }
        return data;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        if (code != null) {
            CodeTxtField.setText(code);
        }
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        if (color != null) {
            ColorTxtField.setText(color);
        }
    }

    /**
     * @param subject
     */
    public void setSubject(String subject) {
        if (subject != null) {
            SubjectTxtField.setText(subject);
        }
    }

    /**
     * @param color
     */
    public void setColorBtn(Color color) {
        if (color != null) {
            ColorPickerBtn.setBackground(color);
        }
    }

    /**
     * @return Subject
     */
    public Subject getSubjectInstance() {
        try {
            return new Subject(getCode(), getSubject(), getColor());
        } catch (Exception e) {
            return null;
        }
    }

    public void setSubject() {
        Subject subject = getSubjectInstance();
        if (Database.addSubject(subject) == true) {
            table.addRow(new Object[]{getCode(), getSubject(), getColor()});
        }
    }

    public void removeSubject() {
        Subject subject = getSubjectInstance();
        if (Database.removeSubject(subject)) {
            table.removeRow(SubjectsTable.getSelectedRow());
        }
    }
}