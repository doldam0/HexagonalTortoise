package com.hextortoise.buttons;

import com.hextortoise.frames.MainFrame;

/**
 * This SourceButton class implements the source buttons
 * which are the buttons on the right side of this game.
 *
 * @author Chun Sae Hun
 */
public class SourceButton extends NumberedButton {
	public SourceButton(final int i, final MainFrame main) {
		super(i);
		final SourceButton that = this;
		this.addActionListener(e -> main.select(that));
	}
}
