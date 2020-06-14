package com.hextortoise.buttons;

import com.hextortoise.frames.MainFrame;

public class DestinationButton extends NumberedButton {
	public DestinationButton(final MainFrame mainFrame) {
		this.addActionListener(e -> {
			final SourceButton selected = mainFrame.getSelected();
			if (selected != null && this.getNumber() == 0) {
				this.setNumber(selected.getNumber());
				if (!mainFrame.isTortoiseValid()) {
					mainFrame.correctLabel.setVisible(false);
					mainFrame.wrongLabel.setVisible(true);
					this.setNumber(0);
				} else {
					mainFrame.correctLabel.setVisible(true);
					mainFrame.wrongLabel.setVisible(false);
					selected.setVisible(false);
					mainFrame.calcSum();
				}
			}
		});
	}
}
