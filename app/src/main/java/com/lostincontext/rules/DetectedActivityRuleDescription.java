package com.lostincontext.rules;

/**
 * Created by syrinetrabelsi on 05/07/2016.
 */

public class DetectedActivityRuleDescription implements RuleDescription {
    private Type type;
    private State state;

    public DetectedActivityRuleDescription(Type type, State state) {
        this.type = type;
        this.state = state;
    }

    @Override
    public void visit() {

    }

    public enum Type {
        RUNNING,
        WALKING,
        IN_VEHICLE,
        ON_BICYCLE,
        ON_FOOT,
    }

    public enum State {
        STARTING,
        DURING,
        STOPPING
    }

    public Type getType() {
        return type;
    }

    public State getState() {
        return state;
    }
}