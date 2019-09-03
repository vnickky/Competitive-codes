import java.lang.*;
import java.util.*;
class lcp{
public String longestcommonprefix(String[] str)
{
for(int i=0;i<str.length-1;i++)
{
	String temp="";
	if(str[i].length()>str[i+1].length())
	{
		
		for(int j=0;j<str[i+1].length();j++)
		{
			if(str[i].charAt(j)==str[i+1].charAt(j))
			{
			temp=temp.concat(Character.toString(str[i+1].charAt(j)));
			}
			else
			{
			break;
			}
		}
	}
	else
	{
		
		for(int j=0;j<str[i].length();j++)
		{
			if(str[i].charAt(j)==str[i+1].charAt(j))
			{
			temp=temp.concat(Character.toString(str[i+1].charAt(j)));
			}
			else
			{
			break;
			}
		}

	}
str[i+1]=temp;
}
return str[str.length-1];
} 

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter strings");
String[] str=sc.nextLine().split(" ");
lcp obj=new lcp();
String prefix=obj.longestcommonprefix(str);
System.out.println(prefix);
}
}
