import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
public class ventanaJframe {
 
    public static void main(String []args){ 
        ventanaJframe ventana = new ventanaJframe("Letras Tutti Frutti");      
    }

 
    public ventanaJframe (String titulo){
 		Letras alea = new Letras();
        JFrame ventanaM = new JFrame(titulo);
  		//JButton boton = new JButton();
		JLabel label1 = new JLabel();
		JLabel letra = new JLabel();			
    	
    	label1.setFont(label1.getFont().deriveFont(20.0f));
    	//label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    	label1.setHorizontalAlignment(JLabel.CENTER);
    	label1.setVerticalAlignment(JLabel.TOP);    			    	  			
		label1.setText(alea.mostrarTit()); 
		
		letra.setFont(label1.getFont().deriveFont(75.0f));
    	letra.setHorizontalAlignment(JLabel.CENTER);
    	letra.setVerticalAlignment(JLabel.CENTER); 		
		letra.setText(alea.mostrarLetra()); 

 		ventanaM.pack();
 		ventanaM.setLocationRelativeTo(null);		
		ventanaM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaM.setSize(250,150);//configurando tamaño de la ventana              
        
        ventanaM.add(label1);
        ventanaM.add(letra);
		
		//ventanaM.();
		ventanaM.setVisible(true);        
     
        //boton.setText(alea.mostrarLetra());        
        //boton.setBounds(95,43,50,50);
        //ventanaM.add(boton);
        //boton.setVisible(true);                
    }    
}