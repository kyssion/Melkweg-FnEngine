package com.kyssion.galaxy.script.translater.rule;

import com.kyssion.galaxy.script.translater.data.workKeyData.LexicalAnalysisData;
import com.kyssion.galaxy.script.translater.rule.base.Rule;
import com.kyssion.galaxy.script.translater.rule.typeCheck.IdTypeRule;

import java.util.List;

/**
 * A = namespaceId
 */
public class ARule extends Rule {
    @Override
    public int tryChild(int index, List<LexicalAnalysisData> dataList) {
        if (IdTypeRule.isTrue(dataList.get(index).getValue())) {
            return index+1;
        }
        return -1;
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public boolean isMatch(LexicalAnalysisData data) {
        return data.getType().getCode() == 10 && IdTypeRule.isTrue(data.getValue());
    }
}
