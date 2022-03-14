package com.dhiraj.java7;

public class CatchMultipleExceptionsInCatchBlock {
	public static void main(String[] args) {
		//Do some processing which throws NullPointerException; I am sending directly
		try
		{
		       //Do some processing which throws NullPointerException; I am sending directly
		       throw new NullPointerException();
		}
		 
		//You can catch multiple exception added after 'pipe' character
		catch(NullPointerException | IndexOutOfBoundsException ex)
		{
		       throw ex;
		}	
	}
    
}
