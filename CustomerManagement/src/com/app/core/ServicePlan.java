package com.app.core;

public enum ServicePlan {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
private String plan;
private double value;

 ServicePlan(double value) {
   
    this.value = value;
}

// Getter methods
public String getPlan() {
    return plan;
}

public double getValue() {
    return value;
}

}
