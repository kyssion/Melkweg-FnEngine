package org.mekweg.handle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ConditionHandlerWrapper extends Handler {

    private List<ConditionHander> conditionHanders = new ArrayList<>();

    public abstract static class ConditionHander extends Handler {

        private List<Handler> childs = new ArrayList<>();

        public void addChilds(Handler... handlers) {
            childs.addAll(Arrays.asList(handlers));
        }

        public void addChilds(List<Handler> handlers) {
            childs.addAll(handlers);
        }

        public abstract boolean condition(Map<Class<?>, Object> params);

        public Map<Class<?>, Object> handle(Map<Class<?>, Object> params) {
            return params;
        }
    }
    public void addChilds(ConditionHander... handlers) {
        conditionHanders.addAll(Arrays.asList(handlers));
    }

    public void addChilds(List<ConditionHander> handlers) {
        conditionHanders.addAll(handlers);
    }
    @Override
    public Map<Class<?>, Object> handle(Map<Class<?>, Object> params) {
        return null;
    }
}
