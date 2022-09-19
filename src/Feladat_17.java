public class Feladat_17 {
    public static void main(String[] args) {
        int meret = 4;
        double[] tomb1 = new double[meret];
        double[] tomb2 = new double[meret];
        double[] tomb3 = new double[meret];

        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = Math.random() * 100;
            tomb2[i] = Math.random() * 100;
        }
        for (int i = 0; i < meret; i++) {
            tomb3[i] = tomb1[i] + tomb2[i];
            System.out.printf("%f + %f = %f\n",tomb1[i],tomb2[i],tomb3[i]);
        }

    }

}
