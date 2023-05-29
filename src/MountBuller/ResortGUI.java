package MountBuller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ResortGUI extends JFrame implements ActionListener {
    private DefaultListModel<String> accommodationsListModel;
    private DefaultListModel<String> customersListModel;
    private DefaultListModel<String> packagesListModel;

    private JList<String> accommodationsList;
    private JList<String> customersList;
    private JList<String> packagesList;

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField durationField;

    private ArrayList<Accommodation> accommodations;
    private ArrayList<Customer> customers;
    private ArrayList<TravelPackage> travelPackages;

    public ResortGUI() {
        // Initialize the lists
        accommodationsListModel = new DefaultListModel<>();
        customersListModel = new DefaultListModel<>();
        packagesListModel = new DefaultListModel<>();

        accommodationsList = new JList<>(accommodationsListModel);
        customersList = new JList<>(customersListModel);
        packagesList = new JList<>(packagesListModel);

        // Create some initial accommodations
        accommodations = new ArrayList<>();
        accommodations.add(new Accommodation("Standard Room", AccommodationType.ROOM, 100));
        accommodations.add(new Accommodation("Deluxe Room", AccommodationType.ROOM, 150));
        accommodations.add(new Accommodation("Family Suite", AccommodationType.SUITE, 200));
        accommodations.add(new Accommodation("Chalet", AccommodationType.COTTAGE, 250));
        accommodations.add(new Accommodation("Penthouse", AccommodationType.APARTMENT, 300));
        accommodations.add(new Accommodation("Ski Lodge", AccommodationType.LODGE, 350));
        accommodations.add(new Accommodation("Mountain Cabin", AccommodationType.COTTAGE, 150));
        accommodations.add(new Accommodation("Luxury Villa", AccommodationType.VILLA, 500));
        accommodations.add(new Accommodation("Ski-in/Ski-out Apartment", AccommodationType.APARTMENT, 400));
        accommodations.add(new Accommodation("Executive Suite", AccommodationType.SUITE, 300));

        // Create some initial customers
        customers = new ArrayList<>();
        customers.add(new Customer("John", "Doe", 1));
        customers.add(new Customer("Jane", "Smith", 2));
        customers.add(new Customer("Michael", "Johnson", 3));

        // Initialize the travel packages list
        travelPackages = new ArrayList<>();

        // Set up the GUI
        setTitle("Resort Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());

        // Accommodations Panel
        JPanel accommodationsPanel = new JPanel();
        accommodationsPanel.setLayout(new BoxLayout(accommodationsPanel, BoxLayout.Y_AXIS));
        accommodationsPanel.setBorder(BorderFactory.createTitledBorder("Accommodations"));

        JScrollPane accommodationsScrollPane = new JScrollPane(accommodationsList);
        accommodationsScrollPane.setPreferredSize(new Dimension(250, 200));
        accommodationsPanel.add(accommodationsScrollPane);

        JButton viewImageBtn = new JButton("View Image");
        viewImageBtn.addActionListener(this);
        accommodationsPanel.add(viewImageBtn);

        // Customers Panel
        JPanel customersPanel = new JPanel();
        customersPanel.setLayout(new BoxLayout(customersPanel, BoxLayout.Y_AXIS));
        customersPanel.setBorder(BorderFactory.createTitledBorder("Customers"));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(10);
        customersPanel.add(firstNameLabel);
        customersPanel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(10);
        customersPanel.add(lastNameLabel);
        customersPanel.add(lastNameField);

        JButton addCustomerBtn = new JButton("Add Customer");
        addCustomerBtn.addActionListener(this);
        customersPanel.add(addCustomerBtn);

        JScrollPane customersScrollPane = new JScrollPane(customersList);
        customersScrollPane.setPreferredSize(new Dimension(250, 200));
        customersPanel.add(customersScrollPane);

        // Travel Packages Panel
        JPanel packagesPanel = new JPanel();
        packagesPanel.setLayout(new BoxLayout(packagesPanel, BoxLayout.Y_AXIS));
        packagesPanel.setBorder(BorderFactory.createTitledBorder("Travel Packages"));

        JLabel durationLabel = new JLabel("Duration (in days):");
        durationField = new JTextField(10);
        packagesPanel.add(durationLabel);
        packagesPanel.add(durationField);

        JButton createPackageBtn = new JButton("Create Package");
        createPackageBtn.addActionListener(this);
        packagesPanel.add(createPackageBtn);

        JScrollPane packagesScrollPane = new JScrollPane(packagesList);
        packagesScrollPane.setPreferredSize(new Dimension(250, 200));
        packagesPanel.add(packagesScrollPane);

        // Add panels to the main frame
        add(accommodationsPanel);
        add(customersPanel);
        add(packagesPanel);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add Customer")) {
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();

            try {
                int customerId = customers.size() + 1; // Generate unique customer ID
                Customer customer = new Customer(firstName, lastName, customerId);
                customers.add(customer);
                customersListModel.addElement(customer.toString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid customer ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getActionCommand().equals("Create Package")) {
            try {
                int duration = Integer.parseInt(durationField.getText().trim());
                if (duration <= 0) {
                    throw new NumberFormatException();
                }

                ArrayList<Accommodation> selectedAccommodations = new ArrayList<>();
                for (int index : accommodationsList.getSelectedIndices()) {
                    selectedAccommodations.add(accommodations.get(index));
                }

                if (selectedAccommodations.isEmpty()) {
                    throw new IllegalArgumentException("Please select at least one accommodation.");
                }

                int packageId = travelPackages.size() + 1; // Generate unique package ID
                TravelPackage travelPackage = new TravelPackage(packageId, duration, selectedAccommodations);
                travelPackages.add(travelPackage);
                packagesListModel.addElement(travelPackage.toString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid duration", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getActionCommand().equals("View Image")) {
            int selectedIndex = accommodationsList.getSelectedIndex();
            if (selectedIndex >= 0) {
                Accommodation accommodation = accommodations.get(selectedIndex);
                // Display image logic here
                JOptionPane.showMessageDialog(this, "Viewing image for: " + accommodation.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Please select an accommodation", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ResortGUI resortGUI = new ResortGUI();
            resortGUI.setVisible(true);
        });
    }
}
}