package com.example.flowablecaseswithprocesses.delegates;

import lombok.extern.log4j.Log4j2;
import org.flowable.cmmn.api.delegate.DelegatePlanItemInstance;
import org.flowable.cmmn.api.delegate.PlanItemJavaDelegate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class AllDoneDelegate implements PlanItemJavaDelegate {
    @Override
    public void execute(DelegatePlanItemInstance delegatePlanItemInstance) {
        log.info("Th-th-th-that's all folks!");
    }
}
