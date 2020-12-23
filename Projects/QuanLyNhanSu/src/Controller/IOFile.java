package Controller; //9h3.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class IOFile {
    public static void writeFile(List ob, String s){
        ObjectOutputStream w;
        try{
            w = new ObjectOutputStream(new FileOutputStream(s));
            for(Object o:ob){
            Object o1=(Object)o;
            w.writeObject(o1);
        }
            w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void readFile(List ob, String s){
        ObjectInputStream r;
        try{
            r = new ObjectInputStream(new FileInputStream(s));
            Object o;
            while((o=r.readObject())!=null){
                ob.add(o);
            }
            r.close();
        }catch(IOException e){}
        catch(ClassNotFoundException e){}
    }
}