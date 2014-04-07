package com.exercise;


/**
 * This class represent current state of a bowling frame
 *
 * @author Nishant
 *
 */
public class Frame {

	private Integer frameNumber;
	private Integer pinsRoll1;
	private Integer pinsRoll2;
	private Integer pinsRoll3;
	private Boolean strike;
	private Boolean spare;
	private Integer frameScore;
	private Integer totalTillFrame;

	public Frame() {
		strike = false;
		spare = false;
	}

	public Integer getFrameNumber() {
		return frameNumber;
	}

	public void setFrameNumber(Integer frameNumber) {
		this.frameNumber = frameNumber;
	}

	public Integer getPinsRoll1() {
		return pinsRoll1;
	}

	public void setPinsRoll1(Integer pinsRoll1) {
		this.pinsRoll1 = pinsRoll1;
	}

	public Integer getPinsRoll2() {
		return pinsRoll2;
	}

	public void setPinsRoll2(Integer pinsRoll2) {
		this.pinsRoll2 = pinsRoll2;
	}

	public Integer getPinsRoll3() {
		return pinsRoll3;
	}

	public void setPinsRoll3(Integer pinsRoll3) {
		this.pinsRoll3 = pinsRoll3;
	}

	public Boolean getStrike() {
		return strike;
	}

	public void setStrike(Boolean strike) {
		this.strike = strike;
	}

	public Boolean getSpare() {
		return spare;
	}

	public void setSpare(Boolean spare) {
		this.spare = spare;
	}

	public Integer getFrameScore() {
		return frameScore;
	}

	public void setFrameScore(Integer frameScore) {
		this.frameScore = frameScore;
	}

	public Integer getTotalTillFrame() {
		return totalTillFrame;
	}

	public void setTotalTillFrame(Integer totalTillFrame) {
		this.totalTillFrame = totalTillFrame;
	}




}
