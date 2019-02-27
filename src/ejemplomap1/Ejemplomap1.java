/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import modelo.Cliente;

/**
 *
 * @author juan_manuel.gil
 */
public class Ejemplomap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Cliente>listac=new LinkedList<>();
        LinkedList<Cliente>listac2=new LinkedList<>();
        
        Map<Integer, LinkedList<Cliente>> map1=new HashMap<>();
        
         
        listac.add(new Cliente("david", "li30", "uao"));
        listac.add(new Cliente("carmen", "li5", "ice"));
        listac.add(new Cliente("marcela", "fd4", "ced"));
        
       map1.put(3,listac);
       
        listac2.add(new Cliente("david", "li30", "uao"));
        listac2.add(new Cliente("carmen", "li5", "ice"));
        listac2.add(new Cliente("marcela", "fd4", "ced"));
        map1.put(36,listac2);
        
//        Map<Integer,Cliente> map2=new LinkedHashMap<>();
//        Map<Integer,Cliente> map3=new TreeMap<>();
//        
//            map1.put(55,new Cliente("david", "li30", "uao"));
//            map1.put(8,new Cliente("karen", "j4f", "loia"));
//             map1.put(14,new Cliente("lorena", "gh5", "nabes"));
//             
//             map2.put(55,new Cliente("david", "li30", "uao"));
//            map2.put(8,new Cliente("karen", "j4f", "loia"));
//             map2.put(14,new Cliente("lorena", "gh5", "nabes")); 
//            
//             
//            map3.put(55,new Cliente("david", "li30", "uao"));
//            map3.put(8,new Cliente("karen", "j4f", "loia"));
//            map3.put(14,new Cliente("lorena", "gh5", "nabes"));
//            
//            
       String m1=mostrarDatos(map1);
//        String m2=mostrarDatos(map2);
//        String m3=mostrarDatos(map3);
//        
//        
       System.out.println(m1);
//        
//        System.out.println("-------------------");
//         System.out.println(m2);
//        System.out.println("-------------------"); 
//          System.out.println(m3);
        
        
        // TODO code application logic here
    }
    public static String mostrarDatos(Map<Integer,LinkedList<Cliente>>m){
        String mostrar = "";
        
        Iterator<Map.Entry<Integer,LinkedList<Cliente>>> it;
         it = m.entrySet().iterator();
        while (it.hasNext()) {
            
          Map.Entry<Integer,LinkedList<Cliente>> pair=it.next();
          mostrar+=pair.getKey()+"\n";
            
            for(int i=0; i<pair.getValue().size(); i++){
                
            mostrar+=pair.getValue().get(i)+"\n";
            
            
            }
            
        }
        return mostrar;
        
    }
}
    

