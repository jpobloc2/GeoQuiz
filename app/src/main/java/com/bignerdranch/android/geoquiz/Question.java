package com.bignerdranch.android.geoquiz;

/**
 * Created by John Poblocki on 2/12/16.
 */

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;
    private boolean mUserCheated;

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isUserCheated() {
        return mUserCheated;
    }

    public void setUserCheated(boolean userCheated) {
        mUserCheated = userCheated;
    }

    public Question(int textResID, boolean answerTrue){
        mTextResID = textResID;
        mAnswerTrue = answerTrue;
        mUserCheated = false;
    }
}
