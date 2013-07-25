package view;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;


public class Main {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell windowTracker = new Shell();
		windowTracker.setSize(450, 300);
		windowTracker.setText("Tracker");
		
		Menu menu = new Menu(windowTracker, SWT.BAR);
		windowTracker.setMenuBar(menu);
		
		MenuItem menuFile = new MenuItem(menu, SWT.CASCADE);
		menuFile.setText("Soubor");
		
		Menu menu_1 = new Menu(menuFile);
		menuFile.setMenu(menu_1);
		
		MenuItem menuSetting = new MenuItem(menu, SWT.NONE);
		menuSetting.setText("Nastaven\u00ED");

		windowTracker.open();
		windowTracker.layout();
		while (!windowTracker.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
