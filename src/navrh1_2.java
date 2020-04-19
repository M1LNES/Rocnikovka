import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

 //32x18

public class navrh1_2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static BufferedImage cobble,lava,zed,cobblelava,dvere,zombie,mrtvola,krev,health_potion,shield;
	JPanel panel = new JPanel();
	public navrh1_2() throws IOException {
		
		super();
//		JFrame okno = new JFrame();
        setSize(1920, 1080);
//        okno.setVisible(true);
        setTitle("Hra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        FlowLayout layout = new FlowLayout();

        panel = new Panel();
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setVisible(true);
	    
        cobble = ImageIO.read(new File("cobble1.jpg"));
        lava = ImageIO.read(new File("lava1.png")); 
        zed = ImageIO.read(new File("zed2.jpg")); 
        cobblelava = ImageIO.read(new File("olava1.png")); 
        dvere =  ImageIO.read(new File("dvere1.png"));
        zombie = ImageIO.read(new File("zombik.png"));
        mrtvola = ImageIO.read(new File("mrtvola.png"));
        krev = ImageIO.read(new File("krev.png"));
        health_potion = ImageIO.read(new File("health.png"));
        shield = ImageIO.read(new File("shield.png"));
	}
	
    public static void main(String[] args) throws IOException {
    	new navrh1_2();
    }
    
    class Panel extends JPanel{

    	Graphics2D biG2D;
     /**
    	 * 
    	 */
    	 public Dimension getPreferredSize() {
    	        return new Dimension(1920,1080);
    	    }
    	private static final long serialVersionUID = 1L; 
    	public void paintComponent(Graphics g) {
    		// TODO Auto-generated method stub

    		super.paintComponents(g);
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
                 
            
            
            /*Mapa*/
            for(int i=0;i<=1920;i = i +60) {
          	g2.drawImage(Mapa1.zed,0+i,0,60,60, null);
            }
            for(int i=0;i<=1920;i = i +60) {
              	g2.drawImage(Mapa1.zed,0+i,960,60,60, null);
            }
            for(int i=0;i<=1080;i = i +60) {
              	g2.drawImage(Mapa1.zed,0,0+i,60,60, null);
            }
            for(int i=0;i<=1080;i = i +60) {
              	g2.drawImage(Mapa1.zed,1860,0+i,60,60, null);
            }
            
            for(int i=0; i<=840;i = i + 60) {
            	
            	for(int o = 0; o<=1740; o = o +60) {
            	g2.drawImage(Mapa1.cobble, 60+o,60+i,60,60,null);
            }
            }
           /*Dve lavy nahore*/
            	for(int u = 0; u <= 1500; u = u + 1500) {
            g2.drawImage(Mapa1.lava, 180+u, 180, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava,120+u, 120,60,60,null);
            g2.drawImage(Mapa1.cobblelava,180+u, 120,60,60,null);
            g2.drawImage(Mapa1.cobblelava,120+u, 180,60,60,null);
            g2.drawImage(Mapa1.cobblelava,240+u, 180,60,60,null);
            g2.drawImage(Mapa1.cobblelava,240+u, 240,60,60,null);
            g2.drawImage(Mapa1.cobblelava,240+u, 120,60,60,null);
            g2.drawImage(Mapa1.cobblelava,120+u, 240,60,60,null);
            g2.drawImage(Mapa1.cobblelava,180+u, 240,60,60,null);
            	}
            
            g2.drawImage(Mapa1.lava, 180, 180, 60, 60, null);
            g2.drawImage(Mapa1.dvere, 930, 0, 60, 60, null);
            g2.drawImage(Mapa1.dvere, 590, 0, 60, 60, null);
            g2.drawImage(Mapa1.dvere, 1270, 0, 60, 60, null);
            g2.drawImage(Mapa1.dvere, 1610, 0, 60, 60, null);
            g2.drawImage(Mapa1.dvere, 250, 0, 60, 60, null);
            
            
            g2.drawImage(Mapa1.zombie, 1320, 420, 60,60,null);
            g2.drawImage(Mapa1.zombie, 660, 840, 60,60,null);
            g2.drawImage(Mapa1.zombie, 1800, 660, 60,60,null);
            g2.drawImage(Mapa1.zombie, 480, 240, 60,60,null);
            
            g2.drawImage(Mapa1.zombie, 180, 420, 60,60,null);
            g2.drawImage(Mapa1.zombie, 240, 540, 60,60,null);
            g2.drawImage(Mapa1.zombie, 1200, 120, 60,60,null);
            g2.drawImage(Mapa1.zombie, 900, 60, 60,60,null);
            
            /* Lava vlevo dole*/
            g2.drawImage(Mapa1.lava, 120, 900, 60, 60, null);
            g2.drawImage(Mapa1.lava, 180, 900, 60, 60, null);
            g2.drawImage(Mapa1.lava, 60, 900, 60, 60, null);
            g2.drawImage(Mapa1.lava, 60, 840, 60, 60, null);
            g2.drawImage(Mapa1.lava, 60, 780, 60, 60, null);
            g2.drawImage(Mapa1.lava, 120, 840, 60, 60, null);
            
            g2.drawImage(Mapa1.cobblelava, 60, 720, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 120, 780, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 180, 840, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 240, 900, 60, 60, null);
            
            /*ØEKA*/
            g2.drawImage(Mapa1.lava, 1200, 840, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1200+60, 840, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1200-60, 840, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1140, 900, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1140+60, 900, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1140-60, 900, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1200, 780, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1200+60, 780, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1200-60, 780, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1260, 720, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1260+60, 720, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1260-60, 720, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1320, 660, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1320+60, 660, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1320-60, 660, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1380, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1380-60, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1380, 540, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1440, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1440, 600+60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1440, 600-60, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1500, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1500, 600+60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1500, 600-60, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1560, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1560, 600+60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1560, 600-60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1620, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1620, 600-60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1620, 600+60, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1680, 600, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1680, 600-60, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1740, 540, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1740+60, 540, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1740, 540+60, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1800, 480, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1800-60, 480, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1800-60, 420, 60, 60, null);
            g2.drawImage(Mapa1.lava, 1800, 420, 60, 60, null);
            g2.drawImage(Mapa1.cobblelava, 1800, 420-60, 60, 60, null);
           /*KREV na støedu*/
            g2.drawImage(Mapa1.krev,900,480,60,60,null);
            g2.drawImage(Mapa1.krev,960,480,60,60,null);
            g2.drawImage(Mapa1.krev,960,540,60,60,null);
            g2.drawImage(Mapa1.krev,900,540,60,60,null);
            
            /*Sloupy uprostred*/
            g2.drawImage(Mapa1.zed,780,360,60,60,null);
            g2.drawImage(Mapa1.zed,780,660,60,60,null);
            g2.drawImage(Mapa1.zed,1080,360,60,60,null);
            g2.drawImage(Mapa1.zed,1080,660,60,60,null);
           
            g2.drawImage(Mapa1.mrtvola, 930, 510, 60, 60, null);
            
            
            g2.drawImage(Mapa1.zed,1500,840,60,60,null);
            g2.drawImage(Mapa1.zed,1500,900,60,60,null);
            g2.drawImage(Mapa1.zed,1500,780,60,60,null);
            g2.drawImage(Mapa1.zed,1500,720,60,60,null);
            g2.drawImage(Mapa1.zed,1560,720,60,60,null);
            g2.drawImage(Mapa1.zed,1620,720,60,60,null);
            g2.drawImage(Mapa1.zed,1740,720,60,60,null);
            g2.drawImage(Mapa1.zed,1800,720,60,60,null);
            
            g2.drawImage(Mapa1.health_potion,1620,900,60,60,null);
            g2.drawImage(Mapa1.shield,1740,900,60,60,null);
            
            repaint();
    	
            
            
	
}
}
    
}

	
/*
Trida Hlavni
- vytvori si platno, g2, bla bla bla srack
- zavola Map mapa1 = new Mapa(cestaNaSoubor);
- mapa1.vykresli(g2);

Trida Mapa
- atributy listPozic
- cesty na obrazky
-konstruktor Map(cestaNaSoubor){
  - listPozic = new List<Pozice>()
  -prochazeniSouboru
  -listPozic.add(new Pozice( soubor.x, soubor.y, soubor.element ));
}
- metoda vykresli(g2){
  -prochazi listPozic
  - g2.drawImage(pozice.getElement(), pozice.getX(), pozice.getY(), sizeX, sizeY );
}


Trida Pozice
- atributy x, y, element
- konstruktor Pozice(x, y, element)*/
