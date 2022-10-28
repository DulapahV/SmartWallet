/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyStudyPlan;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Overview extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Overview() {
        initComponents();
        this.setLocationRelativeTo(null); // Center App on the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        OverviewBtn = new javax.swing.JButton();
        CalendarBtn = new javax.swing.JButton();
        TasksBtn = new javax.swing.JButton();
        ExamsBtn = new javax.swing.JButton();
        ScheduleBtn = new javax.swing.JButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        DateTxt = new javax.swing.JLabel();
        ExamsTxt = new javax.swing.JLabel();
        TasksTxt = new javax.swing.JLabel();
        TasksVal = new javax.swing.JLabel();
        ExamsVal = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        ScheduleScrollPane = new javax.swing.JScrollPane();
        ScheduleList = new javax.swing.JList<>();
        TasksScrollPane = new javax.swing.JScrollPane();
        TasksList = new javax.swing.JList<>();
        ExamsScrollPane = new javax.swing.JScrollPane();
        ExamsList = new javax.swing.JList<>();
        ScheduleTxt = new javax.swing.JLabel();
        NewClassBtn = new javax.swing.JButton();
        TasksTxt2 = new javax.swing.JLabel();
        NewTaskBtn = new javax.swing.JButton();
        ExamsTxt2 = new javax.swing.JLabel();
        NewExamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(950, 575));
        setName("MainMenu"); // NOI18N

        LeftPanel.setBackground(new java.awt.Color(30, 33, 41));
        LeftPanel.setFocusable(false);

        OverviewBtn.setBackground(new java.awt.Color(30, 33, 41));
        OverviewBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulapah Vibulsanti\\OneDrive - KMITL\\Documents\\GitHub\\MyStudyPlan\\MyStudyPlan\\src\\main\\java\\MyStudyPlan\\img\\overview.png")); // NOI18N
        OverviewBtn.setToolTipText("");
        OverviewBtn.setAlignmentX(0.5F);
        OverviewBtn.setBorder(null);
        OverviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverviewBtn.setDefaultCapable(false);
        OverviewBtn.setMaximumSize(new java.awt.Dimension(595, 519));
        OverviewBtn.setMinimumSize(new java.awt.Dimension(595, 519));
        OverviewBtn.setName(""); // NOI18N
        OverviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewBtnActionPerformed(evt);
            }
        });

        CalendarBtn.setBackground(new java.awt.Color(30, 33, 41));
        CalendarBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulapah Vibulsanti\\OneDrive - KMITL\\Documents\\GitHub\\MyStudyPlan\\MyStudyPlan\\src\\main\\java\\MyStudyPlan\\img\\calendar.png")); // NOI18N
        CalendarBtn.setBorder(null);
        CalendarBtn.setBorderPainted(false);
        CalendarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarBtnActionPerformed(evt);
            }
        });

        TasksBtn.setBackground(new java.awt.Color(30, 33, 41));
        TasksBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulapah Vibulsanti\\OneDrive - KMITL\\Documents\\GitHub\\MyStudyPlan\\MyStudyPlan\\src\\main\\java\\MyStudyPlan\\img\\tasks.png")); // NOI18N
        TasksBtn.setBorder(null);
        TasksBtn.setBorderPainted(false);
        TasksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksBtnActionPerformed(evt);
            }
        });

        ExamsBtn.setBackground(new java.awt.Color(30, 33, 41));
        ExamsBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulapah Vibulsanti\\OneDrive - KMITL\\Documents\\GitHub\\MyStudyPlan\\MyStudyPlan\\src\\main\\java\\MyStudyPlan\\img\\exams.png")); // NOI18N
        ExamsBtn.setBorder(null);
        ExamsBtn.setBorderPainted(false);
        ExamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamsBtnActionPerformed(evt);
            }
        });

        ScheduleBtn.setBackground(new java.awt.Color(30, 33, 41));
        ScheduleBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulapah Vibulsanti\\OneDrive - KMITL\\Documents\\GitHub\\MyStudyPlan\\MyStudyPlan\\src\\main\\java\\MyStudyPlan\\img\\schedule.png")); // NOI18N
        ScheduleBtn.setBorder(null);
        ScheduleBtn.setBorderPainted(false);
        ScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OverviewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalendarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TasksBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExamsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(OverviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CalendarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TasksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExamsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(59, 162, 191));

        TodayTxt.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        TodayTxt.setText("Today");

        DateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DateTxt.setText("Wednesday, October 26");

        ExamsTxt.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        ExamsTxt.setText("Exams");

        TasksTxt.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        TasksTxt.setText("Tasks");

        TasksVal.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        TasksVal.setText("0");

        ExamsVal.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        ExamsVal.setText("0");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(TodayTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksTxt)
                .addGap(18, 18, 18)
                .addComponent(TasksVal)
                .addGap(98, 98, 98)
                .addComponent(ExamsTxt)
                .addGap(18, 18, 18)
                .addComponent(ExamsVal)
                .addGap(60, 60, 60))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DateTxt)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TasksVal)
                    .addComponent(ExamsTxt)
                    .addComponent(TasksTxt)
                    .addComponent(ExamsVal))
                .addGap(35, 35, 35))
        );

        Separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ScheduleList.setBackground(new java.awt.Color(46, 52, 64));
        ScheduleList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ScheduleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScheduleList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ScheduleList.setFixedCellHeight(30);
        ScheduleList.setVisibleRowCount(10);
        ScheduleScrollPane.setViewportView(ScheduleList);

        TasksList.setBackground(new java.awt.Color(46, 52, 64));
        TasksList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TasksList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TasksList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TasksList.setFixedCellHeight(30);
        TasksList.setVisibleRowCount(10);
        TasksScrollPane.setViewportView(TasksList);

        ExamsList.setBackground(new java.awt.Color(46, 52, 64));
        ExamsList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ExamsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ExamsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ExamsList.setFixedCellHeight(30);
        ExamsList.setVisibleRowCount(10);
        ExamsScrollPane.setViewportView(ExamsList);

        ScheduleTxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ScheduleTxt.setText("Schedule");

        NewClassBtn.setBackground(new java.awt.Color(86, 96, 118));
        NewClassBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewClassBtn.setText("+ New Class");
        NewClassBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewClassBtnActionPerformed(evt);
            }
        });

        TasksTxt2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TasksTxt2.setText("Tasks");

        NewTaskBtn.setBackground(new java.awt.Color(86, 96, 118));
        NewTaskBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewTaskBtn.setText("+ New Task");
        NewTaskBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskBtnActionPerformed(evt);
            }
        });

        ExamsTxt2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ExamsTxt2.setText("Exams");

        NewExamBtn.setBackground(new java.awt.Color(86, 96, 118));
        NewExamBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewExamBtn.setText("+ New Exam");
        NewExamBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExamBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScheduleScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScheduleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(NewClassBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TasksScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TasksTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewTaskBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExamsTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewExamBtn))
                            .addComponent(ExamsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScheduleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(TasksTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(ExamsTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TasksScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ScheduleScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ExamsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(Separator2))))
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExamsTxt2, ScheduleTxt, TasksTxt2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewBtnActionPerformed
        // Do nothing
    }//GEN-LAST:event_OverviewBtnActionPerformed

    private void CalendarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarBtnActionPerformed
        Calendar calendar = new Calendar();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            calendar.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            calendar.setSize(this.getSize());
            calendar.setLocation(this.getLocation());
        }
        calendar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CalendarBtnActionPerformed

    private void TasksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasksBtnActionPerformed
        Tasks tasks = new Tasks();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            tasks.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            tasks.setSize(this.getSize());
            tasks.setLocation(this.getLocation());
        }
        tasks.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TasksBtnActionPerformed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamsBtnActionPerformed
        Exams exams = new Exams();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            exams.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            exams.setSize(this.getSize());
            exams.setLocation(this.getLocation());
        }
        exams.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExamsBtnActionPerformed

    private void ScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleBtnActionPerformed
        Schedule schedule = new Schedule();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            schedule.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            schedule.setSize(this.getSize());
            schedule.setLocation(this.getLocation());
        }
        schedule.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ScheduleBtnActionPerformed

    private void NewClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClassBtnActionPerformed
        NewClass newClass = new NewClass();
        newClass.setVisible(true);
        newClass.setLocationRelativeTo(this);
        this.setEnabled(false);
        newClass.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewClassBtnActionPerformed

    private void NewTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTaskBtnActionPerformed
        NewTask newTask = new NewTask();
        newTask.setVisible(true);
        newTask.setLocationRelativeTo(this);
        this.setEnabled(false);
        newTask.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewTaskBtnActionPerformed

    private void NewExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewExamBtnActionPerformed
        NewExam newExam = new NewExam();
        newExam.setVisible(true);
        newExam.setLocationRelativeTo(this);
        this.setEnabled(false);
        newExam.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewExamBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the theme */
        FlatNordIJTheme.setup();
        //FlatCarbonIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalendarBtn;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JButton ExamsBtn;
    private javax.swing.JList<String> ExamsList;
    private javax.swing.JScrollPane ExamsScrollPane;
    private javax.swing.JLabel ExamsTxt;
    private javax.swing.JLabel ExamsTxt2;
    private javax.swing.JLabel ExamsVal;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton NewClassBtn;
    private javax.swing.JButton NewExamBtn;
    private javax.swing.JButton NewTaskBtn;
    private javax.swing.JButton OverviewBtn;
    private javax.swing.JButton ScheduleBtn;
    private javax.swing.JList<String> ScheduleList;
    private javax.swing.JScrollPane ScheduleScrollPane;
    private javax.swing.JLabel ScheduleTxt;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JButton TasksBtn;
    private javax.swing.JList<String> TasksList;
    private javax.swing.JScrollPane TasksScrollPane;
    private javax.swing.JLabel TasksTxt;
    private javax.swing.JLabel TasksTxt2;
    private javax.swing.JLabel TasksVal;
    private javax.swing.JLabel TodayTxt;
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables
}
