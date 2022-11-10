package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;

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

        int time = java.time.LocalTime.now().getHour();
        if (time >= 0 && time < 12) {
            TodayTxt.setText("Good Morning!");
        } else if (time >= 12 && time < 18) {
            TodayTxt.setText("Good Afternoon!");
        } else {
            TodayTxt.setText("Good Evening!");
        }

        updateTaskPane();
        updateExamPane();
        updateSchedulePane();
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
        OverviewBtn = new org.jdesktop.swingx.JXButton();
        CalendarBtn = new org.jdesktop.swingx.JXButton();
        TasksBtn = new org.jdesktop.swingx.JXButton();
        ExamsBtn = new org.jdesktop.swingx.JXButton();
        ScheduleBtn = new org.jdesktop.swingx.JXButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        DateTxt = new javax.swing.JLabel();
        ScheduleTopTxt = new javax.swing.JLabel();
        ScheduleTopVal = new javax.swing.JLabel();
        TasksTopTxt = new javax.swing.JLabel();
        TasksTopVal = new javax.swing.JLabel();
        ExamsTopTxt = new javax.swing.JLabel();
        ExamsTopVal = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        ScheduleTxt = new javax.swing.JLabel();
        NewClassBtn = new javax.swing.JButton();
        TasksTxt = new javax.swing.JLabel();
        NewTaskBtn = new javax.swing.JButton();
        ExamsTxt = new javax.swing.JLabel();
        NewExamBtn = new javax.swing.JButton();
        TaskScrollPane = new javax.swing.JScrollPane();
        TasksPaneContainer = new org.jdesktop.swingx.JXTaskPaneContainer();
        AssignmentTaskPane = new org.jdesktop.swingx.JXTaskPane();
        ReminderTaskPane = new org.jdesktop.swingx.JXTaskPane();
        RevisionTaskPane = new org.jdesktop.swingx.JXTaskPane();
        ExamScrollPane = new javax.swing.JScrollPane();
        ExamPane = new org.jdesktop.swingx.JXTaskPaneContainer();
        ScheduleScrollPane = new javax.swing.JScrollPane();
        SchedulePane = new org.jdesktop.swingx.JXTaskPaneContainer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N
        setSize(new java.awt.Dimension(1108, 632));

        LeftPanel.setBackground(new java.awt.Color(30, 33, 41));
        LeftPanel.setFocusable(false);

        OverviewBtn.setBackground(new java.awt.Color(30, 33, 41));
        OverviewBtn.setBorder(null);
        OverviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/overview.png"))); // NOI18N
        OverviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewBtnActionPerformed(evt);
            }
        });

        CalendarBtn.setBackground(new java.awt.Color(30, 33, 41));
        CalendarBtn.setBorder(null);
        CalendarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        CalendarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarBtnActionPerformed(evt);
            }
        });

        TasksBtn.setBackground(new java.awt.Color(30, 33, 41));
        TasksBtn.setBorder(null);
        TasksBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tasks.png"))); // NOI18N
        TasksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksBtnActionPerformed(evt);
            }
        });

        ExamsBtn.setBackground(new java.awt.Color(30, 33, 41));
        ExamsBtn.setBorder(null);
        ExamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exams.png"))); // NOI18N
        ExamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamsBtnActionPerformed(evt);
            }
        });

        ScheduleBtn.setBackground(new java.awt.Color(30, 33, 41));
        ScheduleBtn.setBorder(null);
        ScheduleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schedule.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OverviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalendarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(TasksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addContainerGap(129, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(59, 162, 191));

        TodayTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 32));
        TodayTxt.setText("Good Morning!");

        DateTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 18));
        DateTxt.setText(new java.text.SimpleDateFormat("EEEE, d MMMM yyyy").format(new java.util.Date()));

        ScheduleTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ScheduleTopTxt.setText("Schedule");

        ScheduleTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ScheduleTopVal.setText("0");

        TasksTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        TasksTopTxt.setText("Tasks");

        TasksTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        TasksTopVal.setText("0");

        ExamsTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ExamsTopTxt.setText("Exams");

        ExamsTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ExamsTopVal.setText("0");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(TodayTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(ScheduleTopTxt)
                .addGap(18, 18, 18)
                .addComponent(ScheduleTopVal)
                .addGap(60, 60, 60)
                .addComponent(TasksTopTxt)
                .addGap(18, 18, 18)
                .addComponent(TasksTopVal)
                .addGap(60, 60, 60)
                .addComponent(ExamsTopTxt)
                .addGap(18, 18, 18)
                .addComponent(ExamsTopVal)
                .addGap(21, 21, 21))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DateTxt)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ScheduleTopTxt)
                    .addComponent(ScheduleTopVal)
                    .addComponent(TasksTopTxt)
                    .addComponent(TasksTopVal)
                    .addComponent(ExamsTopTxt)
                    .addComponent(ExamsTopVal))
                .addGap(34, 34, 34))
        );

        ScheduleTopVal.setText(String.valueOf(Database.getClassList().size()));
        TasksTopVal.setText(String.valueOf(Database.getTaskList().size()));
        ExamsTopVal.setText(String.valueOf(Database.getExamList().size()));

        Separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ScheduleTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        ScheduleTxt.setText("Schedule");

        NewClassBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewClassBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewClassBtn.setText("+ New Class");
        NewClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewClassBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewClassBtnActionPerformed(evt);
            }
        });

        TasksTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        TasksTxt.setText("Tasks");

        NewTaskBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewTaskBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewTaskBtn.setText("+ New Task");
        NewTaskBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTaskBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskBtnActionPerformed(evt);
            }
        });

        ExamsTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        ExamsTxt.setText("Exams");

        NewExamBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewExamBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewExamBtn.setText("+ New Exam");
        NewExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewExamBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExamBtnActionPerformed(evt);
            }
        });

        TaskScrollPane.setBorder(null);
        TaskScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        TaskScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        TasksPaneContainer.setBackground(new java.awt.Color(46, 52, 64));
        TasksPaneContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        org.jdesktop.swingx.VerticalLayout verticalLayout2 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout2.setGap(14);
        TasksPaneContainer.setLayout(verticalLayout2);

        AssignmentTaskPane.setBackground(new java.awt.Color(46, 52, 64));
        AssignmentTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        AssignmentTaskPane.setSpecial(true);
        AssignmentTaskPane.setTitle("Assignment (0)");
        TasksPaneContainer.add(AssignmentTaskPane);

        ReminderTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ReminderTaskPane.setSpecial(true);
        ReminderTaskPane.setTitle("Reminder (0)");
        TasksPaneContainer.add(ReminderTaskPane);

        RevisionTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        RevisionTaskPane.setSpecial(true);
        RevisionTaskPane.setTitle("Revision (0)");
        TasksPaneContainer.add(RevisionTaskPane);

        TaskScrollPane.setViewportView(TasksPaneContainer);

        ExamScrollPane.setBorder(null);
        ExamScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        ExamScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        ExamPane.setBorder(null);
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        ExamPane.setLayout(verticalLayout1);
        ExamScrollPane.setViewportView(ExamPane);

        ScheduleScrollPane.setBorder(null);
        ScheduleScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        ScheduleScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        SchedulePane.setBorder(null);
        org.jdesktop.swingx.VerticalLayout verticalLayout4 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout4.setGap(14);
        SchedulePane.setLayout(verticalLayout4);
        ScheduleScrollPane.setViewportView(SchedulePane);

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScheduleTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewClassBtn))
                            .addComponent(ScheduleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TasksTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(NewTaskBtn))
                            .addComponent(TaskScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExamsTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewExamBtn))
                            .addComponent(ExamScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addContainerGap())))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ScheduleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TasksTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExamsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TaskScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ExamScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ScheduleScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(Separator2)))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExamsTxt, ScheduleTxt, TasksTxt});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                updateSchedulePane();
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
                updateTaskPane();
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
                updateExamPane();
            }
        });
    }//GEN-LAST:event_NewExamBtnActionPerformed

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

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewBtnActionPerformed
        // Do nothing
    }//GEN-LAST:event_OverviewBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the theme */
        FlatNordIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPane AssignmentTaskPane;
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private javax.swing.JLabel DateTxt;
    private org.jdesktop.swingx.JXTaskPaneContainer ExamPane;
    private javax.swing.JScrollPane ExamScrollPane;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JLabel ExamsTopTxt;
    private javax.swing.JLabel ExamsTopVal;
    private javax.swing.JLabel ExamsTxt;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton NewClassBtn;
    private javax.swing.JButton NewExamBtn;
    private javax.swing.JButton NewTaskBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXTaskPane ReminderTaskPane;
    private org.jdesktop.swingx.JXTaskPane RevisionTaskPane;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer SchedulePane;
    private javax.swing.JScrollPane ScheduleScrollPane;
    private javax.swing.JLabel ScheduleTopTxt;
    private javax.swing.JLabel ScheduleTopVal;
    private javax.swing.JLabel ScheduleTxt;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JScrollPane TaskScrollPane;
    private org.jdesktop.swingx.JXButton TasksBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer TasksPaneContainer;
    private javax.swing.JLabel TasksTopTxt;
    private javax.swing.JLabel TasksTopVal;
    private javax.swing.JLabel TasksTxt;
    private javax.swing.JLabel TodayTxt;
    private javax.swing.JPanel TopPanel;
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
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    private void updateTaskPane() {
        AssignmentTaskPane.removeAll();
        ReminderTaskPane.removeAll();
        RevisionTaskPane.removeAll();

        int numAssignment = 0;
        int numReminder = 0;
        int numRevision = 0;

        Collections.sort(Database.getTaskList(), new Comparator<TaskInstance>() {
            @Override
            public int compare(TaskInstance o1, TaskInstance o2) {
                return o1.getDueDate().compareTo(o2.getDueDate());
            }
        });

        for (TaskInstance taskInstance : Database.getTaskList()) {
            String string = "Subject: " + taskInstance.getSubject().getCode() + " " + taskInstance.getSubject().getName() + "\nName: " + taskInstance.getTitle() + "\nDue date: " + taskInstance.getDueDate() + "\nDescription: " + taskInstance.getDescription();
            JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
            label.setBackground(taskInstance.getSubject().getColor());
            label.setHorizontalAlignment(SwingConstants.LEFT);
            label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
            label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            label.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ViewTask editTask = new ViewTask(taskInstance);
                    editTask.setLocationRelativeTo(Overview.this);
                    editTask.setVisible(true);
                    Overview.this.setEnabled(false);
                    editTask.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            Overview.this.setEnabled(true);
                            Overview.this.requestFocus();
                            Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
                            updateTaskPane();
                        }
                    });
                }
            });
            switch (taskInstance.getType()) {
                case Assignment:
                    AssignmentTaskPane.add(label);
                    numAssignment++;
                    break;
                case Reminder:
                    ReminderTaskPane.add(label);
                    numReminder++;
                    break;
                case Revision:
                    RevisionTaskPane.add(label);
                    numRevision++;
                    break;
            }
        }
        AssignmentTaskPane.setTitle("Assignment (" + numAssignment + ")");
        ReminderTaskPane.setTitle("Reminder (" + numReminder + ")");
        RevisionTaskPane.setTitle("Revision (" + numRevision + ")");
    }

    private void updateExamPane() {
        ExamPane.removeAll();

        Collections.sort(Database.getExamList(), new Comparator<ExamInstance>() {
            @Override
            public int compare(ExamInstance o1, ExamInstance o2) {
                if (o1.getDate().compareTo(o2.getDate()) == 0) {
                    return o1.getTime().compareTo(o2.getTime());
                } else {
                    return o1.getDate().compareTo(o2.getDate());
                }
            }
        });

        for (ExamInstance examInstance : Database.getExamList()) {
            String string = "Subject: " + examInstance.getSubject().getCode() + " " + examInstance.getSubject().getName() + "\nDate: " + examInstance.getDate() + "\nTime: " + examInstance.getTime() + " (" + examInstance.getDuration() + " minutes)" + "\nBuilding/Room: " + examInstance.getRoom() + "\nSeat: " + examInstance.getSeat() + "\nDescription: " + examInstance.getDescription();
            JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
            label.setBackground(examInstance.getSubject().getColor());
            label.setHorizontalAlignment(SwingConstants.LEFT);
            label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
            label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            label.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ViewExam viewExam = new ViewExam(examInstance);
                    viewExam.setLocationRelativeTo(Overview.this);
                    viewExam.setVisible(true);
                    Overview.this.setEnabled(false);
                    viewExam.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            Overview.this.setEnabled(true);
                            Overview.this.requestFocus();
                            Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
                            updateExamPane();
                        }
                    });
                }
            });
            ExamPane.add(label);
        }
        ExamPane.revalidate();
    }

    private void updateSchedulePane() {
        SchedulePane.removeAll();

        Collections.sort(Database.getClassList(), new Comparator<ClassInstance>() {
            @Override
            public int compare(ClassInstance o1, ClassInstance o2) {
                if (o1.getDate().compareTo(o2.getDate()) == 0) {
                    return o1.getTime().compareTo(o2.getTime());
                } else {
                    return o1.getDate().compareTo(o2.getDate());
                }
            }
        });

        for (ClassInstance classInstance : Database.getClassList()) {
            String string = "Subject: " + classInstance.getSubject().getCode() + " " + classInstance.getSubject().getName() + "\nDate: " + classInstance.getDate() + "\nTime: " + classInstance.getTime() + " (" + classInstance.getDuration() + " minutes)" + "\nSector: " + classInstance.getSector() + "\nRoom: " + classInstance.getRoom() + "\nBuilding: " + classInstance.getBuilding() + "\nTeacher: " + classInstance.getTeacher();
            JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
            label.setBackground(classInstance.getSubject().getColor());
            label.setHorizontalAlignment(SwingConstants.LEFT);
            label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
            label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            label.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ViewClass viewSchedule = new ViewClass(classInstance);
                    viewSchedule.setLocationRelativeTo(Overview.this);
                    viewSchedule.setVisible(true);
                    Overview.this.setEnabled(false);
                    viewSchedule.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            Overview.this.setEnabled(true);
                            Overview.this.requestFocus();
                            Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
                            updateSchedulePane();
                        }
                    });
                }
            });
            SchedulePane.add(label);
        }
        SchedulePane.revalidate();
    }
}
