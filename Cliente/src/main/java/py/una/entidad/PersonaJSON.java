package py.una.entidad;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PersonaJSON {

	//Objeto Persona -> Persona JSON
    public static String objetoString(Persona p) {	
    	
		JSONObject obj = new JSONObject();
        obj.put("celular", p.getCelular());
        obj.put("nombre", p.getNombre());
        obj.put("apellido", p.getApellido());

        JSONArray list = new JSONArray();
        
        for(Mensaje temp: p.getMensajes()){
        	list.add(temp);
        }
       // if(list.size() > 0) {
        	obj.put("mensajes", list);
        //}
        

        return obj.toJSONString();
    }
    
    //PersonaJSON -> Objeto Persona
    public static Persona stringObjeto(String str) throws Exception {
    	Persona p = new Persona();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        Long celular = (Long) jsonObject.get("celular");
        p.setCelular(celular);
        p.setNombre((String)jsonObject.get("nombre"));
        p.setApellido((String)jsonObject.get("apellido"));
        
        JSONArray msg = (JSONArray) jsonObject.get("asignaturas");
        Iterator<Mensaje> iterator = msg.iterator();
        while (iterator.hasNext()) {
        	p.getMensajes().add(iterator.next());
        }
        return p;
	}

}
