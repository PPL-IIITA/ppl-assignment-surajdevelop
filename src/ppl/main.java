/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Suraj Singh
 */
public class main {
    
   public static void main(String[] args) throws IOException {
   
         int i,j;
		i=0;
		j=0;
                gengirl g[] = new gengirl[1000];
                gengirl c=new gengirl();
                c.generate();
		String ws="girl.csv";
                String line = "";
		String Split = ",";
		BufferedReader gbuff=null ;
		try{
                    gbuff = new BufferedReader(new FileReader(ws));
                    while((line = gbuff.readLine() )!= null){                
			String[] grl = line.split(Split);
			g[j] = new gengirl();
                        g[j].name = grl[0];
                        g[j].attractiveness = Integer.parseInt(grl[1]);
                        g[j].budget = Integer.parseInt(grl[2]);
			g[j].intelligence = Integer.parseInt(grl[3]); 
                        j++;        
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
                genfone b[] = new genfone[1000];
                genfone d=new genfone();
                d.generate();
                String csv;
                csv= "boy.csv";
                String line1 = "";
		String csvsplit = ",";
		BufferedReader buff = null;
                i=0;
		try{
                    buff = new BufferedReader(new FileReader(csv));
                    while((line1 = buff.readLine() )!= null){
			String[] by = line1.split(csvsplit);
			b[i] = new genfone();
                        b[i].name = by[0];
                        b[i].attractiveness = Integer.parseInt(by[1]);
			b[i].budget = Integer.parseInt(by[2]);
			b[i].intelligence = Integer.parseInt(by[3]);
                        b[i].min_attrac = Integer.parseInt(by[4]);
			i++;
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
                compatible a =new compatible();
                a.checkcompatible(b, g);
                
 }
   
   }
    

