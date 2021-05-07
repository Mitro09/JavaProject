package it.formarete.designpatterns.simpleton;

public class JsonSerializer {

	private static JsonSerializer singleton;
	public  String dio;

	public static JsonSerializer getInstance() {
		if (singleton == null) {
			System.out.println("created!");
			singleton = new JsonSerializer();
		}
		return singleton;
	}
	
	private JsonSerializer() { //costruttore privato per far si che sto oggetto venga creato solo in questa classe
		
	}

	public String stringify(Object o) {
		return null;
	}

	public Object fromJson(String json) {
		return null;
	}
	
	public static void main(String[] args) {
		JsonSerializer serializer = JsonSerializer.getInstance();
		serializer.stringify("{\"hello\": \"world\")");
		serializer.dio = "porco";
		
		JsonSerializer serializer2 = JsonSerializer.getInstance();
		serializer2.fromJson(null);
		serializer2.dio = "cane";
		
		System.out.println(serializer==serializer2);
		System.out.println("dio è "+serializer.dio+" ma anche un "+serializer2.dio);//nome diverso ma sempre stesso oggetto
	}

}
