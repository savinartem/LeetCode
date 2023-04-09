class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        vector<double> result;
        
        double kel=celsius+273.15;
        double fah=celsius*1.80+32.00;
        
        result.push_back(kel);
        result.push_back(fah);
        
        return result;
    }
};