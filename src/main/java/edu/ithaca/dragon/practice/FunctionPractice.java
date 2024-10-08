package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if(first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException();
        }
        else{
            if(first > second && first >third){
                return first;
            }
            if(second > first && second > third){
                return second;
            }
            else{
                return third;
            }
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double realDiscount = 1 - (discountPercent/100);
        double taxMultiplier = 1 + (salesTax/100);
        return (originalPrice * realDiscount) * taxMultiplier;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if(daysSinceShoesChewed > 0){
            return true;
        }
        else{
            if(fetchedThePaperToday == true){
                return true;
            }
            else{
                return false;
            }
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if(numbers.size() == 0){
            return -1;
        }
        else{
            int idx = 0;
            int largestNum = -99999999;
            int largestNumIdx = 0;
            while(idx < numbers.size()){
                if(numbers.get(idx) > largestNum){
                    largestNum = numbers.get(idx);
                    largestNumIdx = idx;
                }
                idx ++;
            }
            return largestNumIdx;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if(numbers.size() == 0){
            return -1;
        }
        else{
            int idx = 0;
            int largestNum = -99999999;
            int largestNumIdx = 0;
            while(idx < numbers.size()){
                if(numbers.get(idx) > largestNum){
                    largestNum = numbers.get(idx);
                    largestNumIdx = idx;
                }
                if(numbers.get(idx) == largestNum){
                    largestNumIdx = idx;
                }
                idx ++;
            }
            return largestNumIdx;
        }
            
        
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
