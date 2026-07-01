package Collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Models.Contacto;

public class Maps {

    // Un mapa tiene una clave y un valor (K:V)
    public Map<String, Integer> buildHashMap() {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        // {"A":10 , "B":20 , "C":30} -> al ingresar "A":50 se sobreescribe / no guarda
        // un orden especifico
        // {"A":50 , "B":20 , "C":30}

        System.out.println("===== Hash Map =====");
        System.out.println(mapa.size());
        System.out.println(mapa);

        for (int i = 0; i < mapa.size(); i++) {
            System.out.println(mapa.values().toArray()[i]);
        }

        for (String key : mapa.keySet()) {
            System.out.println(key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200); // <- no sobreescribe por que "A" ya existe
        System.out.println(mapa);

        return mapa;

    }

    public Map<String, Integer> buildLinkedHashMap() {

        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("S", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        System.out.println();
        System.out.println("===== Linked Hash Map =====");

        System.out.println(mapa.size());
        System.out.println(mapa);

        return mapa;

    }

    public Map<String, Integer> buildTreeMap() {

        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("J", 10);
        mapa.put("M", 60);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        System.out.println();
        System.out.println("===== Tree Map =====");

        System.out.println(mapa.size());
        System.out.println(mapa);

        return mapa;

    }

    public Set<Contacto> ordenarUnicos(List<Contacto> contactos){

        //Retornar contactos unicos
        //Unicos -> nombre
        //Ordene segun el apellido de manera descendente

        Set<Contacto> nueva = new TreeSet<>(
            (c1,c2) -> {
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            }
        );

        for(Contacto contacto : contactos){
            nueva.add(contacto);
        }    

        return nueva;
    }

}
