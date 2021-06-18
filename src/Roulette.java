import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Roulette {
    FileReader FR;
    BufferedReader BR;
    
    String fileName = "itemList.txt";
    String line;
    int count , item_number;
    String nameArray[];
 

    Roulette(){
    	  try{
              FR = new FileReader(fileName);
              BR = new BufferedReader(FR);
              while((line = BR.readLine()) != null){
                  if(line.length() != 0){
                      line = line.trim();
                      count++;
                  }
              }
              System.out.println("�� ������ ���� : " + count);
              //System.out.println("�������� Ȯ�� : " + count); �޸��� �� Ȯ��
          }catch(FileNotFoundException fnfe){
          }catch(IOException ioe){}
      }
    
//    void WriteFile() {
//        File file = new File("itemList.txt");
//        FileWriter writer = null;
//        String item;
//        try {
             //���⼭ �귿�� ���� ��� �ޱ�
    
//            // ���� ������ ���뿡 �̾ ������ true��, ���� ������ ���ְ� ���� ������ false�� �����Ѵ�.
//            writer = new FileWriter(file, true);
//            writer.write(item);
//            writer.flush();
//            
//            System.out.println("DONE");
//        } catch(IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(writer != null) writer.close();
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//    }
    
    void iteminput(){    // �迭�� �������� �ִ´�.
        try{
        	FR = new FileReader(fileName);
        	BR = new BufferedReader(FR);
            nameArray = new String[count];
            while((line = BR.readLine()) != null){
                if(line.length() != 0){
                    line = line.trim();
                    nameArray[item_number] = line;
                    //System.out.println(nameArray[i]);
                    item_number++;
                }
            }
        }catch(FileNotFoundException fnfe){
            System.out.println(fileName + " : NOT FOUND");
        }catch(IOException ioe){}
    }
 
    void ranpick(){
        Random random = new Random(); 
        int ran = random.nextInt(count);
        System.out.println("��÷�� �� : " + nameArray[ran]);
    }
 
    public static void main(String[] args){
    	Roulette kmc = new Roulette();
        kmc.iteminput();
        kmc.ranpick();
    }
}

    
    
    
