package com.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to compute the scores
 *
 * Todo:
 * 1. Use ScoreCard class
 * 2. Correct the program bug. Right now total is not correct.
 *
 * @author Nishant
 *
 */
public class ScoreApplication {

	public static void main(String args[]) {

		List<Frame> frames = new ArrayList<Frame>();

		Frame frame = null;

		frame = new Frame();
		frame.setFrameNumber(1);
		frame.setPinsRoll1(1);
		frame.setPinsRoll2(4);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(2);
		frame.setPinsRoll1(4);
		frame.setPinsRoll2(5);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(3);
		frame.setPinsRoll1(6);
		frame.setPinsRoll2(4);
		frame.setSpare(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(4);
		frame.setPinsRoll1(5);
		frame.setPinsRoll2(5);
		frame.setSpare(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(5);
		frame.setPinsRoll1(10);
		frame.setStrike(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(6);
		frame.setPinsRoll1(0);
		frame.setPinsRoll2(1);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(7);
		frame.setPinsRoll1(7);
		frame.setPinsRoll2(3);
		frame.setSpare(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(8);
		frame.setPinsRoll1(6);
		frame.setPinsRoll2(4);
		frame.setSpare(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(9);
		frame.setPinsRoll1(10);
		frame.setStrike(true);
		frames.add(frame);

		frame = new Frame();
		frame.setFrameNumber(10);
		frame.setPinsRoll1(2);
		frame.setPinsRoll2(8);
		frame.setPinsRoll3(6);
		frames.add(frame);

		ScoreCalculator calc = new ScoreCalculator();
		System.out.println("Score is: "+calc.computeScore(frames));
	}

}
