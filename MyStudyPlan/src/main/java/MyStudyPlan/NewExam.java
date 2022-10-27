/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyStudyPlan;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Dulapah Vibulsanti
 */
public class NewExam extends javax.swing.JFrame {

    /**
     * Creates new form NewTask
     */
    public NewExam() {
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

        SubjectTxt = new javax.swing.JLabel();
        SubjectComboBox = new javax.swing.JComboBox<>();
        SubjectAddBtn = new javax.swing.JButton();
        DateTxt = new javax.swing.JLabel();
        DateDatePicker = new org.jdesktop.swingx.JXDatePicker();
        BuildingRoomTxt = new javax.swing.JLabel();
        BuildingRoomTxtField = new javax.swing.JTextField();
        SeatTxt = new javax.swing.JLabel();
        SeatTxtField = new javax.swing.JTextField();
        TimeTxt = new javax.swing.JLabel();
        HourSpinner = new javax.swing.JSpinner();
        MinuteSpinner = new javax.swing.JSpinner();
        AMPMComboBox = new javax.swing.JComboBox<>();
        DurationTxt = new javax.swing.JLabel();
        DurationSpinner = new javax.swing.JSpinner();
        DurationInfoTxt = new javax.swing.JLabel();
        DetailTxt = new javax.swing.JLabel();
        DetailScrollPane = new javax.swing.JScrollPane();
        DetailTxtArea = new javax.swing.JTextArea();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Exam");
        setResizable(false);

        SubjectTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SubjectTxt.setText("Subject");

        SubjectComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SubjectAddBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubjectAddBtn.setText("+");
        SubjectAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectAddBtnActionPerformed(evt);
            }
        });

        DateTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DateTxt.setText("Date");

        DateDatePicker.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        BuildingRoomTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BuildingRoomTxt.setText("Building/Room");

        BuildingRoomTxtField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        SeatTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SeatTxt.setText("Seat");

        SeatTxtField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TimeTxt.setText("Time");
        TimeTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        HourSpinner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        MinuteSpinner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        AMPMComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AMPMComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        DurationTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DurationTxt.setText("Duration");

        DurationSpinner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        DurationInfoTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DurationInfoTxt.setText("minutes (ending at unknown)");

        DetailTxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DetailTxt.setText("Detail");

        DetailTxtArea.setColumns(20);
        DetailTxtArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DetailTxtArea.setRows(5);
        DetailScrollPane.setViewportView(DetailTxtArea);

        CancelBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(59, 162, 191));
        SaveBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SaveBtn.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DetailTxt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DetailScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectAddBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TimeTxt)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SubjectTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DateTxt)
                                            .addComponent(DateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BuildingRoomTxt)
                                            .addComponent(BuildingRoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SeatTxt)
                                                .addGap(27, 27, 27))
                                            .addComponent(SeatTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DurationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DurationSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DurationInfoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(SubjectTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubjectAddBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BuildingRoomTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuildingRoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SeatTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TimeTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DurationTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DurationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DurationInfoTxt))))
                .addGap(28, 28, 28)
                .addComponent(DetailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(26, Short.MAX_VALUE))
        );

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
                NewExam.this.setEnabled(true);
                NewExam.this.requestFocus();
                NewExam.this.setExtendedState(NewExam.this.getExtendedState() & ~NewExam.ICONIFIED);
            }
        });
    }//GEN-LAST:event_SubjectAddBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewTask().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AMPMComboBox;
    private javax.swing.JLabel BuildingRoomTxt;
    private javax.swing.JTextField BuildingRoomTxtField;
    private javax.swing.JButton CancelBtn;
    private org.jdesktop.swingx.JXDatePicker DateDatePicker;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JScrollPane DetailScrollPane;
    private javax.swing.JLabel DetailTxt;
    private javax.swing.JTextArea DetailTxtArea;
    private javax.swing.JLabel DurationInfoTxt;
    private javax.swing.JSpinner DurationSpinner;
    private javax.swing.JLabel DurationTxt;
    private javax.swing.JSpinner HourSpinner;
    private javax.swing.JSpinner MinuteSpinner;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel SeatTxt;
    private javax.swing.JTextField SeatTxtField;
    private javax.swing.JButton SubjectAddBtn;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel SubjectTxt;
    private javax.swing.JLabel TimeTxt;
    // End of variables declaration//GEN-END:variables
}