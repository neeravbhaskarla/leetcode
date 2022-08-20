class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b)->Integer.compare(b[1], a[1]));
        int noOfUnits = 0;
        for(int[] box: boxTypes){
            if(truckSize == 0) break;
            int availableSpace = Math.min(truckSize, box[0]);
            noOfUnits+=availableSpace*box[1];
            truckSize-=availableSpace;
        }
        return noOfUnits;
    }
}