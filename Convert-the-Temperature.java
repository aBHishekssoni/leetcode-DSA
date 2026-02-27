1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double[] c = new double[2];
4        c[0] = celsius + 273.15;
5        c[1] = celsius * 1.80 + 32.00;
6        return c;
7    }
8}