package project;

public interface HasLevel {
    public enum Levels{
       FIRST(1),SECOND(2),THIRD(3),FOURTH(4);

       Integer variable =0;

        Levels(int i) {
        this.variable = i;
        }
    }

    public Levels getLevel(HasLevel.Levels levels);
}
