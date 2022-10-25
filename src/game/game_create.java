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
        jteL = new JTextArea(30, 50);
        jteL.setBorder(new TitledBorder("List of characters"));

        //build tabs


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
