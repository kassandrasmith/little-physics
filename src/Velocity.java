
public class Velocity {
    int initialVelocity = 0;
    int velocity = 0;
    int[] velocityTable = new int[100];
    boolean checked = false;
    public void calculateVelocity(int acceleration){
        for(int t=0; t<100; t++) {
            velocity = initialVelocity + (acceleration * t);
            velocityTable[t] = velocity;
        }
    }
    public int calculateVelocityAtTime(int acceleration, int time){
        for(int t=0; t<time; t++) {
            velocity = initialVelocity + (acceleration * t);
            velocityTable[t] = velocity;
        }
        return initialVelocity +(acceleration * time);
    }

}
