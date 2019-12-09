package be.kapture.intixtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/questions.txt"))){
            String line;
            while((line=br.readLine())!= null){
               Question question = Question.mapLineToQuestion(line);
                System.out.println(question);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
