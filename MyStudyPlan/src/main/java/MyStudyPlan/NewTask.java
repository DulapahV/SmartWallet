package MyStudyPlan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class NewTask extends javax.swing.JFrame {

    /**
     * Creates new form NewTask
     */
    public NewTask() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SubjectTxt = new javax.swing.JLabel();
        SubjectComboBox = new javax.swing.JComboBox<>();
        SubjectAddBtn = new javax.swing.JButton();
        TypeTxt = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        DueDateTxt = new javax.swing.JLabel();
        DueDateDatePicker = new org.jdesktop.swingx.JXDatePicker();
        TitleTxt = new javax.swing.JLabel();
        TitleTxtField = new javax.swing.JTextField();
        DetailTxt = new javax.swing.JLabel();
        DetailScrollPane = new javax.swing.JScrollPane();
        DetailTxtArea = new javax.swing.JTextArea();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Task");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);

        TopBanner.setBackground(new java.awt.Color(59, 162, 191));

        jLabel1.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        jLabel1.setText("New Task");

        javax.swing.GroupLayout TopBannerLayout = new javax.swing.GroupLayout(TopBanner);
        TopBanner.setLayout(TopBannerLayout);
        TopBannerLayout.setHorizontalGroup(
            TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBannerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopBannerLayout.setVerticalGroup(
            TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBannerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        SubjectTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        SubjectTxt.setText("Subject");

        SubjectComboBox.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        SubjectAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubjectAddBtn.setText("+");
        SubjectAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectAddBtnActionPerformed(evt);
            }
        });

        TypeTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        TypeTxt.setText("Type");

        TypeComboBox.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assignment", "Reminder", "Revision" }));

        DueDateTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DueDateTxt.setText("Due Date");

        DueDateDatePicker.setDate(new java.util.Date());
        DueDateDatePicker.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DueDateDatePicker.setFormats("dd/MM/yyyy");

        TitleTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        TitleTxt.setText("Title");

        TitleTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        DetailTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DetailTxt.setText("Detail");

        DetailTxtArea.setColumns(20);
        DetailTxtArea.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DetailTxtArea.setRows(5);
        DetailScrollPane.setViewportView(DetailTxtArea);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DetailTxt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TitleTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetailScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeTxt)
                                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DueDateTxt)
                                        .addGap(197, 197, 197))
                                    .addComponent(DueDateDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitleTxt)
                                    .addComponent(SubjectTxt))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectAddBtn)))
                        .addGap(38, 38, 38))))
            .addComponent(TopBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubjectTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectAddBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TypeTxt)
                    .addComponent(DueDateTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DueDateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TitleTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DetailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CancelBtn)
                    .addComponent(SaveBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        for (Subject subj : Database.getSubjList()) {
            SubjectComboBox.addItem(subj.getCode() + " " + subj.getName());
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectAddBtnActionPerformed
        ManageSubjects manageSubjects = new ManageSubjects();
        manageSubjects.setVisible(true);
        manageSubjects.setLocationRelativeTo(this);
        this.setEnabled(false);
        manageSubjects.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                NewTask.this.setEnabled(true);
                NewTask.this.requestFocus();
                NewTask.this.setExtendedState(NewTask.this.getExtendedState() & ~NewTask.ICONIFIED);
            }
        });
    }//GEN-LAST:event_SubjectAddBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        boolean flag = false;
        if (getTitle().isEmpty()) {
            TitleTxtField.setBorder(BorderFactory.createLineBorder(Color.red));
            TitleTxtField.setPreferredSize(new Dimension(TitleTxtField.getWidth(), TitleTxtField.getHeight() + 1));
            flag = true;
        }
        if (flag) {
            Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.WARNING, "Missing or incorrect information!");
            return;
        }
        Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.INFO, "Successfully created new task.");
        Database.addTask(getTaskInstance());
        this.dispose();
    }//GEN-LAST:event_SaveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JScrollPane DetailScrollPane;
    private javax.swing.JLabel DetailTxt;
    private javax.swing.JTextArea DetailTxtArea;
    private org.jdesktop.swingx.JXDatePicker DueDateDatePicker;
    private javax.swing.JLabel DueDateTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SubjectAddBtn;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel SubjectTxt;
    private javax.swing.JLabel TitleTxt;
    private javax.swing.JTextField TitleTxtField;
    private javax.swing.JPanel TopBanner;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel TypeTxt;
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
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName)).deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return String
     */
    public String getDetail() {
        return DetailTxtArea.getText();
    }

    /**
     * @return LocalDate
     */
    public LocalDate getDueDate() {
        try {
            return DueDateDatePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @return Subject
     */
    public Subject getSubject() {
        return Database.getSubjList().get(SubjectComboBox.getSelectedIndex());
    }

    /**
     * @return String
     */
    public String getTitle() {
        return TitleTxtField.getText();
    }

    /**
     * @return TaskType
     */
    public TaskType getTaskType() {
        return TaskType.values()[TypeComboBox.getSelectedIndex()];
    }

    /**
     * @return TaskInstance
     */
    public TaskInstance getTaskInstance() {
        try {
            return new TaskInstance(getSubject(), getTitle(), getTaskType(), getDueDate(), getDetail());
        } catch (Exception e) {
            return null;
        }
    }
}
