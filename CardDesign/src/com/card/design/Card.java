package com.card.design;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card {

	private String faceName, suite;
	private int faceValue;
	private BufferedImage cardImage;

	public Card(String faceName, String suite, int faceValue, BufferedImage cardImage) {
		super();
		this.faceName = faceName;
		this.suite = suite;
		this.faceValue = faceValue;
		this.cardImage = cardImage;
	}

	public BufferedImage getCardImage() {
		return cardImage;
	}

	public void setCardImage(BufferedImage cardImage) {
		this.cardImage = cardImage;
	}

	public static void main(String[] args) throws IOException {

		Card AceofHearts = new Card("Ace", "Hearts", 14, ImageIO.read(new File("S:\\selenium tuto\\Poker\\AH.png")));
		System.out.println("Build Sucess");

		JFrame window = new JFrame("Dispay the Card");
		window.setSize(700, 900);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPanel = new JPanel(new BorderLayout());

		JLabel cardLabel = new JLabel(new ImageIcon(AceofHearts.getCardImage()));
		contentPanel.add(cardLabel);
		window.add(contentPanel);
		window.setVisible(true);
		
	}

}
