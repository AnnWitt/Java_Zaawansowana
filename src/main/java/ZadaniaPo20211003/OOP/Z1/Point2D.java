package ZadaniaPo20211003.OOP.Z1;

class Point2D {

        float x,y;

        public Point2D() {
                x=0;
                y=0;
        }

        public Point2D(float x, float y) {
                this.x = x;
                this.y = y;
        }

        public float getX() {
                return x;
        }

        public float getY() {
                return y;
        }

        float[] getXY () {
                float[] tablica={getX(),getY()};
                return tablica;
        }

        public float setX(float x) {
                this.x = x;
                return this.x;
        }

        public float setY(float y) {
                this.y = y;
                return this.y;
        }

        float setXY(float x, float y) {
                this.x=x;
                this.y=y;
                return this.x + this.y;
        }

        @Override
        public String toString() {
                return "(" +
                         x +
                        ", " + y +
                        ')';
        }

        /* ------------------------------------ */
}
