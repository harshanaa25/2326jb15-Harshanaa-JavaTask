package Day2;

import java.util.Scanner;

public class Task4 {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence:");
String s=sc.nextLine();
String[] words=s.split("\\s+");
int wordCount=words.length;
int charCount=s.length();
String reversed=new StringBuilder(s).reverse().toString();
String longestword="";
for (String word:words)
{
if(word.length()>longestword.length()){
longestword=word;
}
}
System.out.println("wordcount:"+wordCount);
System.out.println("character count:"+charCount);
System.out.println("Reversed sentence:"+reversed);
System.out.println("longest word: "+longestword);
sc.close();
}
}
