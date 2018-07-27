package com.example.android.miwok;

import android.content.Context;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation of the word. */
    private String mDefaultTranslation;


    /** Miwok translation of the word */
    private String mMiwokTranslation;

    private int mImageResourceID= NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioId;

    /** Constructor-creates a new word object.
     * @param miwokTranslation is the word in Miwok Language
     * @param defaultTranslation is the word in a language the user is already familiar with.
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID=imageResourceID;
        mAudioId= audioId;
    }

    //create new word object so a 2nd constructor as the phrase activity don't need images
    public Word(String defaultTranslation, String miwokTranslation,int audioId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioId = audioId;
    }

    /**
     * get the default translation of the word.
     * @return String type
     */
    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }

    /**
     * get the Miwok translation of the word
     * @return String type
     */
    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    public int getAudioID(){return mAudioId;}

    public int getImageResourceID(){return mImageResourceID;}

    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE_PROVIDED;
    }
}
