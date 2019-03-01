/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.stream.XMLOutputFactory;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author juan_manuel.gil
 */
public class FileXML {

    public static boolean crearArchivoXML(Map<Integer, LinkedList<Cliente>> m) {
        boolean t = false;

        try {

            Element clientes = new Element("clientes");
            Document doc = new Document(clientes);
            
             Iterator<Map.Entry<Integer,LinkedList<Cliente>>> it;
         it = m.entrySet().iterator();
        while (it.hasNext()) {
            
          Map.Entry<Integer,LinkedList<Cliente>> pair=it.next();
          
          Element key1= new Element("key");
          key1.setAttribute(new Attribute("id", String.valueOf(pair.getKey())));
          doc.getRootElement().addContent(key1);
          for(int i=0;i<pair.getValue().size();i++){
          Cliente objc=pair.getValue().get(i);
          Element cliente1= new Element("cleinte");
          cliente1.setAttribute(new Attribute("nombre",objc.getNombre()));
          cliente1.setAttribute(new Attribute("idCliente",objc.getIdcliente()));
          cliente1.setAttribute(new Attribute("Empresa",objc.getEmpresa()));
          doc.getRootElement().addContent(cliente1);
          
          }
          
        }
        XMLOutputter xmlOutput=new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc,new FileWriter("clientes.xml"));
            t=true;

        } catch (IOException oie) {

        }

        return t;
    }
     public static Map<Integer, LinkedList<Cliente>> leerArchivoXML() {
        Map<Integer,LinkedList<Cliente>> m1=new HashMap<>();
        
        
        
        return m1;
        
    }

}
