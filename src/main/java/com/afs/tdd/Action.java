package com.afs.tdd;

public enum Action {
    MOVE("M"),
    LEFT("L"),
    RIGHT("R");

    private final String actionLabel;

    Action(String actionLabel) {
        this.actionLabel = actionLabel;
    }
    public static Action getAction(String command) {
        for (Action action: Action.values()){
            if(action.actionLabel.equals(command)){
                return action;
            }
        }
        return null;
    }
}
