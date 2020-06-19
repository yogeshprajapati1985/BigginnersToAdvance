/*
 * This is project about the conversation of text into the speech.
 * The voice is taken from the software called mbrola, which has many voice stored.
 */
package text_to_speech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class MainFrame extends javax.swing.JFrame {
VoiceManager vm ;
//object of voicemanager
Voice v;
//object of voice

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_input = new javax.swing.JTextArea();
        btn_speak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_input.setColumns(20);
        txt_input.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        txt_input.setRows(5);
        jScrollPane1.setViewportView(txt_input);

        btn_speak.setText("Speak");
        btn_speak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_speakMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_speak)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(btn_speak)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_speakMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_speakMouseReleased
       try{
        String speakString = txt_input.getText();
        //take the text from the text area
        System.setProperty("mbrola.base","mbrola");
       //set the path of mbrola
       vm = VoiceManager.getInstance();
       //get the instance of voicemanager
       v =vm.getVoice("kevin16");
       //set the voice of kevin with the help of mbrola
       v.allocate();
       v.speak(speakString);
      //  v =vm.getVoice("mbrola_us1");
       }catch(Exception e){}
    }//GEN-LAST:event_btn_speakMouseReleased

    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
            //set the frame visible
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_speak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_input;
    // End of variables declaration//GEN-END:variables
}
