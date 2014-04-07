package com.exercise;

import java.util.List;

/**
 * This class contains the function to calculate the scores
 *
 * @author Nishant
 *
 */
public class ScoreCalculator {

	/**
	 * Update the frame scores in the supplied list and returns the total score
	 *
	 * @param frames
	 */
	public Integer computeScore(List<Frame> frames) {
		Integer totalScore = 0; //Initialise the total score
		Frame prevFrame = null;
		for(Frame frame : frames) {
			//Compute score for frame and total score
			Integer tempScore = 0; //Initialise total score for frame
			tempScore = tempScore + frame.getPinsRoll1(); //First roll will always be there
			tempScore = tempScore + (null != frame.getPinsRoll2() ? frame.getPinsRoll2() : 0); //Second role may not be there.
			tempScore = tempScore + (null != frame.getPinsRoll3() ? frame.getPinsRoll3() : 0); //Third role will be there only in the 10th frame.
			frame.setFrameScore(tempScore);
			totalScore = totalScore + frame.getFrameScore();
			frame.setTotalTillFrame(totalScore);

			//Look for Spare or Strike in previous frame and update previous frame score and total score
			if(null != prevFrame) { //Spare
				if(prevFrame.getSpare()) {
					totalScore = totalScore + prevFrame.getPinsRoll1();
					prevFrame.setFrameScore(prevFrame.getFrameScore() + prevFrame.getPinsRoll1());
				}
				else if(prevFrame.getStrike()) { //Strike
					Integer prevTempAddition = 0;
					prevTempAddition = prevTempAddition + frame.getPinsRoll1();
					prevTempAddition = prevTempAddition + (null != frame.getPinsRoll2() ? frame.getPinsRoll2() : 0);
					prevFrame.setFrameScore(prevFrame.getFrameScore() + prevTempAddition);
					totalScore = totalScore + prevTempAddition;
				}
			}
			prevFrame = frame;
		}
		return totalScore;
	}



}
