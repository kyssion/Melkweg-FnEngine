package org.melkweg.handler.sync.condition;

import org.melkweg.annotation.MelkwegHandler;
import org.melkweg.test.syncBaseTest.ConditionTest;
import org.melkweg.handle.sync.SyncConditionFncHandlerWrapper;
import org.melkweg.param.ParamWrapper;

@MelkwegHandler(name = "condition_handle_1")
public class ConditionHandler1 extends SyncConditionFncHandlerWrapper.ConditionHandler {

    public ConditionHandler1(String name) {
        super(name);
    }

    @Override
    public boolean condition(ParamWrapper params) {
        String testOne = params.getContextParam("condition_1");
        if(ConditionTest.CAN_GO.equals(testOne)){
            return true;
        }else{
            return false;
        }
    }
}