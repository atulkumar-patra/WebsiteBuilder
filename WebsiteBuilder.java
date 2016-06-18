package websitebuilder;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kris.kelley
 */
public class WebsiteBuilder {

    public static void frame() {
        JTextField numguests = new JTextField(8);
        JFrame frame = new JFrame("WebSite Builder");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("test");
        JLabel label2 = new JLabel("Html");
        JButton button = new JButton();

        button.setText("Press me");
        panel.add(label);
        panel.add(label2);
        panel.setAlignmentX(50);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.add(numguests);

    }

    public static void Htmlwriter() throws IOException {
        String fileName;
        fileName = "index";
        File file = new File("\\\\eawphx.edatwork.com\\profile$\\kris.kelley\\Desktop\\test\\" + fileName + ".html");
        // creates the file
        file.createNewFile();
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        // Writes the content to the file
        writer.write("<!doctype html>\n\n");
        writer.write("<html lang=\"en\">\n");
        writer.write("<head>\n");
        writer.write("<link rel=stylesheet href=\"main.css\"</link>\n");
        writer.write("<body>\n");
        writer.write("<p>\n" + "</p>\n");
        writer.write("</body>\n");
        writer.write("</html>\n");
        writer.flush();
        writer.close();
    }

    public static void CSSwriter() throws IOException {
        String fileName;
        fileName = "main";
        File file = new File("\\\\eawphx.edatwork.com\\profile$\\kris.kelley\\Desktop\\test\\" + fileName + ".css");
        // creates the file
        file.createNewFile();
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        // Writes the content to the file
        writer.write("*{background-color: aquamarine;\n" + " " + "}\n");
        writer.write("body{\n}\n");
        writer.write("p{background-color:blue;}");

        writer.flush();
        writer.close();
    }

    //public static void reader() throws IOException{
    //  try ( //Creates a FileReader Object
    //      FileReader fr = new FileReader()) {
    //    char [] a = new char[50];
    //fr.read(a); // reads the content to the array
    //for(char c : a)
    //    System.out.print(c); //prints the characters one by one
    //}
    //}
    public static void main(String[] args) throws FileNotFoundException, IOException {
        frame();
        //Htmlwriter();
        //CSSwriter();

    }

}
