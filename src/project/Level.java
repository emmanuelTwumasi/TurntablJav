package project;

public enum Level {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4);

    Integer variable =0;

    Level(int i) {
        this.variable = i;
    }
}