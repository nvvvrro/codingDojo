import java.util.HashMap;
import java.util.Set;

public class TrackList {
	public void list() {

		System.out.println("--------- TrackList ---------");
		HashMap<String, String> tracksMap = new HashMap<String, String>();
		tracksMap.put("El dia de mi suerte", "Pronto llegara, el dia de mi suerte");
		tracksMap.put("El cantante", "Yo soy el cantante que hoy han venido a escuchar");
		tracksMap.put("Periodico de ayer", "Tu amor es un periodico de ayer");
		tracksMap.put("La murga", "La calle es una selva de cemento");

		/*
		 * tracksMap.entrySet().forEach(entry -> System.out.println("\ntitulo: " +
		 * entry.getKey() + "\nletra: " + entry.getValue()));
		 */

		Set<String> keys = tracksMap.keySet();
		for (String key : keys) {
			System.out.println("\nTRACK: " + key + "\nLYRICS: " + tracksMap.get(key));
		}

	}

}
