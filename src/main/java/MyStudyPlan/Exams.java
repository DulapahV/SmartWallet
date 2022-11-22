package MyStudyPlan;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Exams extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Exams() {
        initComponents();

        updateExamPane();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                        "Exit", JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    Logger.getLogger(Exams.class.getName()).log(java.util.logging.Level.INFO, "Exiting...");
                    System.exit(0);
                }
            }
        });
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
        LogoutBtn = new org.jdesktop.swingx.JXButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        NewExamBtn = new javax.swing.JButton();
        ExamScrollPane = new javax.swing.JScrollPane();
        ExamPane = new org.jdesktop.swingx.JXTaskPaneContainer();
        SearchPanel = new org.jdesktop.swingx.JXSearchPanel();
        ClearBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
        OverviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewBtnActionPerformed(evt);
            }
        });

        CalendarBtn.setBackground(new java.awt.Color(30, 33, 41));
        CalendarBtn.setBorder(null);
        CalendarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        OverviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        LogoutBtn.setBackground(new java.awt.Color(30, 33, 41));
        LogoutBtn.setBorder(null);
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        ScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
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
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(59, 162, 191));

        TodayTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 32));
        TodayTxt.setText("Exams");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(792, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TodayTxt)
                .addContainerGap(33, Short.MAX_VALUE))
        );

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

        ExamScrollPane.setBorder(null);
        ExamScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        ExamScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        ExamPane.setBorder(null);
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        ExamPane.setLayout(verticalLayout1);
        ExamScrollPane.setViewportView(ExamPane);

        SearchPanel.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ExamScrollPane)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(NewExamBtn)))
                                .addContainerGap())))))
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
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExamScrollPane))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Database.logout();
            MyStudyPlan.showLoginPage();
            this.dispose();
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchBtnActionPerformed
        Pattern pattern = SearchPanel.getPattern();
        if (pattern == null) {
            return;
        }
        ExamPane.removeAll();
        for (ExamInstance examInstance : Database.getExamList()) {
            if (examInstance.getSubject() == null) {
                continue;
            }
            if (examInstance.getSubject().getName() == null) {
                continue;
            }
            if (pattern.matcher(examInstance.getSubject().getName()).find()) {
                JButton label = createLabel(examInstance);
                ExamPane.add(label);
            }
        }
        ExamPane.revalidate();
    }// GEN-LAST:event_SearchBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClearBtnActionPerformed
        updateExamPane();
    }// GEN-LAST:event_ClearBtnActionPerformed

    private void NewExamBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NewExamBtnActionPerformed
        NewExam newExam = new NewExam();
        newExam.setVisible(true);
        newExam.setLocationRelativeTo(this);
        this.setEnabled(false);
        newExam.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Exams.this.setEnabled(true);
                Exams.this.requestFocus();
                Exams.this.setExtendedState(Exams.this.getExtendedState() & ~Exams.ICONIFIED);
                updateExamPane();
            }
        });
    }// GEN-LAST:event_NewExamBtnActionPerformed

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OverviewBtnActionPerformed
        Overview overview = new Overview();
        if (this.getExtendedState() == Exams.MAXIMIZED_BOTH) {
            overview.setExtendedState(Exams.MAXIMIZED_BOTH);
        } else {
            overview.setSize(this.getSize());
            overview.setLocation(this.getLocation());
        }
        overview.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_OverviewBtnActionPerformed

    private void CalendarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CalendarBtnActionPerformed
        Calendar calendar = new Calendar();
        if (this.getExtendedState() == Exams.MAXIMIZED_BOTH) {
            calendar.setExtendedState(Exams.MAXIMIZED_BOTH);
        } else {
            calendar.setSize(this.getSize());
            calendar.setLocation(this.getLocation());
        }
        calendar.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_CalendarBtnActionPerformed

    private void TasksBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TasksBtnActionPerformed
        Tasks tasks = new Tasks();
        if (this.getExtendedState() == Exams.MAXIMIZED_BOTH) {
            tasks.setExtendedState(Exams.MAXIMIZED_BOTH);
        } else {
            tasks.setSize(this.getSize());
            tasks.setLocation(this.getLocation());
        }
        tasks.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_TasksBtnActionPerformed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ExamsBtnActionPerformed
        // Do nothing
    }// GEN-LAST:event_ExamsBtnActionPerformed

    private void ScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ScheduleBtnActionPerformed
        Schedule schedule = new Schedule();
        if (this.getExtendedState() == Exams.MAXIMIZED_BOTH) {
            schedule.setExtendedState(Exams.MAXIMIZED_BOTH);
        } else {
            schedule.setSize(this.getSize());
            schedule.setLocation(this.getLocation());
        }
        schedule.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_ScheduleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private javax.swing.JButton ClearBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer ExamPane;
    private javax.swing.JScrollPane ExamScrollPane;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JPanel LeftPanel;
    private org.jdesktop.swingx.JXButton LogoutBtn;
    private javax.swing.JButton NewExamBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
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
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName))
                    .deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Exams.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
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
            ExamPane.add(createLabel(examInstance));
        }
        ExamPane.revalidate();
    }

    /**
     * @param examInstance
     * @return JButton
     */
    private JButton createLabel(ExamInstance examInstance) {
        String string = "Subject: " + examInstance.getSubject().getCode() + " "
                + examInstance.getSubject().getName() + "\nDate: "
                + examInstance.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nTime: "
                + examInstance.getTime() + " (" + examInstance.getDuration() + " minutes)" + "\nBuilding/Room: "
                + examInstance.getRoom() + "\nSeat: " + examInstance.getSeat() + "\nDescription: "
                + examInstance.getDescription();
        JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
        label.setBackground(examInstance.getSubject().getColor());
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.setForeground(new Color(255 - examInstance.getSubject().getColor().getRed(),
                255 - examInstance.getSubject().getColor().getGreen(),
                255 - examInstance.getSubject().getColor().getBlue()));
        label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewExam viewExam = new ViewExam(examInstance);
                viewExam.setLocationRelativeTo(Exams.this);
                viewExam.setVisible(true);
                Exams.this.setEnabled(false);
                viewExam.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        Exams.this.setEnabled(true);
                        Exams.this.requestFocus();
                        Exams.this.setExtendedState(Exams.this.getExtendedState() & ~Exams.ICONIFIED);
                        updateExamPane();
                    }
                });
            }
        });
        return label;
    }
}