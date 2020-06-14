package com.hextortoise.panels;

import com.hextortoise.utils.Util;

import javax.swing.*;
import java.awt.*;

/**
 * This BackgroundPanel class implements the panel which can show the background.
 *
 * @author Jang Jin Woo
 */
public class BackgroundPanel extends JPanel {
	ImageIcon img;

	public BackgroundPanel(String backgroundName) {
		img = new ImageIcon(Util.getResourcesPath(backgroundName));
		setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}
