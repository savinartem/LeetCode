class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[] { celsius+273.15, 1.8*celsius+32.00};
    }
}