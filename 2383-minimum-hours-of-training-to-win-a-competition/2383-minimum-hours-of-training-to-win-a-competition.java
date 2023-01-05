class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result=0;

        
        for(int i=0; i<energy.length;i++){
            if(energy[i]>=initialEnergy){
                int diff=energy[i]-initialEnergy;
                result+=diff+1;
                initialEnergy+=diff+1;
            }
            
            if(experience[i]>=initialExperience){
                int diff=experience[i]-initialExperience;
                result+=diff+1;
                initialExperience+=diff+1;
                
            }
            initialEnergy-=energy[i];
            initialExperience+=experience[i];
        }
        
        return result;
    }
}