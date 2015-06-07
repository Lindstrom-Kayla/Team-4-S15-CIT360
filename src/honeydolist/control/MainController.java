/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honeydolist.control;

import honeydolist.view.LoginView;

/**
 *
 * @author SexyMama
 */
public class MainController {

    public static void main(String args[]) {
        LoginView loginView = new LoginView();
        
                try {
            java.awt.EventQueue.invokeLater(() -> {
                new LoginView().setVisible(true);
            });

        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (loginView != null) {
                loginView.dispose();
            }
        }
    }
}
