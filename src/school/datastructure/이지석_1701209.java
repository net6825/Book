package school.datastructure;

public class 이지석_1701209 {
    /*
     * @author 1701209, 이지석
     * @date 2021년 9월 27일
     */
    public static void main(String[] args) {
        float[][] a = new float[][]{
                {7, 2}, {6, 4}, {5, 6}, {4, 8}, {3, 1}, {2, 3}, {1, 5}, {0, 2}
        };

        float[][] b = new float[][]{
                {9, 8}, {8, 6}, {7, 4}, {6, 2}, {5, 1},{4,2},{3,1},{2,0},{1,8},{0,6}
        };

        이지석_1701209 poly = new 이지석_1701209();
        이지석_1701209.Polynomial A = poly.new Polynomial(a);
        이지석_1701209.Polynomial B = poly.new Polynomial(b);

        이지석_1701209.OperatePoly opt = poly.new OperatePoly();

        이지석_1701209.Polynomial C = opt.addPoly(A, B);

        System.out.println("A (x) =");
        A.printPoly();
        System.out.println("B (x) =");
        B.printPoly();
        System.out.println("C (x) =");
        C.printPoly();
    }

    class OperatePoly {
        private int degree_A, degree_B;
        private int maxDegree;
        int index;

        public Polynomial addPoly(Polynomial A, Polynomial B) {
            degree_A = A.getMaxDegree();
            degree_B = B.getMaxDegree();

            if (degree_A >= degree_B) {
                maxDegree = degree_A;
            }
            else {
                maxDegree = degree_B;
            }
            index = maxDegree;

            Polynomial C = new Polynomial(maxDegree);

            for (int i = 0; i <= maxDegree; i++) {
                if (degree_A == degree_B) {
                    C.setCoef(i, A.getCoef(index) + B.getCoef(index));
                    degree_A--;
                    degree_B--;
                } else if (degree_A > degree_B) {
                    C.setCoef(i, A.getCoef(index));
                    degree_A--;
                } else {
                    C.setCoef(i, B.getCoef(index));
                    degree_B--;
                }
                index--;
            }
            return C;
        }
    }


    class Polynomial {
        private final int maxDegree;
        private final float[][] poly = new float[20][2];

        Polynomial(float[][] poly) {
            for (int i = 0; i < poly.length; i++) {
                this.poly[i] = poly[i];
            }
            maxDegree = (int) poly[0][0];
        }

        Polynomial(int degree) {
            int temp = degree;
            for (int i = 0; i < degree; i++) {
                this.poly[i][0] = temp--;
            }
            this.maxDegree = degree;
        }

        public int getMaxDegree() {
            return this.maxDegree;
        }

        public void setCoef(int degree, float coef) {
            poly[degree][1] = coef;
        }

        public float getCoef(int degree) {
            return poly[maxDegree - degree][1];
        }

        public void printPoly() {
            for (int i = 0; i <= maxDegree; i++) {
                System.out.printf("%3.0fx^%1.0f", this.poly[i][1], this.poly[i][0]);
            }

            System.out.println();
        }
    }
}
