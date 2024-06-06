package controler;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ICon {
	public static ImageIcon designIcon(String url, int width, int hight) {
		ImageIcon originalIcon  = new ImageIcon(url);
		Image image = originalIcon.getImage();
		Image newImage = image.getScaledInstance(width, hight, image.SCALE_SMOOTH);
		ImageIcon editIcon = new ImageIcon(newImage);
		return editIcon;
	}
}
