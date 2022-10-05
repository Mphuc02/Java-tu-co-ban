package t94_Hien_thi_hinh_anh_va_icon;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class view extends JFrame
{
 	public view()
	{
		this.setTitle("Gundam");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set icon cho JFrame
		URL url_icon = main.class.getResource("gundam.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url_icon);
		this.setIconImage(img);
		
		JMenuBar jmnb = new JMenuBar();
		JMenu jmn = new JMenu("File");
		JMenuItem jmni_openFile = new JMenuItem("Open File");
		jmni_openFile.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main.class.getResource("gundam.png")) ) );
		jmn.add(jmni_openFile);
		jmnb.add(jmn);
		
		JLabel jlb = new JLabel();
		jlb.setIcon(new ImageIcon( Toolkit.getDefaultToolkit().createImage(main.class.getResource("1.jpg"))));
		
		this.setJMenuBar(jmnb);
		this.setLayout(new BorderLayout());
		this.add(jlb, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
