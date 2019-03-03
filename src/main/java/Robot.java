public class Robot {


    private Position currentPosition;

    public Robot(){
    currentPosition = null;}

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public boolean isPlaced() {
        return getCurrentPosition() != null;
    }

    public String report() {
        String report ;
        if (!isPlaced()) {
            report = "not in place";
        } else {
            report =  "["+currentPosition.getX()+"," +currentPosition.getY()+","+currentPosition.getDirection()+"]";
        }
        return report;
    }
}
