public class MatrixManipulations {
    public static double[][] GramSchmidt(double[][] x){
        double[][] v = x;
        for (int i = 0; i < x.length; i++){
            double[] beginner = x[i];
            for (int j = 0; j < i; j++){
                double dp = dotProduct(x[i], v[j]) / dotProduct(v[j], v[j]);
                beginner = subtractVector(beginner, multiplyVector(v[j], dp));
            }
            v[i] = beginner;
        }
        return v;
    }
    public static double[][] orthonormalSet(double[][]x){
        double[][] y = GramSchmidt(x);
        for (int i = 0; i < y.length; i++) y[i] = unitVector(y[i]);
        return y;
    }
    public static double[] unitVector(double[] x){
        double norm = Math.sqrt(dotProduct(x, x));
        return divideVector(x, norm);
    }
    public static double dotProduct(double[] x, double[] y){
        double res = 0;
        for (int i = 0; i < x.length; i++) res += x[i]*y[i];
        return res;
    }
    public static double[] multiplyVector(double[]x, double c){
        for (int i = 0; i < x.length; i++)  x[i]*= c;
        return x;
    }
    public static double[] divideVector(double[]x, double c){
        for (int i = 0; i < x.length; i++) x[i] /= c;
        return x;
    }
    public static double[] subtractVector(double[] x, double[] y){
        for (int i = 0; i < x.length; i++) x[i] -= y[i];
        return x;
    }
    public static double[] addVector(double[] x, double[] y){
        for (int i = 0; i < x.length; i++) x[i] += y[i];
        return x;
    }
}
