/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

/**
 *
 * @author ita
 */
import java.awt.Color;
import java.awt.Font;
import sp.util.ListControl;
import java.awt.KeyboardFocusManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class TextFieldListing extends JTextField {

    private boolean required;
    private boolean valid = true;
    private int posisi;
    private int length;
    private int minDigit;
    private int maxDigit;
    private char khususType;
    private boolean huruf;
    private boolean angka;
    private boolean khusus;
    private Color colorSblm = null;

    public TextFieldListing() {
        setTextfield();
        setKeyListener();
        setFocus();
    }

    public void setTextfield() {
        ListControl.addtoForm(this);
        setActionCommand(getName());
        setPreferredSize(new java.awt.Dimension(20, 20));
        setFont(new Font("Times New Roman", Font.PLAIN, 11));
        //disable tab
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);
    }

    public void setKeyListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                checkContent(e);
                if ((e.getKeyCode() == KeyEvent.VK_TAB) || (e.getKeyCode() == KeyEvent.VK_DOWN)) {
                    JOptionPane.showMessageDialog(null, "Untuk next silahkan pake enter", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                limitContent(e);
            }
        });
    }

    public void setFocus() {
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                colorSblm = TextFieldListing.this.getBackground();
                super.focusGained(e); //To change body of generated methods, choose Tools | Templates.
                setBackground(Color.yellow);
                ListControl.setPosisi(getPosisi());
                if (!getValid()) {
                    setText("");
                    setBackground(Color.red);
                    colorSblm = Color.red;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBackground(colorSblm);
                super.focusLost(e); //To change body of generated methods, choose Tools | Templates.
            }

        });
    }

    public void checkContent(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String a = TextFieldListing.this.getText();
            if (isRequired()) {
                if (!(((TextFieldListing) e.getSource()).getText().equals(""))) {
                    if (!(isHuruf()) && !(isKhusus()) && isAngka()) {
                        int a1 = Integer.valueOf(a);
                        cekConstraint(a1);
                    } else if ((isHuruf()) || ((isHuruf()) && (isAngka()))) {
                        cekLength(a);
                        if (isKhusus()) {
                            if (khususType == '3') {
                                cekType3(a);
                                System.out.println("Cek 3");
                            }
                        }
                    } else if ((isKhusus() && (isAngka()))) {
                        if (khususType == '1') {
                            // khusus untuk kabupaten
                            int a1 = Integer.valueOf(a);
                            cekType1(a1);
                        } else if (khususType == '2') {
                            // untuk textfield yag bisa diisi 0 dan punya minDigit dan maxDigit
                            // contoh: umur, b3r5(?)
                            int a1 = Integer.valueOf(a);
                            cekType2(a1);
                        }
                    }
                } else {
                    setValid(false);
                    JOptionPane.showMessageDialog(null, "Isian tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                    setText("");
                }
            }
        }
    }

    public void cekConstraint(int x) {
        if (x >= minDigit && x <= maxDigit) {
            next();
        } else {
            setValid(false);
            JOptionPane.showMessageDialog(null, "Digit salah!\nIsian harus antara " + minDigit + " sampai " + maxDigit, "Salah Constraint", JOptionPane.WARNING_MESSAGE);
            TextFieldListing.this.setBackground(new Color(251, 64, 64));
            TextFieldListing.this.setText("");
        }
    }

    public void cekLength(String a) {
        if (a.length() <= length) {
            next();
        } else {
            setValid(false);
            JOptionPane.showMessageDialog(null, "Digit Salah!\nIsian tidak boleh lebih dari " + length + " karakter", "Salah Panjang", JOptionPane.WARNING_MESSAGE);
            TextFieldListing.this.setText("");
        }
    }

    public void cekType1(int a) {
        Integer c1 = 12;
        Integer c2 = 73;
        if (a == c1 || a == c2) {
            next();
        } else {
            JOptionPane.showMessageDialog(null, "Digit salah!\nIsian hanya boleh 12 atau 73", "Salah Constraint", JOptionPane.WARNING_MESSAGE);
            //TextField.this.setBackground(new Color(251, 64, 64)); //merah
            //scolorSblm = new Color(Color.red);
            setValid(false);
        }
    }

    public void cekType2(int a) {
        String c = "00";
        int c3 = Integer.valueOf(c);
        if (a == c3 || (a >= minDigit && a <= maxDigit)) {
            next();
        } else {
            setValid(false);
            JOptionPane.showMessageDialog(null, "Digit salah!\nIsian harus antara " + minDigit + " sampai " + maxDigit + " atau Kosong", "Salah Constraint", JOptionPane.WARNING_MESSAGE);
            TextFieldListing.this.setBackground(new Color(251, 64, 64)); //merah
            TextFieldListing.this.setText("");
        }
    }

    public void cekType3(String a) {
        if ("P".equals(a) || "L".equals(a)) {
            next();
        } else {
            setValid(false);
            JOptionPane.showMessageDialog(null, "Isian hanya boleh L atau P", "Salah Isian", JOptionPane.WARNING_MESSAGE);
            TextFieldListing.this.setBackground(new Color(251, 64, 64));
            TextFieldListing.this.setText("");
        }
    }

    public void limitContent(KeyEvent evt) {
        char a = evt.getKeyChar();
        if (!(isHuruf()) && (isAngka())) {
            if (!Character.isDigit(a) || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE) {
                evt.consume();
            }
        } else if ((isHuruf()) && (isAngka())) {
            if (a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE) {
                evt.consume();
            }
        } else if (isHuruf() && !(isAngka())) {
            if (Character.isDigit(a) || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE) {
                evt.consume();
            }
        }
    }

    public void next() {
        setValid(true);
        TextFieldListing.this.setBackground(new Color(160, 255, 66));
        colorSblm = new Color(160, 255, 66);
        ListControl.next();
    }

    public Color getColorSblm() {
        return colorSblm;
    }

    public void setColorSblm(Color colorSblm) {
        this.colorSblm = colorSblm;
    }

    public char getKhususType() {
        return khususType;
    }

    public void setKhususType(char khususType) {
        this.khususType = khususType;
    }

    public boolean isKhusus() {
        return khusus;
    }

    public void setKhusus(boolean khusus) {
        this.khusus = khusus;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void addToList() {

    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getMinDigit() {
        return minDigit;
    }

    public void setMinDigit(int minDigit) {
        this.minDigit = minDigit;
    }

    public int getMaxDigit() {
        return maxDigit;
    }

    public void setMaxDigit(int maxDigit) {
        this.maxDigit = maxDigit;
    }

    public boolean isHuruf() {
        return huruf;
    }

    public void setHuruf(boolean huruf) {
        this.huruf = huruf;
    }

    public boolean isAngka() {
        return angka;
    }

    public void setAngka(boolean angka) {
        this.angka = angka;
    }

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setText(String text) {
        super.setBackground(new Color(160, 255, 66));
        super.setText(text);
    }

}
