package com.gy.designpatterns.state.example;

public interface Context {
    public void setClock(int hour);   //设置时间
    public void changeState(State state);   //改变状态
    public void callSecurityCenter(String msg);   //联系安全中心
    public void recordLog(String msg);    //在安全中心留下记录
}
