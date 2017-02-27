/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Suraj Singh
 */
public class compatible {
    void checkcompatible(genfone[] b,gengirl[] g)throws IOException
    {
        int i=0,j=0;
        Logger logger = Logger.getLogger("log");  
        FileHandler flag;  
        try {   
            flag = new FileHandler("output.txt");  
            logger.addHandler(flag);
            SimpleFormatter form = new SimpleFormatter();  
            flag.setFormatter(form);  
        } 
        catch (SecurityException e) { 
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
        
        for(i=0;i<80;i++)
        {
            for(j=0;j<70;j++)
            {
                if(b[i].min_attrac > g[j].attractiveness && b[i].budget > g[j].budget && b[i].committed==false && g[j].committed==false)
                {
                    b[i].committed=true;
                    g[j].committed=true;
                    logger.info(b[i].name+"--"+g[j].name);
                    break;
                }
               else
                    continue;
            }
            
        }
    
    }
}
