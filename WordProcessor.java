package SSD;

public class WordProcessor extends Object implements Counter
{


    @Override
    public int countWords(String sentence) {

     String[] words =  sentence.split("");
     return words.length;
    }


    @Override
    public int countLetters(String sentence) {
        return 0;
    }

    @Override
    public int getLength(String sentence) {
        return 0;
    }
}
