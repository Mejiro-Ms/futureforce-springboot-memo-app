package com.lesson.memo.model;


public enum Priority {
    HIGH(1, "高"),
    MEDIUM(2, "中"),
    LOW(3, "低");

    private final int order;
    private final String label;

    Priority(int order, String label) {
        this.order = order;
        this.label = label;
    }

    public int getOrder() {
        return order;
    }

    public String getLabel() {
        return label;
    }
}
