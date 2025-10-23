import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        var gson = gsonBuilder.setPrettyPrinting().create();

        FileWriter escritura = new FileWriter(pelicula.title() + ".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}