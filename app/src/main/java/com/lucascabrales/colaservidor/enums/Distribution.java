package com.lucascabrales.colaservidor.enums;

/**
 * Created by lucascabrales on 9/26/17.
 */

public enum Distribution {
    NORMAL("Normal"),
    POISSON("Poisson"),
    UNIFORM("Uniforme");

    public String name;

    Distribution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Distribution fromString(String text) {
        for (Distribution b : Distribution.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
