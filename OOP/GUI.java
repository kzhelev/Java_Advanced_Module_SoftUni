import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI implements ActionListener {

    private JButton button;

    public GUI() {

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JButton button = new JButton("Select file");
        button.addActionListener(button.getAction());

        jFrame.add(button);

        jFrame.setSize(400,200);
        jFrame.setLocation(600,300);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Christian\\Desktop\\New folder"));
        }
    }
}
