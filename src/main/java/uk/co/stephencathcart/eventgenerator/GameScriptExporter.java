package uk.co.stephencathcart.eventgenerator;

import uk.co.stephencathcart.eventgenerator.data.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.co.stephencathcart.eventgenerator.actions.Actionable;
import uk.co.stephencathcart.eventgenerator.actions.DebugAction;
import uk.co.stephencathcart.eventgenerator.data.Event;

public class GameScriptExporter {

    private final Data gameData;

    public GameScriptExporter(Data gameData) {
        this.gameData = gameData;
    }

    public void exportGameScript(String path, boolean showPrettyPrint, boolean showDebugAcions) {
        if (gameData == null) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "No game data to export");
            return;
        }
        
        if(!showDebugAcions) {
            removeDebugActions();
        }

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(generateGameScript(showPrettyPrint));
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void removeDebugActions() {
        if (gameData == null) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "No game data to remove debug actions");
            return;
        }
        
        for(Event event : gameData.getEvents()) {
            Iterator<Actionable> itr = event.getActions().iterator();
            while(itr.hasNext()) {
                Actionable action = itr.next();
                if(action instanceof DebugAction) {
                    itr.remove();
                }
            }
            event.rebuild();
        }
    }

    private String generateGameScript(boolean showPrettyPrint) {
        ObjectMapper mapper = new ObjectMapper();
        String gameScript = null;
        try {
            if(showPrettyPrint) {
                DefaultPrettyPrinter.Indenter indenter = new DefaultIndenter("   ", DefaultIndenter.SYS_LF);
                DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
                printer.indentObjectsWith(indenter);
                printer.indentArraysWith(indenter);
                gameScript = mapper.writer(printer).writeValueAsString(gameData);
            }else {
                gameScript = mapper.writeValueAsString(gameData);
            }
        } catch (JsonProcessingException ex) {
            Logger.getLogger(GameScriptExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gameScript;
    }
}
