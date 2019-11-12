/**
 * 
 */
package ini;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.escolav2.admin.aluno.controller.AlunoAdminController;

/**
 * @author Admin
 *
 */
public class Escolav1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new AlunoAdminController();
				

	}

}
