
class Solution {
    float[] streamAvg(int[] arr, int n) {
        float k[]=new float[n];
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=(float)arr[i];
            k[i]= (float)sum/(i+1);
        }
        return k;
        // code here
    }
}
