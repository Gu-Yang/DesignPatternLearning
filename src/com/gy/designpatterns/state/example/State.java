package com.gy.designpatterns.state.example;

public interface State {
    public void doClock(Context context, int hour);
    public void doUse(Context context);
    public void doAlarm(Context context);
    public void doPhone(Context context);
}
