package week4;

public class MainScore {
    public static void main(String[] args) {
        Score[] score;
        score = new Score[99];

        for(int i = 0;i<score.length;i++){
            score[i] = new Score();
            score[i].setScore((int)(Math.random()*100));
        }
       
        double avg = average(score);
        System.out.println(avg);
    }

	public static double average(Score[] score) {
	    int sum = 0;
	    for (int i = 0; i < score.length; i++) {
	        sum = sum + score[i].getScore();
	      }
	      return sum/100;
	}

}
