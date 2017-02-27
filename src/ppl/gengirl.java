/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Suraj Singh
 */
public class gengirl {
    int attractiveness;
    int budget;
    int intelligence;
    String name;
    boolean single = true;
    boolean committed = false;
    
    void generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("girl.csv"));
        StringBuilder sb = new StringBuilder();
       // ArrayList<gengirl> B = new ArrayList<gengirl>(100);
        for(int i=0;i<70;i++)
        {
            name="GirlNo"+(i);
            attractiveness=(int) (10+(Math.random()*19));
            budget=(int) (100+(Math.random()*1000));
            intelligence=(int) (10+(Math.random()*25));
            
            
            sb.append(name);
            sb.append(',');
            sb.append(attractiveness);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(intelligence);
            
            sb.append("\n");
            //sb.append(',');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("Girl.csv Done!");
    }
    
}
