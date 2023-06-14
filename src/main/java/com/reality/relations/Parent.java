package com.reality.relations;

import java.util.List;

public class Parent {

    private List<String> responsibilities;
    private List<String> plannings;

    public Parent() {
    }

    public Parent(List<String> responsibilities, List<String> plannings) {
        this.responsibilities = responsibilities;
        this.plannings = plannings;
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(List<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

    public List<String> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<String> plannings) {
        this.plannings = plannings;
    }
}
