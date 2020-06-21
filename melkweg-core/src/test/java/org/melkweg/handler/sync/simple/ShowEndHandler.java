package org.melkweg.handler.sync.simple;

import org.melkweg.annotation.MelkwegHandler;
import org.melkweg.handle.sync.SyncSampleFnHandler;
import org.melkweg.param.ParamWrapper;

@MelkwegHandler(name = "show_end_handle")
public class ShowEndHandler extends SyncSampleFnHandler {
    public ShowEndHandler(String name) {
        super(name);
    }

    @Override
    public ParamWrapper handle(ParamWrapper params) {
        params.setContextParam("show_end",true);
        return params;
    }
}