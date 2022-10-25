package game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class game_create extends JFrame implements ActionListener {

    private ArrayList<Character> cha;
    private ArrayList<Location> loc;

    JButton btnLList, btnLClear;
    JTextArea jteC;


    JButton btnCList, btnCClear, btnCAdd;
    JTextArea jteL;
    JLabel lblN_name;
    JTextField txt_name;

    public game_create(){
        cha = new ArrayList<Character>();
        loc = new ArrayList<Location>();

        //components for tabbed panels
        JTabbedPane tabs = new JTabbedPane();
        JPanel Cha_tab = new JPanel();
        JPanel Loc_tab = new JPanel();

        //component for location tabs
        JPanel display_Lpanel = new JPanel();
        JPanel bottom_Lpanel = new JPanel();

        //for character tabs display
        jteL = new JTextArea(30, 50);
        JScrollPane scrollS = new JScrollPane(jteC, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        btnLList = new JButton("List locations");
        btnLClear = new JButton("Clear locations");

        //component for character tabs
        JPanel input_Cpanel = new JPanel();
        JPanel display_Cpanel = new JPanel();
        JPanel button_CPanel = new JPanel();
        input_Cpanel.setLayout(new GridLayout(2, 1));
        input_Cpanel.setBorder(new EmptyBorder(30,30,30,30));
        lblN_name = new JLabel("Enter Name");
        txt_name = new JTextField(10);
        btnCAdd = new JButton("Add characters");
        btnCList = new JButton("List characters");
        btnCClear = new JButton("Clear");
        jteC = new JTextArea(30, 50);
        jteC.setBorder(new TitledBorder("List of characters"));

        //build tabs
        add(tabs, BorderLayout.CENTER);
        tabs.addTab("Location", Loc_tab);
        tabs.addTab("Characters", Cha_tab);

        //build location tabs
        Loc_tab.setLayout(new BorderLayout());
        Loc_tab.add(display_Lpanel, BorderLayout.CENTER);
        Loc_tab.add(bottom_Lpanel, BorderLayout.SOUTH);
        jteL.setBorder(new TitledBorder("List if Books"));
        btnLList.addActionListener(this);
        btnLClear.addActionListener(this);
        bottom_Lpanel.add(btnLClear);
        bottom_Lpanel.add(btnCList);
        display_Lpanel.add(scrollS);

        //build character tabs
        Cha_tab.setLayout(new BorderLayout());
        Cha_tab.add(input_Cpanel, BorderLayout.NORTH);
        Cha_tab.add(display_Cpanel, BorderLayout.CENTER);
        Cha_tab.add(button_CPanel, BorderLayout.SOUTH);
        input_Cpanel.setLayout(new GridLayout(1, 2));
        input_Cpanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        input_Cpanel.add(lblN_name);
        input_Cpanel.add(txt_name);

        //build button panel
        btnCClear.addActionListener(this);
        btnCList.addActionListener(this);
        btnCAdd.addActionListener(this);
        button_CPanel.add(btnCAdd);
        button_CPanel.add(btnCClear);
        button_CPanel.add(btnCList);
        display_Cpanel.add(jteC);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
