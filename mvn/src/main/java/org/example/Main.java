package org.example;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import java.util.HashMap;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args)
    {
       /* File textFile=new File("src/main/resources/text.txt");
        String fileContent=new String();
        try {
            fileContent=FileUtils.readFileToString(textFile, (Charset) null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String noPunct=fileContent.replaceAll("\\p{Punct}","");
        String[] words=noPunct.split(" ");
        HashMap<String,Integer> wordCount= new HashMap<String,Integer>();
        for(String word:words){
           if (wordCount.containsKey(word)){
               wordCount.put(word,wordCount.get(word)+1);
            }
           else{
               wordCount.put(word,1);
           }
        }

        File wordcount=new File("src/main/resources/wordcount.txt");


        for(String word:wordCount.keySet()){
            try {
                FileUtils.write(wordcount,word+": "+wordCount.get(word)+"\n",true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
        IEven even=(Integer a)->{return a%2==0;};
        IOdd odd=(Integer b)->{return b%2==1;};
        ITalk talk=()->{return "bla bla";};

    }
}