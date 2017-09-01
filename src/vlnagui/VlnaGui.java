/*
 * VlnaGui.java
 *
 * Created on 4. červen 2008, 22:40
 */

package vlnagui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author  WhiteHat
 */
public class VlnaGui extends javax.swing.JFrame {
    
    /** Creates new form VlnaGui */
    public VlnaGui() {
        initComponents();
	
	chb_zalohy.setToolTipText("Pokud je výstupní adresář shodný se vstupním tak se soubory přepisují. Program vytváří zálohy originálních souborů s koncovkou .te~. To lze zrušit touto volbou. NEDOPORUČUJI.");
	chb_shutdown.setToolTipText("Po dokončení vlnkování se program sám vypne");
	chb_math.setToolTipText("Ignoruje přechody do matematického režimu ($...$ a $$...$$) a vlnkuje i v těchto prostředích. Imlicitně v matematických prostředích nevlnkuje.");
	chb_verbatim.setToolTipText("Ignoruje přechody do verbatim režimu (\\verb<zn>...<zn>, \\begtt...\\endtt) a vlnkuje i v těchto prostředích.");
	chb_latex.setToolTipText("K sekvencím ohraničující display math mód je přidáno \\begin{display}...\\end{display} a \\begin{equation}...\\end{equation}. K sekvencím ohraničující verbatim mód je přidáno \\begin{verbatim}...\\end{verbatim}");
	chb_web.setToolTipText("K sekvencím ohraničujícím verbatim mód je přidáno @< nebo @d ... @* nebo @mezera nebo @>|. To způsobí, že není provlnkovaný kód programu ve web souborech, ale jenom komentáře.");
    }
    
    /** app icon */
    @Override
    public Image getIconImage() {
        Image icon = Toolkit.getDefaultToolkit().getImage("C:/doc/WhiteHat/Dokumenty/NetBeansProjects/vlnaGUI/src/icons/vlna.png");
        return icon;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fCh = new javax.swing.JFileChooser();
        aboutBox = new javax.swing.JDialog();
        heading = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        label_verze = new javax.swing.JLabel();
        info_verze = new javax.swing.JLabel();
        label_autor = new javax.swing.JLabel();
        info_autor = new javax.swing.JLabel();
        label_homepage = new javax.swing.JLabel();
        info_homepage = new javax.swing.JLabel();
        button_vlnkuj = new javax.swing.JButton();
        panel_soubor = new javax.swing.JPanel();
        input_soubor = new javax.swing.JTextField();
        button_soubor = new javax.swing.JButton();
        panel_moznosti = new javax.swing.JPanel();
        chb_zalohy = new javax.swing.JCheckBox();
        chb_shutdown = new javax.swing.JCheckBox();
        chb_math = new javax.swing.JCheckBox();
        chb_verbatim = new javax.swing.JCheckBox();
        chb_latex = new javax.swing.JCheckBox();
        chb_web = new javax.swing.JCheckBox();
        panel_vystup = new javax.swing.JPanel();
        input_vystup = new javax.swing.JTextField();
        button_vystup = new javax.swing.JButton();
        debug = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        menu_vlnaGUI = new javax.swing.JMenu();
        submenu_Ukoncit = new javax.swing.JMenuItem();
        menu_nastaveni = new javax.swing.JMenu();
        menu_O_programu = new javax.swing.JMenu();
        submenu_O_programu = new javax.swing.JMenuItem();
        submenu_Napoveda = new javax.swing.JMenuItem();

        aboutBox.setTitle("O programu");
        aboutBox.setMinimumSize(new java.awt.Dimension(280, 170));
        aboutBox.setModal(true);
        aboutBox.setResizable(false);

        heading.setFont(new java.awt.Font("Tahoma", 1, 18));
        heading.setText("~ vlnaGUI");

        description.setText("Grafické rozhraní pro program vlna32 Petra Olšáka.");

        label_verze.setText("verze programu:");

        info_verze.setFont(new java.awt.Font("Tahoma", 1, 11));
        info_verze.setText("0.9");

        label_autor.setText("autor:");

        info_autor.setFont(new java.awt.Font("Tahoma", 1, 11));
        info_autor.setText("Daniel Máslo");

        label_homepage.setText("homepage programu:");

        info_homepage.setFont(new java.awt.Font("Tahoma", 1, 11));
        info_homepage.setText("www.whitehat.cz/vlnagui");

        javax.swing.GroupLayout aboutBoxLayout = new javax.swing.GroupLayout(aboutBox.getContentPane());
        aboutBox.getContentPane().setLayout(aboutBoxLayout);
        aboutBoxLayout.setHorizontalGroup(
            aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(heading)
                    .addGroup(aboutBoxLayout.createSequentialGroup()
                        .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_verze)
                            .addComponent(label_autor)
                            .addComponent(label_homepage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info_homepage)
                            .addComponent(info_autor)
                            .addComponent(info_verze))))
                .addContainerGap())
        );
        aboutBoxLayout.setVerticalGroup(
            aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description)
                .addGap(18, 18, 18)
                .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_verze)
                    .addComponent(info_verze))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_autor)
                    .addComponent(info_autor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aboutBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_homepage)
                    .addComponent(info_homepage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VlnaGUI");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setResizable(false);

        button_vlnkuj.setText("Vlnkuj");
        button_vlnkuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vlnkujActionPerformed(evt);
            }
        });

        panel_soubor.setBorder(javax.swing.BorderFactory.createTitledBorder("soubor(y)"));

        button_soubor.setText("vybrat...");
        button_soubor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_souborActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_souborLayout = new javax.swing.GroupLayout(panel_soubor);
        panel_soubor.setLayout(panel_souborLayout);
        panel_souborLayout.setHorizontalGroup(
            panel_souborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_souborLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input_soubor, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(button_soubor)
                .addContainerGap())
        );
        panel_souborLayout.setVerticalGroup(
            panel_souborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_souborLayout.createSequentialGroup()
                .addGroup(panel_souborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_soubor)
                    .addComponent(input_soubor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_moznosti.setBorder(javax.swing.BorderFactory.createTitledBorder("možnosti"));

        chb_zalohy.setText("nevytvářet zálohy");

        chb_shutdown.setText("po skončení ukončit VlnaGUI");

        chb_math.setText("ignorovat MATH režim");

        chb_verbatim.setText("ignorovat VERBATIM režim");

        chb_latex.setText("LaTeX mód");

        chb_web.setText("web mód");

        javax.swing.GroupLayout panel_moznostiLayout = new javax.swing.GroupLayout(panel_moznosti);
        panel_moznosti.setLayout(panel_moznostiLayout);
        panel_moznostiLayout.setHorizontalGroup(
            panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_moznostiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_zalohy)
                    .addComponent(chb_shutdown))
                .addGap(19, 19, 19)
                .addGroup(panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_math)
                    .addComponent(chb_verbatim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chb_latex)
                    .addComponent(chb_web))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_moznostiLayout.setVerticalGroup(
            panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_moznostiLayout.createSequentialGroup()
                .addGroup(panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_zalohy)
                    .addComponent(chb_math)
                    .addComponent(chb_latex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_moznostiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_shutdown)
                    .addComponent(chb_verbatim)
                    .addComponent(chb_web))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_vystup.setBorder(javax.swing.BorderFactory.createTitledBorder("výstupní adresář"));

        button_vystup.setText("vybrat...");
        button_vystup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_vystupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_vystupLayout = new javax.swing.GroupLayout(panel_vystup);
        panel_vystup.setLayout(panel_vystupLayout);
        panel_vystupLayout.setHorizontalGroup(
            panel_vystupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_vystupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input_vystup, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(button_vystup)
                .addContainerGap())
        );
        panel_vystupLayout.setVerticalGroup(
            panel_vystupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vystupLayout.createSequentialGroup()
                .addGroup(panel_vystupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_vystup)
                    .addComponent(input_vystup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_vlnaGUI.setText("VlnaGUI");

        submenu_Ukoncit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        submenu_Ukoncit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/window_nofullscreen.png"))); // NOI18N
        submenu_Ukoncit.setText("Ukončit");
        submenu_Ukoncit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_UkoncitActionPerformed(evt);
            }
        });
        menu_vlnaGUI.add(submenu_Ukoncit);

        menubar.add(menu_vlnaGUI);

        menu_nastaveni.setText("Nastavení");
        menubar.add(menu_nastaveni);

        menu_O_programu.setText("O programu");

        submenu_O_programu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        submenu_O_programu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info.png"))); // NOI18N
        submenu_O_programu.setText("O programu");
        submenu_O_programu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_O_programuActionPerformed(evt);
            }
        });
        menu_O_programu.add(submenu_O_programu);

        submenu_Napoveda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        submenu_Napoveda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agt_support.png"))); // NOI18N
        submenu_Napoveda.setText("Nápověda");
        menu_O_programu.add(submenu_Napoveda);

        menubar.add(menu_O_programu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_moznosti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_soubor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(debug)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                        .addComponent(button_vlnkuj))
                    .addComponent(panel_vystup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_soubor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_moznosti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_vystup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_vlnkuj)
                    .addComponent(debug))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("mainFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** input files selection */
    private void button_souborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_souborActionPerformed
        final JFileChooser open = fCh;
        
        // settings
        open.setMultiSelectionEnabled(true);
        open.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        FileFilter filter = new FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".tex");
            }

            @Override
            public String getDescription() {
                //throw new UnsupportedOperationException("Jen soubory s koncovkou .tex");
                return "";
            }
        };
                
        open.setFileFilter(filter);
        
        open.showOpenDialog(open);//GEN-LAST:event_button_souborActionPerformed
        
        File[] file = open.getSelectedFiles();
        
        if (file != null) {
            String input = "";
            for (int i = 0; i < file.length; i++) {
		if (i == 0) {
		   input += file[i]; 
		}
		else {
		    input += ";"+file[i];
		}   
	    }
            input_soubor.setText(input);
        }    
    }

    /** output folder selection */
    private void button_vystupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vystupActionPerformed
        final JFileChooser save = fCh;
        
        // settings
        save.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        save.showSaveDialog(save);             

        //File file = save.getSelectedFile();
        //File file = save.getCurrentDirectory();
        File file = save.getSelectedFile().isDirectory()?save.getSelectedFile():save.getCurrentDirectory();
        
        if (file != null) {
            input_vystup.setText(file.toString());
        }
    }//GEN-LAST:event_button_vystupActionPerformed

    /** menu - O programu -> O programu */
    private void submenu_O_programuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_O_programuActionPerformed
        //JOptionPane.showMessageDialog(this, "GUI pro program vlna32 od Petra Olšáka.\nDaniel Máslo 2008, vyvinuto v NetBeans 6.01", "O programu", JOptionPane.INFORMATION_MESSAGE);               
        
        int posunX = panel_moznosti.getParent().getSize().width / 2 - aboutBox.getSize().width / 2;
        int posunY = panel_moznosti.getParent().getSize().height / 2 - aboutBox.getSize().height / 2;
        
        aboutBox.setLocation((panel_moznosti.getParent().getLocationOnScreen().x + posunX), (panel_moznosti.getParent().getLocationOnScreen().y + posunY));
                
        aboutBox.setVisible(true);	
}//GEN-LAST:event_submenu_O_programuActionPerformed

    /** menu - ukončit */
    private void submenu_UkoncitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_UkoncitActionPerformed
	System.exit(0);
    }//GEN-LAST:event_submenu_UkoncitActionPerformed

    private void button_vlnkujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_vlnkujActionPerformed
	String finalCommand = "";
	
	// validation inputs
	if (input_soubor.getText().equals("")) {
	    debug.setText("Chybí vstupní soubor(y)");
	    input_soubor.setBackground(new Color(200,50,50));
	    input_soubor.setForeground(new Color(255,255,255));
	    input_soubor.setText("Zde chybí data.");
	    input_soubor.requestFocus();
	    return;
	}
	if (input_vystup.getText().equals("")) {
	    debug.setText("Chybí výstupní adresář");
	    input_vystup.setBackground(new Color(200,50,50));
	    input_vystup.setForeground(new Color(255,255,255));
	    input_vystup.setText("Zde chybí data.");
	    input_vystup.requestFocus();
	    return;
	}	
		
	
	// files
	String[] fil = null;
	ArrayList<String> files = new ArrayList<String>();
	
	if (input_soubor.getText().contains(";")) {
	   fil = input_soubor.getText().split(";");	   
	   
	   for (int k = 0; k < fil.length; k++) {
	       files.add(fil[k]);
	   }
	} 
	else {
	   files.add(input_soubor.getText()); 	   
	}
	
	for (int i = 0; i < files.size(); i++) {	
	    
	    //System.out.println(command + " " + files[i]);
	    File fullFileName = new File(files.get(i));
	    String fileName = fullFileName.getName();

	    // path processing
	    // - all path elements must be in ""
	    // - all path separators are /
	    // - remove last / from path if exist
	    
	    // INPUT
	    String   inputFilePath = files.get(i);
	    String[] inputFilePathElements;
	    
	    if (File.separator.equals("\\")) {
		inputFilePathElements = inputFilePath.split("\\\\");
	    }
	    else {
		inputFilePathElements = inputFilePath.split(File.separator);
	    }
	    
	    inputFilePath = "";
	    
	    for (int j = 0; j < inputFilePathElements.length; j++) {
		if (j != 0) {
		    inputFilePath += "/";
		}    
		inputFilePath += "\""+inputFilePathElements[j]+"\"";		
	    }
	    
	    // input file validation
	    File inputF = new File(files.get(i));
	    System.out.println(files.get(i));
	    if (!inputF.exists()) {
		debug.setText("Vstupní soubor neexistuje");
		input_soubor.setBackground(new Color(200,50,50));
		input_soubor.setForeground(new Color(255,255,255));		
		input_soubor.requestFocus();
		return;
	    }
	    if (!files.get(i).endsWith(".tex")) {
		debug.setText("Vstupní soubor nemá koncovku .tex");
		input_soubor.setBackground(new Color(200,50,50));
		input_soubor.setForeground(new Color(255,255,255));		
		input_soubor.requestFocus();
		return;
	    }
	    
	    // OUTPUT
	    String   outputFilePath = "";
	    String[] outputFilePathElements;
	    
	    if (input_vystup.getText().endsWith(File.separator)) {
		outputFilePath = input_vystup.getText() + fileName;
	    } 
	    else {
		outputFilePath = input_vystup.getText() + File.separator + fileName;
	    }
	    
	    if (File.separator.equals("\\")) {
		outputFilePathElements = outputFilePath.split("\\\\");
	    }
	    else {
		outputFilePathElements = outputFilePath.split(File.separator);
	    }
	    
	    outputFilePath = "";
	    
	    for (int j = 0; j < outputFilePathElements.length; j++) {
		if (j != 0) {
		    outputFilePath += "/";
		}    
		outputFilePath += "\""+outputFilePathElements[j]+"\"";		
	    }
	    
	    
	    // base command
	    String command = System.getProperty("user.dir") + File.separator + "vlna32 -s";
	    
	    
	    // switchers
	    boolean backup   = chb_zalohy.isSelected();
	    boolean webMod   = chb_web.isSelected();
	    boolean latexMod = chb_latex.isSelected();
	    boolean math     = chb_math.isSelected();
	    boolean verbatim = chb_verbatim.isSelected();

	    if (backup) {
		command += " -r";	    
	    }
	    if (webMod) {
		command += " -w";	    
	    }
	    if (latexMod) {
		command += " -l";	    
	    }
	    if (math) {
		command += " -m";	    
	    }
	    if (verbatim) {
		command += " -v";	    
	    }
	    
	    	    
	    finalCommand += command;
	    
	    if (inputFilePath.equals(outputFilePath)) {
		finalCommand += " " + inputFilePath;
	    }
	    else {
		finalCommand += " -f";
		finalCommand += " " + inputFilePath;
		finalCommand += " " + outputFilePath;
	    }  
	    
	    
	    System.out.println("FC: " + finalCommand);
	    //debug.setText("FC :" + finalCommand);
	    	    
	    // run command
	    try {
		Process consoleCommand = Runtime.getRuntime().exec(finalCommand);
	    } catch (IOException ex) {
		Logger.getLogger(VlnaGui.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    	    
	    finalCommand = "";
	}    
	
	debug.setText("Vlnkování dokončeno.");
	
	// automaticke vypinani
	if (chb_shutdown.isSelected()) {
	    System.exit(0);
	}
    }//GEN-LAST:event_button_vlnkujActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // nativni look and feel
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
		new VlnaGui().setVisible(true);                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutBox;
    private javax.swing.JButton button_soubor;
    private javax.swing.JButton button_vlnkuj;
    private javax.swing.JButton button_vystup;
    private javax.swing.JCheckBox chb_latex;
    private javax.swing.JCheckBox chb_math;
    private javax.swing.JCheckBox chb_shutdown;
    private javax.swing.JCheckBox chb_verbatim;
    private javax.swing.JCheckBox chb_web;
    private javax.swing.JCheckBox chb_zalohy;
    private javax.swing.JLabel debug;
    private javax.swing.JLabel description;
    private javax.swing.JFileChooser fCh;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel info_autor;
    private javax.swing.JLabel info_homepage;
    private javax.swing.JLabel info_verze;
    private javax.swing.JTextField input_soubor;
    private javax.swing.JTextField input_vystup;
    private javax.swing.JLabel label_autor;
    private javax.swing.JLabel label_homepage;
    private javax.swing.JLabel label_verze;
    private javax.swing.JMenu menu_O_programu;
    private javax.swing.JMenu menu_nastaveni;
    private javax.swing.JMenu menu_vlnaGUI;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JPanel panel_moznosti;
    private javax.swing.JPanel panel_soubor;
    private javax.swing.JPanel panel_vystup;
    private javax.swing.JMenuItem submenu_Napoveda;
    private javax.swing.JMenuItem submenu_O_programu;
    private javax.swing.JMenuItem submenu_Ukoncit;
    // End of variables declaration//GEN-END:variables
    
}
