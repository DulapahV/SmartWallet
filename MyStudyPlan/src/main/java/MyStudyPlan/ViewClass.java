package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class ViewClass extends javax.swing.JFrame {

    /**
     * Creates new form NewTask
     */
    public ViewClass(ClassInstance classInstance) {
        initComponents();

        for (int i = 0; i < SubjectComboBox.getItemCount(); i++) {
            if (SubjectComboBox.getItemAt(i).equals(classInstance.getSubject().getCode() + " " + classInstance.getSubject().getName())) {
                SubjectComboBox.setSelectedIndex(i);
                break;
            }
        }
        SectorTxtField.setText(Integer.toString(classInstance.getSector()));
        RoomTxtField.setText(classInstance.getRoom());
        BuildingTxtField.setText(classInstance.getBuilding());
        DatePicker.setDate(java.util.Date.from(classInstance.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        TeacherTxtField.setText(classInstance.getTeacher());
        HourSpinner.setValue(classInstance.getTime().getHour());
        MinuteSpinner.setValue(classInstance.getTime().getMinute());
        if (classInstance.getTime().getHour() > 12) {
            HourSpinner.setValue(classInstance.getTime().getHour() - 12);
            AMPMComboBox.setSelectedIndex(1);
        } else {
            HourSpinner.setValue(classInstance.getTime().getHour());
            AMPMComboBox.setSelectedIndex(0);
        }
        DurationSpinner.setValue(classInstance.getDuration());
        DetailTxtArea.setText(classInstance.getDescription());
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
        SectorTxt = new javax.swing.JLabel();
        SectorTxtField = new javax.swing.JTextField();
        RoomTxt = new javax.swing.JLabel();
        RoomTxtField = new javax.swing.JTextField();
        BuildingTxt = new javax.swing.JLabel();
        BuildingTxtField = new javax.swing.JTextField();
        TeacherTxt = new javax.swing.JLabel();
        TeacherTxtField = new javax.swing.JTextField();
        DetailTxt = new javax.swing.JLabel();
        DetailScrollPane = new javax.swing.JScrollPane();
        DetailTxtArea = new javax.swing.JTextArea();
        CancelBtn = new javax.swing.JButton();
        DoneBtn = new javax.swing.JButton();
        AMPMComboBox = new javax.swing.JComboBox<>();
        DurationTxt = new javax.swing.JLabel();
        DurationSpinner = new javax.swing.JSpinner();
        DurationInfoTxt = new javax.swing.JLabel();
        TimeTxt = new javax.swing.JLabel();
        HourSpinner = new javax.swing.JSpinner();
        MinuteSpinner = new javax.swing.JSpinner();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();
        DateTxt = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Class");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);

        TopBanner.setBackground(new java.awt.Color(59, 162, 191));

        jLabel1.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        jLabel1.setText("View Class");

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
        SubjectComboBox.setEnabled(false);

        SubjectAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubjectAddBtn.setText("+");
        SubjectAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectAddBtn.setEnabled(false);
        SubjectAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectAddBtnActionPerformed(evt);
            }
        });

        SectorTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        SectorTxt.setText("Sector");

        SectorTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        SectorTxtField.setEnabled(false);
        SectorTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectorTxtFieldActionPerformed(evt);
            }
        });

        RoomTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RoomTxt.setText("Room");

        RoomTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        RoomTxtField.setEnabled(false);
        RoomTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTxtFieldActionPerformed(evt);
            }
        });

        BuildingTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        BuildingTxt.setText("Building");

        BuildingTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        BuildingTxtField.setEnabled(false);
        BuildingTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildingTxtFieldActionPerformed(evt);
            }
        });

        TeacherTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        TeacherTxt.setText("Teacher");

        TeacherTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        TeacherTxtField.setEnabled(false);

        DetailTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DetailTxt.setText("Detail");

        DetailTxtArea.setColumns(20);
        DetailTxtArea.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DetailTxtArea.setRows(5);
        DetailTxtArea.setEnabled(false);
        DetailScrollPane.setViewportView(DetailTxtArea);

        CancelBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        CancelBtn.setText("Cancel");
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        DoneBtn.setBackground(new java.awt.Color(59, 162, 191));
        DoneBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DoneBtn.setText("Mark as done");
        DoneBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneBtnActionPerformed(evt);
            }
        });

        AMPMComboBox.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        AMPMComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        AMPMComboBox.setEnabled(false);
        AMPMComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                AMPMComboBoxPropertyChange(evt);
            }
        });
        AMPMComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDurationInfo();
            }
        });

        DurationTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DurationTxt.setText("Duration");

        DurationSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DurationSpinner.setModel(new javax.swing.SpinnerNumberModel(5, 5, 720, 5));
        DurationSpinner.setEnabled(false);
        DurationSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DurationSpinnerStateChanged(evt);
            }
        });

        DurationInfoTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 16));
        DurationInfoTxt.setText("minutes (ending at unknown)");

        TimeTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        TimeTxt.setText("Time");

        HourSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        HourSpinner.setModel(new javax.swing.SpinnerNumberModel(9, 1, 12, 1));
        HourSpinner.setEnabled(false);
        HourSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HourSpinnerStateChanged(evt);
            }
        });

        MinuteSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        MinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));
        MinuteSpinner.setEnabled(false);
        MinuteSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MinuteSpinnerStateChanged(evt);
            }
        });

        DatePicker.setDate(new java.util.Date());
        DatePicker.setEnabled(false);
        DatePicker.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DatePicker.setFormats("dd/MM/yyyy");
        DatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatePickerActionPerformed(evt);
            }
        });

        DateTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DateTxt.setText("Date");

        DeleteBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DeleteBtn.setText("Delete");
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DetailTxt)
                        .addGap(638, 647, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TimeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DurationTxt)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DurationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DurationInfoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(DetailScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectAddBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DeleteBtn)
                                .addGap(18, 18, 18)
                                .addComponent(CancelBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DoneBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SubjectTxt)
                                            .addComponent(SectorTxt)
                                            .addComponent(SectorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RoomTxt)))
                                    .addComponent(DateTxt)
                                    .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BuildingTxtField)
                                    .addComponent(TeacherTxtField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BuildingTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TeacherTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38))))
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
                    .addComponent(SectorTxt)
                    .addComponent(RoomTxt)
                    .addComponent(BuildingTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SectorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuildingTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DateTxt)
                    .addComponent(TeacherTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeacherTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DurationTxt)
                    .addComponent(TimeTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DurationInfoTxt)
                    .addComponent(DurationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DetailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoneBtn)
                    .addComponent(CancelBtn)
                    .addComponent(DeleteBtn))
                .addContainerGap(16, Short.MAX_VALUE))
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
                ViewClass.this.setEnabled(true);
                ViewClass.this.requestFocus();
                ViewClass.this.setExtendedState(ViewClass.this.getExtendedState() & ~ViewClass.ICONIFIED);
            }
        });
    }//GEN-LAST:event_SubjectAddBtnActionPerformed

    private void RoomTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomTxtFieldActionPerformed

    private void BuildingTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildingTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuildingTxtFieldActionPerformed

    private void SectorTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectorTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectorTxtFieldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void DoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneBtnActionPerformed
        Database.removeClass(getClassInstance());
        this.dispose();
    }//GEN-LAST:event_DoneBtnActionPerformed

    private void HourSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HourSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_HourSpinnerStateChanged

    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerActionPerformed
        updateDurationInfo();
    }//GEN-LAST:event_DatePickerActionPerformed

    private void MinuteSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MinuteSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_MinuteSpinnerStateChanged

    private void AMPMComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_AMPMComboBoxPropertyChange
        updateDurationInfo();
    }//GEN-LAST:event_AMPMComboBoxPropertyChange

    private void DurationSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DurationSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_DurationSpinnerStateChanged

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        Database.removeClass(getClassInstance());
        this.dispose();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AMPMComboBox;
    private javax.swing.JLabel BuildingTxt;
    private javax.swing.JTextField BuildingTxtField;
    private javax.swing.JButton CancelBtn;
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JScrollPane DetailScrollPane;
    private javax.swing.JLabel DetailTxt;
    private javax.swing.JTextArea DetailTxtArea;
    private javax.swing.JButton DoneBtn;
    private javax.swing.JLabel DurationInfoTxt;
    private javax.swing.JSpinner DurationSpinner;
    private javax.swing.JLabel DurationTxt;
    private javax.swing.JSpinner HourSpinner;
    private javax.swing.JSpinner MinuteSpinner;
    private javax.swing.JLabel RoomTxt;
    private javax.swing.JTextField RoomTxtField;
    private javax.swing.JLabel SectorTxt;
    private javax.swing.JTextField SectorTxtField;
    private javax.swing.JButton SubjectAddBtn;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel SubjectTxt;
    private javax.swing.JLabel TeacherTxt;
    private javax.swing.JTextField TeacherTxtField;
    private javax.swing.JLabel TimeTxt;
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
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName)).deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(ViewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return String
     */
    public String getBuilding() {
        return BuildingTxtField.getText();
    }

    /**
     * @return String
     */
    public String getDetail() {
        return DetailTxtArea.getText();
    }

    /**
     * @return String
     */
    public String getRoom() {
        return RoomTxtField.getText();
    }

    /**
     * @return int
     */
    public int getSector() {
        try {
            return Integer.parseInt(SectorTxtField.getText());
        } catch (NumberFormatException e) {
            return 0;
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
    public String getTeacher() {
        return TeacherTxtField.getText();
    }

    /**
     * @return String
     */
    public String getAMPM() {
        return AMPMComboBox.getSelectedItem().toString();
    }

    /**
     * @return int
     */
    public int getDuration() {
        return (int) DurationSpinner.getValue();
    }

    /**
     * @return int
     */
    public int getHour() {
        return (int) HourSpinner.getValue();
    }

    /**
     * @return int
     */
    public int getMinute() {
        return (int) MinuteSpinner.getValue();
    }

    /**
     * @return LocalTime
     */
    public LocalTime getStartTime() {
        if (getAMPM().equals("PM")) {
            if (getHour() + 12 == 24) {
                return LocalTime.of(0, getMinute());
            } else {
                return LocalTime.of(getHour() + 12, getMinute());
            }
        } else {
            return LocalTime.of(getHour(), getMinute());
        }
    }

    /**
     * @return LocalTime
     */
    public LocalTime getEndTime() {
        return getStartTime().plusMinutes(getDuration());
    }

    /**
     * @return LocalDate
     */
    public LocalDate getStartDate() {
        try {
            return DatePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * getHour() + ((getMinute() + getDuration()) / 60) >= 12
     *
     * @return LocalDate
     */
    public LocalDate getEndDate() {
        if (getHour() + ((getMinute() + getDuration()) / 60) >= 12 && getAMPM().equals("PM")) {
            return getStartDate().plusDays(1);
        }
        return getStartDate();
    }

    public void setDurationInfo(LocalDateTime date) {
        DurationInfoTxt.setText("minutes (ending at " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")) + ")");
    }

    private void updateDurationInfo() {
        if (getEndDate() != null) {
            setDurationInfo(LocalDateTime.of(getEndDate(), getEndTime()));
        }
    }

    /** 
     * @return ClassInstance
     */
    public ClassInstance getClassInstance() {
        try {
            return new ClassInstance(getSubject(), getSector(), getRoom(), getStartDate(), getStartTime(), getDuration(), getBuilding(), getTeacher(), getDetail());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
