https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&sortBy=submissions

//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        ArrayList<Character> l=new ArrayList<>();
        boolean t=true;
        // int j;
        for(int i=0;i<x.length();i++){
            
            if(x.charAt(i)=='{'){
                l.add('{');
            }else if(x.charAt(i)=='('){
                l.add('(');
            }else if(x.charAt(i)=='['){
                l.add('[');
            }else if(x.charAt(i)=='}'){
                if(l.size()<1){
                    t=false;
                    break;
                }else if(l.get(l.size()-1)=='{'){
                    l.remove((l.size()-1));
                }else{
                    t=false;
                    break;
                }
            }else if(x.charAt(i)==')'){
                if(l.size()<1){
                    t=false;
                    break;
                }else if(l.get(l.size()-1)=='('){
                l.remove((l.size()-1));
                }else{
                    t=false;
                    break;
                }
            }else if(x.charAt(i)==']'){
            if(l.size()<1){
                    t=false;
                    break;
                }else if(l.get(l.size()-1)=='['){
                l.remove((l.size()-1));
                }else{
                    t=false;
                    break;
                }
            }
            // System.out.println(x.charAt(i));
            // System.out.println(l.size());
            // System.out.println(l);
            // System.out.println(l.get(l.size()-1));
    }
        // System.out.println("hi"+l);
        if(l.size()>0){
            t=false;
        }
        return t;
    }
}
