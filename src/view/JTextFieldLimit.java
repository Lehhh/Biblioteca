package view;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class JTextFieldLimit extends PlainDocument {
    
    private int limit;
    
    public JTextFieldLimit (int limitation)
    {
        this.limit = limitation;
    }
    
    
    public void insertString(int offset, String str, AttributeSet set)
    {
        if(str == null)
        {
            return;

        }
        else if((getLength()+str.length()<=limit))
        {
            try {
                super.insertString(offset,str,set);
            } catch (BadLocationException ex) {
                Logger.getLogger(JTextFieldLimit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
