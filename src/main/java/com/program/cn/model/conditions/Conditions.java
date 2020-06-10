package com.program.cn.model.conditions;

public class Conditions {
    private String levelOfEducation;

    private String health;

    private String laborSkills;

    private String ruralCooperative;

    private String result;

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation == null ? null : levelOfEducation.trim();
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    public String getLaborSkills() {
        return laborSkills;
    }

    public void setLaborSkills(String laborSkills) {
        this.laborSkills = laborSkills == null ? null : laborSkills.trim();
    }

    public String getRuralCooperative() {
        return ruralCooperative;
    }

    public void setRuralCooperative(String ruralCooperative) {
        this.ruralCooperative = ruralCooperative == null ? null : ruralCooperative.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}