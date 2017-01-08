package uk.co.stephencathcart.eventgenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) throws JsonProcessingException {
        GameScript script = new GameScript();
        Logger.getLogger(App.class.getName()).log(Level.INFO, "Creating game script.");
        script.generateScript();
        Logger.getLogger(App.class.getName()).log(Level.INFO, "Game script created.");
        GameScriptExporter exporter = new GameScriptExporter(script.getGameData());
        Logger.getLogger(App.class.getName()).log(Level.INFO, "Exporting game script: Location: {0}, Pretty: {1}, Debug: {2}", new Object[]{args[0], args[1], args[2]});
        exporter.exportGameScript(args[0], Boolean.parseBoolean(args[1]), Boolean.parseBoolean(args[2]));
        Logger.getLogger(App.class.getName()).log(Level.INFO, "Game script exported.");
    }
}
