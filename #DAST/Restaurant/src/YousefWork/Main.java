
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {

    private String userName;

    private boolean login(String name, String password) {
        try {
            boolean check = true;
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {

                String[] info = sc.nextLine().split("'");
                if (name.equals(info[0]) && password.equals(info[1])) {
                    return true;
                }
            };
            return false;
        } catch (FileNotFoundException e) {
            System.exit(0);
            return false;
        }
    }
    private JFrame Frame = new JFrame();
    private File file;
    protected static String cv;
    protected static Scanner f;
    private JPanel Login = new JPanel();
    private JLabel NameLabel = new JLabel("Name : ");
    private JTextField Name = new JTextField(20);
    private JLabel PasswordLabel = new JLabel("Password: ");
    private JPasswordField Password = new JPasswordField(20);
    private JButton Submit = new JButton("Login");
    private JLabel Result = new JLabel();
    private JLabel fileLabel = new JLabel("File location : ");
    private JTextField fileLocation = new JTextField(30);

    public Main() {
        file = new File("C:\\Users\\Yousef\\Desktop\\JAVA\\OOPA2\\DB.txt");

        Login.setLayout(new GridBagLayout());
        GridBagConstraints xy = new GridBagConstraints();
        xy.gridx = 0;
        xy.gridy = 0;
        Login.add(NameLabel, xy);
        xy.gridx = 1;
        xy.gridy = 0;
        Login.add(Name, xy);
        xy.gridx = 0;
        xy.gridy = 1;
        Login.add(PasswordLabel, xy);
        xy.gridx = 1;
        xy.gridy = 1;
        Login.add(Password, xy);
        xy.gridx = 0;
        xy.gridy = 2;
        Login.add(fileLabel, xy);
        xy.gridx = 1;
        xy.gridy = 2;
        Login.add(fileLocation, xy);
        xy.gridx = 1;
        xy.gridy = 3;
        xy.fill = 2;
        Login.add(Submit, xy);
        xy.gridx = 1;
        xy.gridy = 6;
        xy.fill = 2;
        Login.add(Result, xy);
        Frame.add(Login);

        Login.setVisible(true);
        Frame.setSize(600, 400);
        Frame.setVisible(true);
        Submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    f = new Scanner(new File(fileLocation.getText()));
                    cv = fileLocation.getText();
                    if (login(Name.getText(), Password.getText())) {
                        Login.setVisible(false);
                        Frame.remove(Login);

                        userName = Name.getText();
                        JLabel WelcomeLabel = new JLabel("Welcome Mr " + userName);
                        Frame.add(WelcomeLabel, BorderLayout.NORTH);
                        JTabbedPane tabs = new JTabbedPane();
                        tabs.add("Add questions", new AddQuestion());
                        tabs.add("Edit questions", new EditQuestions());

                        tabs.setSize(400, 400);
                        tabs.setVisible(true);

                        Frame.getContentPane().add(tabs, BorderLayout.CENTER);
                    } else {
                        Result.setForeground(Color.red);
                        Result.setText("Incorrect name or password");
                    };
                } catch (FileNotFoundException e) {
                    Result.setForeground(Color.red);
                    Result.setText("File not found");
                }

            }
        });

    }

    public static void main(String[] args) {
        new Main();
    }

}
