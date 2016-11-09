package view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Vue {

  public static void main(String[] args) {
    JFrame f = new JFrame("affichge");
    JPanel pannel = new JPanel();

    JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);



    JPanel onglet1_1 = new JPanel();
    onglet1_1.setLayout(new GridLayout(1, 3));//l,c

    JLabel txtparam =new JLabel("configuration :");
    onglet1_1.add(txtparam);

    ButtonGroup bg2 = new ButtonGroup();
    JRadioButton param_auto = new JRadioButton("automatique");
    JRadioButton param_man = new JRadioButton("manuel");
    // ajout des boutons radio dans le groupe bg
    bg2.add(param_auto);
    bg2.add(param_man);
    onglet1_1.add(param_auto);
    onglet1_1.add(param_man);



    JPanel onglet1_2 = new JPanel();
    onglet1_2.setLayout(new GridLayout(4, 3));

    JLabel txtprox =new JLabel("utiliser un proxy ?");
    onglet1_2.add(txtprox);

    ButtonGroup bg = new ButtonGroup();
    JRadioButton proxy_oui = new JRadioButton("oui");
    JRadioButton proxy_non = new JRadioButton("non");
    // ajout des boutons radio dans le groupe bg
    bg.add(proxy_oui);
    bg.add(proxy_non);
    onglet1_2.add(proxy_oui);
    onglet1_2.add(proxy_non);

    JLabel txtproxy = new JLabel("addresse proxy : ");
    onglet1_2.add(txtproxy);

    JTextField proxy = new JTextField("");
    onglet1_2.add(proxy);

    JLabel bricolage = new JLabel("");
    onglet1_2.add(bricolage);

    JLabel txtport = new JLabel("port : ");
    onglet1_2.add(txtport);

    JSpinner port = new JSpinner();
    onglet1_2.add(port);

    JLabel bricolage0 = new JLabel("");
    onglet1_2.add(bricolage0);

    JLabel bricolage1 = new JLabel("");
    onglet1_2.add(bricolage1);

    JLabel bricolage2 = new JLabel("");
    onglet1_2.add(bricolage2);

    JButton valide = new JButton("Start");
    onglet1_2.add(valide);


    JPanel onglet1_G = new JPanel();
    onglet1_G.setLayout(new GridLayout(2, 1));//l,c

    onglet1_G.add(onglet1_1);
    onglet1_G.add(onglet1_2);

    onglets.addTab("Proxy", onglet1_G);

    JPanel onglet2 = new JPanel();
    JLabel contenu_onglet2 = new JLabel("Onglet 2");
    onglet2.add(contenu_onglet2);
    onglets.addTab("affichage", onglet2);

    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;
    JRadioButtonMenuItem rbMenuItem;
    JCheckBoxMenuItem cbMenuItem;

    //Create the menu bar.
    menuBar = new JMenuBar();

    //Build the first menu.
    menu = new JMenu("Menu");
    menu.getAccessibleContext().setAccessibleDescription(
            "The only menu in this program that has menu items");
    menuBar.add(menu);


    //a group of JMenuItems
    submenu = new JMenu("Fichier");
    submenu.setMnemonic(KeyEvent.VK_S);

    menuItem = new JMenuItem("Ouvrir");
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_2, ActionEvent.ALT_MASK));
    submenu.add(menuItem);

    menuItem = new JMenuItem("Enregistrer");
    submenu.add(menuItem);
    menu.add(submenu);

    menuItem = new JMenuItem("help",
                             KeyEvent.VK_T);
    menuItem.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_1, ActionEvent.ALT_MASK));
    menuItem.getAccessibleContext().setAccessibleDescription(
            "This doesn't really do anything");
    menu.add(menuItem);

    f.setJMenuBar(menuBar);

    onglets.setOpaque(true);
    pannel.add(onglets);
    f.getContentPane().add(pannel);
    f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.pack();
  }
}
