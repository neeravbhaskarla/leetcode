class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        return divideAndConquer(buildings, 0, buildings.length - 1);
    }
    
    public List<List<Integer>> divideAndConquer(int[][] buildings, int left, int right) {
        if (left == right) {
            List<List<Integer>> answer = new ArrayList<>();
            answer.add(Arrays.asList(buildings[left][0], buildings[left][2]));
            answer.add(Arrays.asList(buildings[left][1], 0));
            return answer;
        }
        int mid = (right - left)/2 + left;
        List<List<Integer>> leftSkyline = divideAndConquer(buildings, left, mid);
        List<List<Integer>> rightSkyline = divideAndConquer(buildings, mid+1, right);
        
        return mergeSkylines(leftSkyline, rightSkyline);
    }
    public List<List<Integer>> mergeSkylines(List<List<Integer>> leftSkyline, List<List<Integer>> rightSkyline) {
        List<List<Integer>> answer = new ArrayList<>();
        int leftPos = 0, rightPos = 0;
        int leftPrevHeight = 0, rightPrevHeight = 0;
        int curX, curY;
        while (leftPos < leftSkyline.size() && rightPos < rightSkyline.size()) {
            int nextLeftX = leftSkyline.get(leftPos).get(0);
            int nextRightX = rightSkyline.get(rightPos).get(0);
            if (nextLeftX < nextRightX) {
                leftPrevHeight = leftSkyline.get(leftPos).get(1);
                curX = nextLeftX;
                curY = Math.max(leftPrevHeight, rightPrevHeight);
                leftPos++;
            } 
            else if (nextLeftX > nextRightX) {
                rightPrevHeight = rightSkyline.get(rightPos).get(1);
                curX = nextRightX;
                curY = Math.max(leftPrevHeight, rightPrevHeight);
                rightPos++;
            }
            else {    
                leftPrevHeight = leftSkyline.get(leftPos).get(1);
                rightPrevHeight = rightSkyline.get(rightPos).get(1);
                curX = nextLeftX;
                curY = Math.max(leftPrevHeight, rightPrevHeight);
                leftPos++;
                rightPos++;
            }

            if (answer.isEmpty() || answer.get(answer.size()-1).get(1) != curY){
                answer.add(Arrays.asList(curX, curY));
            }
        }
        
        while(leftPos < leftSkyline.size()) {
            answer.add(leftSkyline.get(leftPos));
            leftPos++;
        }
        
        while(rightPos < rightSkyline.size()) {
            answer.add(rightSkyline.get(rightPos));
            rightPos++;
        }
        return answer;
    }
}