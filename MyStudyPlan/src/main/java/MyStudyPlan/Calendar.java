package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Calendar extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Calendar() {
        initComponents();

        updateTaskPane(LocalDate.now());
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
        DatePicker = new org.jdesktop.swingx.JXDatePicker();
        SearchPanel = new org.jdesktop.swingx.JXSearchPanel();
        SearchBtn = new javax.swing.JButton();
        Calendar = new org.jdesktop.swingx.JXMonthView();
        CalendarScrollPane = new javax.swing.JScrollPane();
        CalendarPanel = new javax.swing.JPanel();
        TasksPaneContainer = new org.jdesktop.swingx.JXTaskPaneContainer();
        AssignmentTaskPane = new org.jdesktop.swingx.JXTaskPane();
        ReminderTaskPane = new org.jdesktop.swingx.JXTaskPane();
        RevisionTaskPane = new org.jdesktop.swingx.JXTaskPane();
        SchedulePane = new javax.swing.JPanel();
        ExamPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N

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
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OverviewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(CalendarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TasksBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        TodayTxt.setText("Calendar");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TodayTxt)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        DateTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DateTxt.setText("Date");

        DatePicker.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchPanel.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchBtn.setBackground(new java.awt.Color(86, 96, 118));
        SearchBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        SearchBtn.setText("Search");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));

        Calendar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(59, 65, 83), 1, true));
        Calendar.setDaysOfTheWeekForeground(new java.awt.Color(59, 162, 191));
        Calendar.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 20));
        Calendar.setMonthStringBackground(new java.awt.Color(59, 162, 191));
        Calendar.setPreferredSize(new java.awt.Dimension(289, 222));
        Calendar.setTraversable(true);
        Calendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarActionPerformed(evt);
            }
        });

        TasksPaneContainer.setBackground(new java.awt.Color(46, 52, 64));
        TasksPaneContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tasks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont("DINPro-Medium.otf", Font.PLAIN, 18)));
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

        javax.swing.GroupLayout SchedulePaneLayout = new javax.swing.GroupLayout(SchedulePane);
        SchedulePane.setLayout(SchedulePaneLayout);
        SchedulePaneLayout.setHorizontalGroup(
            SchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        SchedulePaneLayout.setVerticalGroup(
            SchedulePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ExamPaneLayout = new javax.swing.GroupLayout(ExamPane);
        ExamPane.setLayout(ExamPaneLayout);
        ExamPaneLayout.setHorizontalGroup(
            ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        ExamPaneLayout.setVerticalGroup(
            ExamPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CalendarPanelLayout = new javax.swing.GroupLayout(CalendarPanel);
        CalendarPanel.setLayout(CalendarPanelLayout);
        CalendarPanelLayout.setHorizontalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TasksPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SchedulePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CalendarPanelLayout.setVerticalGroup(
            CalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SchedulePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TasksPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExamPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CalendarScrollPane.setViewportView(CalendarPanel);

        CalendarScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        CalendarScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CalendarScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalendarScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarActionPerformed
        LocalDate date = Calendar.getSelectionDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        updateTaskPane(date);
    }//GEN-LAST:event_CalendarActionPerformed

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
        // Do nothing
    }//GEN-LAST:event_CalendarBtnActionPerformed

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewBtnActionPerformed
        Overview overview = new Overview();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            overview.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            overview.setSize(this.getSize());
            overview.setLocation(this.getLocation());
        }
        overview.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OverviewBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPane AssignmentTaskPane;
    private org.jdesktop.swingx.JXMonthView Calendar;
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private javax.swing.JPanel CalendarPanel;
    private javax.swing.JScrollPane CalendarScrollPane;
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JPanel ExamPane;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JPanel LeftPanel;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXTaskPane ReminderTaskPane;
    private org.jdesktop.swingx.JXTaskPane RevisionTaskPane;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private javax.swing.JPanel SchedulePane;
    private javax.swing.JButton SearchBtn;
    private org.jdesktop.swingx.JXSearchPanel SearchPanel;
    private org.jdesktop.swingx.JXButton TasksBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer TasksPaneContainer;
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
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return Date
     */
    public Date getDate() {
        return DatePicker.getDate();
    }

    /**
     * @return Pattern
     */
    public Pattern getSearchPanel() {
        return SearchPanel.getPattern();
    }

    private void updateTaskPane(LocalDate date) {
        AssignmentTaskPane.removeAll();
        ReminderTaskPane.removeAll();
        RevisionTaskPane.removeAll();

        int numAssignment = 0;
        int numReminder = 0;
        int numRevision = 0;

        for (TaskInstance task : Database.getTaskList()) {
            if (task.getDueDate().equals(date)) {
                String string = "Due date: " + task.getDueDate() + "\nName: " + task.getTitle() + "\nSubject: " + task.getSubject().getName() + "\nDescription: " + task.getDescription();
                JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
                label.setBackground(task.getSubject().getColor());
                label.setHorizontalAlignment(SwingConstants.LEFT);
                label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
                label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                label.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ViewTask editTask = new ViewTask(task);
                        editTask.setLocationRelativeTo(Calendar.this);
                        editTask.setVisible(true);
                        Calendar.this.setEnabled(false);
                        editTask.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                Calendar.this.setEnabled(true);
                                Calendar.this.requestFocus();
                                Calendar.this.setExtendedState(Calendar.this.getExtendedState() & ~Overview.ICONIFIED);
                                LocalDate date = Calendar.getSelectionDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                updateTaskPane(date);
                            }
                        });
                    }
                });
                switch (task.getType()) {
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
        }
        AssignmentTaskPane.setTitle("Assignment (" + numAssignment + ")");
        ReminderTaskPane.setTitle("Reminder (" + numReminder + ")");
        RevisionTaskPane.setTitle("Revision (" + numRevision + ")");
    }
}
