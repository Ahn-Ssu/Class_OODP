
abstract class Prototype implements Cloneable {
        @Override
        public Prototype clone() throws CloneNotSupportedException {
                return (Prototype)super.clone();
        }

        public abstract void setX(int x);

        public abstract void printX();

        public abstract int getX();
}