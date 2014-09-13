// TODO License

package physicsdemo;


/**
 *
 * @author Carter Yagemann
 */
public class Physics {
    
    public Physics() {
        //Nothing needs to be done
    }
    
    private long START_POSITION, START_VELOCITY,  ACCELERATION, START_TIME,
            DELTA_T;
    
    public void startCalculation(long startPosition, long startVelocity, 
            long acceleration) {
        START_POSITION = startPosition;
        START_VELOCITY = startVelocity;
        ACCELERATION = acceleration;
        START_TIME = System.currentTimeMillis();
    }
    
    public long getCurrentDisposition() {
        DELTA_T = System.currentTimeMillis() - START_TIME;
        return START_POSITION + 
                ((START_VELOCITY * DELTA_T) + 
                ((ACCELERATION * DELTA_T * DELTA_T) / 2));
    }
}