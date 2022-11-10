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
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Schedule extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Schedule() {
        initComponents();

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
        SearchPanel = new org.jdesktop.swingx.JXSearchPanel();
        SearchBtn = new javax.swing.JButton();
        ManageSubjectsBtn = new javax.swing.JButton();
        NewClassBtn = new javax.swing.JButton();
        ScheduleScrollPane = new javax.swing.JScrollPane();
        SchedulePane = new org.jdesktop.swingx.JXTaskPaneContainer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        TodayTxt.setText("Schedule");

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

        SearchPanel.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchBtn.setBackground(new java.awt.Color(86, 96, 118));
        SearchBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        SearchBtn.setText("Search");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));

        ManageSubjectsBtn.setBackground(new java.awt.Color(59, 162, 191));
        ManageSubjectsBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        ManageSubjectsBtn.setText("Manage Subjects");
        ManageSubjectsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageSubjectsBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        ManageSubjectsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSubjectsBtnActionPerformed(evt);
            }
        });

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

        ScheduleScrollPane.setBorder(null);
        ScheduleScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        ScheduleScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        SchedulePane.setBorder(null);
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        SchedulePane.setLayout(verticalLayout1);
        ScheduleScrollPane.setViewportView(SchedulePane);

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
                            .addComponent(ScheduleScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                                .addComponent(NewClassBtn)
                                .addGap(18, 18, 18)
                                .addComponent(ManageSubjectsBtn)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageSubjectsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScheduleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClassBtnActionPerformed
        NewClass newClass = new NewClass();
        newClass.setVisible(true);
        newClass.setLocationRelativeTo(this);
        this.setEnabled(false);
        newClass.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Schedule.this.setEnabled(true);
                Schedule.this.requestFocus();
                Schedule.this.setExtendedState(Schedule.this.getExtendedState() & ~Schedule.ICONIFIED);
                updateSchedulePane();
            }
        });
    }//GEN-LAST:event_NewClassBtnActionPerformed

    private void ManageSubjectsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSubjectsBtnActionPerformed
        ManageSubjects manageSubjects = new ManageSubjects();
        manageSubjects.setVisible(true);
        manageSubjects.setLocationRelativeTo(this);
        this.setEnabled(false);
        manageSubjects.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Schedule.this.setEnabled(true);
                Schedule.this.requestFocus();
                Schedule.this.setExtendedState(Schedule.this.getExtendedState() & ~Schedule.ICONIFIED);
                updateSchedulePane();
            }
        });
    }//GEN-LAST:event_ManageSubjectsBtnActionPerformed

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
        // Do nothing
    }//GEN-LAST:event_ScheduleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton ManageSubjectsBtn;
    private javax.swing.JButton NewClassBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer SchedulePane;
    private javax.swing.JScrollPane ScheduleScrollPane;
    private javax.swing.JButton SearchBtn;
    private org.jdesktop.swingx.JXSearchPanel SearchPanel;
    private org.jdesktop.swingx.JXButton TasksBtn;
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
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return Pattern
     */
    public Pattern getSearchPanel() {
        return SearchPanel.getPattern();
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
                    viewSchedule.setLocationRelativeTo(Schedule.this);
                    viewSchedule.setVisible(true);
                    Schedule.this.setEnabled(false);
                    viewSchedule.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            Schedule.this.setEnabled(true);
                            Schedule.this.requestFocus();
                            Schedule.this.setExtendedState(Schedule.this.getExtendedState() & ~Schedule.ICONIFIED);
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
