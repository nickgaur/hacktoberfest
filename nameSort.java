
import java.io.*;
import java.lang.*;
class nameSort
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of names to be entered");
        int n=Integer.parseInt(br.readLine());
        String[] names = new String[n];
        System.out.println("enter "+n+" names");
        for (int i=0;i<names.length;i++)
        {
            names[i] = br.readLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(names[j-1].compareToIgnoreCase(names[j])>=0)
                {
                    //swap elements  
                    String temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }

            }
        }
        System.out.print("\n");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
