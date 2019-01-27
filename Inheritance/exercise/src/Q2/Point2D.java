public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D()
    {
        x = 2;
        y = 3;
    }

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float[] getXY()
    {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public String toString1()
    {
        return getXY()[0] + "," + getXY()[1];
    }
}