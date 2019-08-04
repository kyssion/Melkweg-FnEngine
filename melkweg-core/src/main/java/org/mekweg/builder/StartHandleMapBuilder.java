package org.mekweg.builder;

import org.mekweg.handle.Handle;
import org.mekweg.handle.StartHandler;
import org.mekweg.script.ScriptAnalysis;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class StartHandleMapBuilder {
    public static Map<String, StartHandler> build(Map<String, Handle> handleMap, String... paths) throws IOException {
        Map<String,StartHandler> startHanderMap = new HashMap<>();
        for (String path : paths) {
            URL uri = StartHandler.class.getClassLoader().getResource(path);
            if(uri==null){
                continue;
            }
            File file = new File(uri.getFile());
            startHanderMap.putAll(ScriptAnalysis.analysis(file,handleMap));
        }
        return startHanderMap;
    }
}
