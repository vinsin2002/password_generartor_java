import java.io.*;
class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String Capsa[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String Smasa[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String symbols[] = {"!","@","#","$","%","^","&","*","(",")"};
    String nums[] = {"1","2","3","4","5","6","7","8","9","0"};
    System.out.println(" -------WELCOME TO VINSIN PASSWORD GENERATOR---------");
    System.out.println("**remember the longer you choose more time it will take to generate**");
    System.out.println(" Enter 1 for 8 digit password ");
    System.out.println(" Enter 2 for 16 digit password ");
    System.out.println(" Enter 3 for 32 digit password ");
    System.out.println(" Enter 4 for 64 digit password ");
    System.out.println(" Enter 5 for 128 digit password ");
    System.out.println(" Enter 6 for 1024 digit password <---- Mega");
    int check = Integer.parseInt(br.readLine());
    if( check == 1)
    {
      pass8(Capsa,Smasa,symbols,nums);
    }
    else if(check == 2)
    {
      pass16(Capsa,Smasa,symbols,nums);
    }
    else if(check == 3)
    {
      pass32(Capsa,Smasa,symbols,nums);
    }
    else if(check == 4)
    {
      pass64(Capsa,Smasa,symbols,nums);
    }
    else if(check == 5)
    {
      pass128(Capsa,Smasa,symbols,nums);
    }
    else if(check == 6)
    {
      pass1024(Capsa,Smasa,symbols,nums);
    }
    else
    {
      System.out.println("Wrong password");
    }
  }
  public static void pass8(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i <8;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
  public static void pass16(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i <16;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
  public static void pass32(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i <32;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
  public static void pass64(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i <64;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
  public static void pass128(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i <128;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
    public static void pass1024(String Capsa[],String[] Smasa,String[] symbols,String[] nums)
  {
    String s = "";
    for(int i = 0 ; i < 1024;i++)
    {
      int k = (int)(Math.random()*4);
      if(k == 0)
      {
        s = s +Capsa[((int)(Math.random()*Capsa.length))];

      }
      else if(k == 1)
      {
        s = s+Smasa[((int)(Math.random()*Smasa.length))];
      }
      else if(k == 2)
      {
        s = s+symbols[((int)(Math.random()*symbols.length))];
      }
      else if(k == 3)
      {
        s = s+nums[((int)(Math.random()*nums.length))];
      }
    }
    System.out.println(s);
  }
}
