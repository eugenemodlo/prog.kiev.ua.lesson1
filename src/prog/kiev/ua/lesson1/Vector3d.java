package prog.kiev.ua.lesson1;

public class Vector3d {
    private int xCoordinate;
    private int yCoordinate;
    private int zCoordinate;

    public Vector3d(int xCoordinate, int yCoordinate, int zCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    public Vector3d() {
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getZCoordinate() {
        return zCoordinate;
    }

    public void setZCoordinate(int zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", zCoordinate=" + zCoordinate +
                '}';
    }

    public Vector3d getSum(Vector3d vector) {
        return new Vector3d(this.xCoordinate + vector.xCoordinate,
                            this.yCoordinate + vector.yCoordinate,
                            this.zCoordinate + vector.zCoordinate);
    }

    public int getScalarMultiply(Vector3d vector) {
        return (this.xCoordinate * vector.xCoordinate +
                this.yCoordinate * vector.yCoordinate +
                this.zCoordinate * vector.zCoordinate);
    }

    public Vector3d getVectorMultiply(Vector3d vector) {
        Vector3d outVector = new Vector3d();

            outVector.xCoordinate = (this.yCoordinate * vector.zCoordinate - (this.zCoordinate * vector.yCoordinate));
            outVector.yCoordinate = (this.zCoordinate * vector.xCoordinate - (this.xCoordinate * vector.zCoordinate));
            outVector.zCoordinate = (this.xCoordinate * vector.yCoordinate - (this.yCoordinate * vector.xCoordinate));

        return outVector;
    }


}
