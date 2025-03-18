import java.awt.*;
import javax.swing.*;


public class HomePage{
    public static void main(String[] args){

        JFrame home = new JFrame("JWeb Browser");
        JLabel browser_name = new JLabel("Welcome to JWeb Browser!",JLabel.CENTER);
        JPanel home_panel = new JPanel();
        GroupLayout home_layout = new GroupLayout(home_panel);
        JButton search = new JButton("Search");
        TextField address_bar = new TextField(16);
        home_panel.setLayout(home_layout);

        home_layout.setAutoCreateGaps(true);
        home_layout.setAutoCreateContainerGaps(true);

        GroupLayout.ParallelGroup hGroup = home_layout.createParallelGroup();
        hGroup.addGroup(home_layout.createSequentialGroup().
                addComponent(address_bar).addComponent(search));
        hGroup.addGroup(home_layout.createSequentialGroup().addGap(150).
                addComponent(browser_name));
        home_layout.setHorizontalGroup(hGroup);

        GroupLayout.SequentialGroup vGroup = home_layout.createSequentialGroup();
        vGroup.addGroup(home_layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
                addComponent(address_bar,30,30,30).addComponent(search));
        vGroup.addGroup(home_layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
                addGap(180));
        vGroup.addGroup(home_layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
                addComponent(browser_name));
        home_layout.setVerticalGroup(vGroup);

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.add(home_panel);
        home.setSize(500,500);
        home.show();

    }
}