
class PrototypeImpl extends Prototype {
        int x;

        public PrototypeImpl(int x) {
                this.x = x;
        }

        public void setX(int x) {
                this.x = x;
        }

        public void printX() {
                System.out.println("Value :" + x);
        }

        public int getX() {
                return x;
        }
}