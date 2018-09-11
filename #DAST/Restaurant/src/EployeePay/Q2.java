package newGui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Q2 {

    public Q2() {
        JFrame Frame = new JFrame();
        Frame.setTitle("Q2");

        Frame.setSize(600, 400);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        JTabbedPane tabs = new JTabbedPane();

        Frame.getContentPane().add(tabs);

        tabs.add("Manger", new MangerCal());
        tabs.add("Hourly Workers", new HourlyWorkers());
        tabs.add("Commission Worker", new CommissionWorkers());
        tabs.add("Piece Workers", new PieceWorkers());
        Frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }

}
