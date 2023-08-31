public class coord {
    double x;
    double y;

    public double distance (coord other) {
        double vert = (this.y - other.y);
        double hori = (this.x - other.x); 
        return Math.sqrt(vert * vert + hori * hori);
    }
}
