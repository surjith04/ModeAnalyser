package com.assignment;

public class MoodAnalyser
{
    private String mood;

    MoodAnalyser(){};

    /*
    Constructor to take the mood message in Constructor
     */

    MoodAnalyser(String message){
        this.mood = message;
    }

    /*
   analyseMood function to return Mood is Happy or Sad
   */

    String analyseMood()
    {
        String returnString = "";
        if((this.mood).equals("I am in Sad Mood"))
        {
            returnString = "SAD";
        }
        else if((this.mood).equals("I am in Any Mood")) {
            returnString = "HAPPY";
        }
        return returnString;
    }
}
