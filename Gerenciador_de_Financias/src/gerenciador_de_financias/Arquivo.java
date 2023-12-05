package gerenciador_de_financias;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class Arquivo {
    public static void recebeInfo(String pDestinoArq, String pConteudo){
        
        try(
                FileWriter criaArq = new FileWriter(pDestinoArq);
                BufferedWriter buffer = new BufferedWriter(criaArq);
                PrintWriter escreveArq = new PrintWriter(buffer);
                
                ){
            escreveArq.append(pConteudo);
                    
        }catch(IOException e){
            e.printStackTrace();
        }
            
    
    }
    
    
    
}
