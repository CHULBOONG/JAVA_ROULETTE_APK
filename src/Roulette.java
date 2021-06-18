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
              System.out.println("총 아이템 갯수 : " + count);
              //System.out.println("몇줄인지 확인 : " + count); 메모장 줄 확인
          }catch(FileNotFoundException fnfe){
          }catch(IOException ioe){}
      }
    
//    void WriteFile() {
//        File file = new File("itemList.txt");
//        FileWriter writer = null;
//        String item;
//        try {
             //여기서 룰렛에 넣을 목록 받기
    
//            // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.
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
    
    void iteminput(){    // 배열에 아이템을 넣는다.
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
        System.out.println("당첨된 것 : " + nameArray[ran]);
    }
 
    public static void main(String[] args){
    	Roulette kmc = new Roulette();
        kmc.iteminput();
        kmc.ranpick();
    }
}

    
    
    
