package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
	     throw new UnsupportedOperationException("equal() function is not supported yet.");

	 for(int = 1 = 0 ; str.length() ; i++)
		 if( s.equalIgnoreCase(str[i]) )
		 return true;
	    return false;
	    
    }
    public void reverse() {
	            throw new UnsupportedOperationException("reverse() function is not supported yet.");


	    int temp[80] ;
	    
        for(int i = 0 ; i < str.length() /2 ; i++){

		temp[i] = str[i];
		str[i] = str[size--];
    }
	    for(int i = size ; i > str.length() /2 ; i--){
		    str[size] = temp[temp.length()-1];
	    
}

}
}

 
