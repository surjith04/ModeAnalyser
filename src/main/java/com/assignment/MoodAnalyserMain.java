package com.assignment;

import java.util.Scanner;

public class MoodAnalyserMain
{
    /*
    Enums Added NULL_ERROR and EMPTY_ERROR
     */
    public static final String NULL_ERROR = "NULL MOOD";
    public static final String EMPTY_ERROR = "EMPTY MOOD ";

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Problem");
        Scanner sc = new Scanner(System.in);

        /*
        Using try Catch to Perform Exception handling
         */
        try {
            System.out.println("Enter Your Mood");
            String mood = sc.nextLine();
            /*
            if String is Empty throw Empty String Error
             */
            if (mood.isEmpty()) {
                throw new MoodAnalysisException(EMPTY_ERROR);
            }
            /*
            Check the user entered input is I am in Sad Mood or I am in Any Mood otherwise throw Exception
             */

            if(mood.equals("I am in Sad Mood") || mood.equals("I am in Any Mood") )
            {
                MoodAnalyser moodAnalyser = new MoodAnalyser(mood);
                System.out.println(moodAnalyser.analyseMood());
            }
            else {
                /*
                Custom Exception
                 */
                throw new MoodAnalysisException(NULL_ERROR);
            }
        }
        catch (Exception e)
        {
            System.out.println("Please Enter Valid Input " + e);
        }
    }
}
