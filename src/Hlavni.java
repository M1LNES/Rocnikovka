import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.PaintEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Hlavni extends JFrame{ 
	
//	Image[] tiles = new Image[10];
//
//	
//	   String[] tileNames= { "img\\cobble.jpg", "img\\lava.png","img\\zed2.jpg","img\\olava1.png"};
//	   BufferedImage[] tiles= new BufferedImage[ tileNames.length ];
//	    for(int i=0;i<tileNames.length ;i++) {tiles[i]=ImageIO.read(new File(tileNames[i])); }
	
	
	
	int TileSize = 60;
	Panel panel;
	
	
	
	
	    
	public void paintComponent(Graphics g) {
	    super.paintComponents(g);
	  	setSize(1920, 1080);
        setTitle("Hra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new Panel();
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	    
	    Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
       
        
        
        
        repaint();

}
	class Panel extends JPanel{

	
		private static final long serialVersionUID = 1L;
		
		public Dimension getPreferredSize() {
	        return new Dimension(1920,1080);
	    }
		

        
	}
}