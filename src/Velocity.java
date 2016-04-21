
public class Velocity {
    double initialVelocity = 0;
    double velocity = 0;
    double[] velocityTable = new double[100];
    boolean checked = false;
    double acceleration;
    double time;

    public double calculateVelocity(){
        for(int t=0; t<100; t++) {
            velocity = initialVelocity + (acceleration * t);
            velocityTable[t] = velocity;
        }
        return initialVelocity +(acceleration * time);
    }

    public void calculateVelocity(int acceleration){
        for(int t=0; t<100; t++) {
            velocity = initialVelocity + (acceleration * t);
            velocityTable[t] = velocity;
        }
    }
    public double calculateVelocityAtTime(int acceleration, int time){
        for(int t=0; t<time; t++) {
            velocity = initialVelocity + (acceleration * t);
            velocityTable[t] = velocity;
        }
        return initialVelocity +(acceleration * time);
    }

}
