package py.una.entidad;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MensajeJSON {
	
	
	//Objeto Mensaje -> MensajeJSON
    public static String objetoString(Mensaje m) {	
    	
		JSONObject obj = new JSONObject();
        obj.put("celular_emisor", m.getCelularEmisor());
        obj.put("celular_receptor", m.getCelularReceptor());
        obj.put("texto", m.getTexto());
       
        return obj.toJSONString();
    }
    
    //MensajeJSON -> Objeto Mensaje
    public static Mensaje stringObjeto(String str) throws Exception {
    	Mensaje m = new Mensaje();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        m.setCelularEmisor((Long)jsonObject.get("celular_emisor"));
        m.setCelularReceptor((Long)jsonObject.get("celular_receptor"));
        m.setTexto((String)jsonObject.get("texto"));
        
        return m;
	}
}
