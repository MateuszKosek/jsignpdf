package net.sf.jsignpdf;

import java.awt.Component;
import java.awt.Dimension;

/**
 * Helper class for swing GUI (window, component) manipulation
 * 
 * @author Josef Cacek
 */
public class GuiUtils {

	/**
	 * Locates the given component on the screen's center.
	 * 
	 * @param component
	 *            the component to be centered
	 */
	public static void centerWindow(Component component) {
		final Dimension paneSize = component.getSize();
		final Dimension screenSize = component.getToolkit().getScreenSize();
		component.setLocation((screenSize.width - paneSize.width) / 2,
				(int) ((screenSize.height - paneSize.height) * 0.45));
	}
}