package be.kapture.intixtest;

import java.io.*;

public class FileReaderFunctions {
    private String output;
    private String fileName;

    FileReaderFunctions(String fileName) {
        this.fileName = fileName;
    }

    void readLines(){
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String line;
            StringBuilder output = new StringBuilder();
            while((line= br.readLine())!= null){
                output.append(line);
            }
            this.output=output.toString();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    void addLines(String input){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName, true))){
            writer.append(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        readLines();

    }

    void removeline(String line){

    }

    String getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return  "output='" + output + '\'' ;
    }
}
