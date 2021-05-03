package com.gy.designpatterns.state.example;

public class LunchTimeState implements State {

    private static LunchTimeState singleton = new LunchTimeState();
    private LunchTimeState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 14 || hour < 12) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("使用金库（午餐时间）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（午餐时间）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("午餐时间的通话记录");
    }

    public String toString() {
        return "[午餐时间]";
    }
}
