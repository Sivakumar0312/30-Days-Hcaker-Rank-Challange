package HackerRankChallange;

public class Day14 (int[] a
private int[] elements;){
        this.elements = a;
    }
    public void computeDifference(){
        int min = elements[0];
        int max = elements[0];

        for(int i = 0; i < elements.length; i++){
            if(elements[i] < min){
                min = elements[i];
            }if(elements[i] > max){
                max = elements[i];
            }
        }
        int maximumDifference = Math.abs(max - min);
    }

}
