package game;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class is for building JFrame
 *
 */
public class game_create extends JFrame implements ActionListener {

    private ArrayList<Character> cha;
    private ArrayList<Location> loc;

    JButton btnLList, btnLClear;
    JTextArea jteL;


    JButton btnCList, btnCClear, btnCAdd;
    JTextArea jteC;
    JLabel lblN_name;
    JTextField txt_name;

    public game_create() {
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
        JScrollPane scrollS = new JScrollPane(jteL, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        btnLList = new JButton("List locations");
        btnLClear = new JButton("Clear locations");

        //component for character tabs
        JPanel input_Cpanel = new JPanel();
        JPanel display_Cpanel = new JPanel();
        JPanel button_CPanel = new JPanel();
        input_Cpanel.setLayout(new GridLayout(2, 1));
        input_Cpanel.setBorder(new EmptyBorder(30, 30, 30, 30));
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
        jteL.setBorder(new TitledBorder("List if Locations"));
        btnLList.addActionListener(this);
        btnLClear.addActionListener(this);
        bottom_Lpanel.add(btnLClear);
        bottom_Lpanel.add(btnLList);
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
    /**
     * This method is for listing string name in the JFrame
     *
     */

    public void populateList() {


        Location[] arrofLocations = {new Location("a1"), new Location("b2"),
                new Location("c3")};
        Character[] arrofCha = {new Character("a"), new Character("b"), new Character("c")};
        for (int i = 0; i < arrofLocations.length; i++) {
            arrofLocations[i].setlocation_size(arrofLocations[i].getLocation_name());
            loc.add(arrofLocations[i]);
        }
        for (int i = 0; i < arrofCha.length; i++) {
            cha.add(arrofCha[i]);
        }
    }
    /**
     * This method is for run the game_create() method
     *
     */
    public static void main(String[] args) {

        game_create aa = new game_create();
        aa.populateList();
        aa.setSize(600, 550);
        aa.setLocationRelativeTo(null);
        aa.setVisible(true);
    }

    public void display_locations(){
        for (Location l:loc){
            System.out.println(l);
        }
    }
    public void add_cha() {
        String name = txt_name.getText();
        Character c = new Character(name);
        cha.add(c);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCList) {
            jteC.setText("");
            for (Character c : cha) {
                System.out.println(c);
                jteC.append("\n" + c.toString() + "\n");
            }
        }
        if (e.getSource() == btnLList) {
            jteL.setText("");
            for (Location l:loc) {
                System.out.println(l);
                jteL.append("\n" + l.toString() + "\n");
            }
        }
        if (e.getSource() == btnCClear) {
            jteC.setText("");
        }
        if (e.getSource() == btnLClear) {
            jteL.setText("");
        }
        if (e.getSource() == btnCAdd) {
            add_cha();
        }
    }
}
