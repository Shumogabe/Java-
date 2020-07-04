package ILY;

import java.awt.Color;
import java.util.Random;

import javax.swing.Timer;

public class P {
	private final Color colors[] = {
	        Color.green, Color.white,
	    };
		
	private void Bit() {
		Random bit = new Random();
	}
		private int bit[];
		private float estroke[];
	    private double maxSize = 0;
	    private final int NUMBER_OF_ELLIPSES = 25;
	    private final int DELAY = 30;
	    private final int INITIAL_DELAY = 150;    
	    private Timer timer;
	 
	    public P() {
	 
	        Background();
	        initEllipses();
	        initTimer();
	    }
	private void Background() {
		 
        setBackground(Color.black);
        bit = new Ellipse2D.Float[NUMBER_OF_ELLIPSES];
        bit = new int[ellipses.length];
        estroke = new float[ellipses.length];
    }
	private void initEllipses() {
		 
	    int w = 350;
	    int h = 250;
	             
	    maxSize = w / 10;
	     
	    for (int i = 0; i < ellipses.length; i++) {
	         
	        ellipses[i] = new Ellipse2D.Float();
	        posRandEllipses(i, maxSize * Math.random(), w, h);
	    }
	}
	private void initTimer() {
		 
        timer = new Timer(DELAY, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }
	public static void main(String[] args) {
		System.out.print("0101011010101011011010\n");
		System.out.print("01010110101010110101010101\n");
		System.out.print("0101011010101011010101010101\n");
		System.out.print("010101                0101011\n");
		System.out.print("010100                 1010101\n");
		System.out.print("010101                  001010\n");
		System.out.print("010101                  101101\n");
		System.out.print("010101                 010101\n");
		System.out.print("010101                010100\n");
		System.out.print("010101101010101101010101110\n");
		System.out.print("010101101010101101010110\n");
		System.out.print("010101010101010010001\n");
		System.out.print("010111\n");
		System.out.print("010010\n");
		System.out.print("010101\n");
		System.out.print("010100\n");
		System.out.print("010101\n");
		System.out.print("100110\n");
		System.out.print("010010\n");
	}
}
