package com.example.flowablecaseswithprocesses.delegates;

import lombok.extern.log4j.Log4j2;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class WannabeDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("Tell me what you want");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("What you really really want");
    }
}
