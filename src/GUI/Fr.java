package GUI;

import java.io.*;

public class Fr {
    public static void main(String[] args) {
        try{
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("one.txt"));
            bufferedWriter.write("12\n");
            bufferedWriter.write("13");
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileReader fr= new FileReader("one.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);

            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("sum2.txt"));

//            bufferedReader.read();
            int sum=0;
            String line="";
            while((line=bufferedReader.readLine())!=null){
                sum+=Integer.parseInt(line);

            }
            bufferedWriter.write(String.valueOf(sum));
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedReader.close();
        }catch (IOException e){}
    }
}
