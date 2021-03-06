package org.mintflow.handler.async.cycle;

import org.mintflow.annotation.MintFlowHandler;
import org.mintflow.handler.async.AsyncCycleFnHandler;
import org.mintflow.param.CycleParam;
import org.mintflow.param.ParamWrapper;

@MintFlowHandler(name = "async_cycle_test")
public class AsyncCycleTestHandler extends AsyncCycleFnHandler {

    public static String random_number_cycle = "random_number_cycle";

    public AsyncCycleTestHandler(String name) {
        super(name);
    }

    @Override
    public CycleParam cycleHandler(ParamWrapper paramWrapper) {
        int times =  (int) (Math.random()*10);
        Integer nowTimes = (Integer) paramWrapper.getContextParams().getOrDefault(random_number_cycle,0);
        paramWrapper.setContextParam(random_number_cycle,nowTimes+times);
        return new CycleParam(times,paramWrapper);
    }
}
