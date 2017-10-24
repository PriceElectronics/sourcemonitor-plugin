package com.thalesgroup.hudson.plugins.sourcemonitor;

import hudson.model.Run;

public class SourceMonitorTest {
    private Run owner;

    public SourceMonitorTest(Run owner) {
        this.owner = owner;
    }

    public Run<?, ?> getOwner(){
        return owner;
    }
}
