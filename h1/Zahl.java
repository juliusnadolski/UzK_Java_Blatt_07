package h1;

public class Zahl {

    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    public void setEven() {
        if (this.num % 2 == 0) {
            this.even = true;
        } else {
            this.even = false;
        }
    }

    public void setPositive() {
        if (this.num > 0) {
            this.positive = true;
        } else {
            this.positive = false;
        }
    }

    public void setSmall() {
        if (this.num < 100) {
            this.small = true;
        } else {
            this.small = false;
        }
    }
}
